package services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.util.HtmlEpilogue;
import web.util.HtmlPrologue;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(
		description = "Test Servlet per Web Application", 
		urlPatterns = { 
				"/Hello", 
				"/Test", 
				"/T"
		})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		pw.append(HtmlPrologue.prologue("Hello Servlet"));
		pw.append(metodo);
		pw.append("</h3>");
		pw.append(" ==> Hello l'applicazione sta funzionando ");
		pw.append("Served at: ").append(request.getContextPath());
		pw.append(HtmlEpilogue.epilogue());
	}

}
