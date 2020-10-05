package services;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.dao.RegioniDao;
import database.model.Regione;
import web.util.HtmlEpilogue;
import web.util.HtmlPrologue;

/**
 * Servlet implementation class ElencoRegioni
 */
@WebServlet("/ElencoRegioni")
public class ElencoRegioni extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ElencoRegioni() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process("GET", request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process("POST", request, response);
	}

	protected void process(String metodo, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.append(HtmlPrologue.prologue("Elenco Regioni"));
		pw.append("Elenco Regioni con "+metodo);
		pw.append("</h3>");
		//Carico le Regioni
		RegioniDao dao = new RegioniDao();
		List<Regione> regioni = dao.findAll();
		
		//Creo la Tabella
		pw.append("<table border=1><tr><th>ID</th><th>Nome</th><th>Latitudine</th><th>Longitudine</th>");
		
		//Lavoro su singola regione
		regioni.forEach(regione -> elenca(pw, regione));
		
		//chiudo tabella
		pw.append("</table>");
		
		pw.append("<br>Served at: ").append(request.getContextPath());
		pw.append(HtmlEpilogue.epilogue());
	}
	
	protected void elenca(PrintWriter pw, Regione regione) {
		pw.append("<tr><td>"+regione.getId()+"</td><th>"+regione.getNome()+"</th><td>"+regione.getLatitudine()+"</td><td>"+regione.getLongitudine()+"</td></tr>");
	}

}
