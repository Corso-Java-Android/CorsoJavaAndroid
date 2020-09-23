import java.util.Scanner;

public class ContoCorrente 
{
	//ATTRIBUTI
	//OMETTENDO IL CAMPO PRIVATO, PREVALE IL PUBLIC
	private String titolareConto;
	private double saldo;
	private int numeroConto;

	public ContoCorrente(String titolareConto, double saldo, int numeroConto) 
	{
		this.titolareConto = titolareConto; 
		this.saldo = saldo;
		this.numeroConto = numeroConto;		
	}

	public String GetTitolareConto()
	{
		return titolareConto;
	}
	
	public double GetSaldo()
	{
		return saldo;
	}
	
	public double GetNumeroConto()
	{
		return numeroConto;
	}
	
	public void SetTitolareConto(String titolareConto)
	{
		this.titolareConto=titolareConto;
	}

	public void SetSaldo(double saldo)
	{
		this.saldo=saldo; 
	}
	
	public void SetNumeroConto(int numeroConto)
	{
		this.numeroConto=numeroConto; 
	}

	public double AggiungiSaldo(double n)
	{
		saldo = saldo + n;
		return n;
	}
	
	public double TogliSaldo(double n) 
	{
		saldo = saldo - n;

		if(saldo<0)
			return -1;
		return saldo;
	}
	
	public String toString()
	{
		return "Titolare del conto è: " + titolareConto + "\n" + 
   			   "Il saldo è: " + saldo + "\n" + 
			   "Il numero del conto è: " + numeroConto;
	}
	
	
	public static void main(String[] args) 
	{

		ContoCorrente c = new ContoCorrente("Gio", 5.0, 1);
		
		System.out.println("inserire l'operazione da fare: ");
		Scanner scelta = new Scanner(System.in);
		int s = scelta.nextInt();
		
		if(s==1)
		{	
			Scanner ii = new Scanner(System.in);
			int importo = ii.nextInt();
			c.AggiungiSaldo(importo);
			System.out.println("La somma del saldo: " + c.GetSaldo());
			ii.close();
		}
		else if(s==2)
		{
			Scanner ll = new Scanner(System.in);
			int importo = ll.nextInt();
			System.out.println("La sottrazione del saldo: " + c.TogliSaldo(importo));		
			ll.close();
		}
		scelta.close();
		
//		c.SetTitolareConto("Giovanni Battista");
//		c.SetNumeroConto(198);
//		c.SetSaldo(15.12);		
//		System.out.println(c.GetTitolareConto());
//		System.out.println(c.GetNumeroConto());
//		System.out.println(c.saldo);
		//System.out.println(c.toString()); 				
	}
}
