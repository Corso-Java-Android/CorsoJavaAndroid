import java.util.Scanner;

public class Calcolatrice 
{
	private int n;
	private int m;
	
	public Calcolatrice(int n, int m) 
	{
		this.n=n;
		this.m=m;
	}
	
	public int getN()
	{
		return n;
	}

	public int getM()
	{
		return m;
	}

	public void setN(int n)
	{
		this.n=n;
	}

	public void setM(int m)
	{
		this.m=m;
	}
	
	public int somma()
	{
		return n+m;
	}

	public int sottrazione()
	{
		return n-m;
	}

	public int moltiplicazione()
	{
		return n*m;
	}

	public int divisione()
	{
		if(m!=0)
			return n/m;
		return 0;
	}
	
	public static void main(String[] args) 
	{				
		Calcolatrice c = new Calcolatrice(1, 1);

//      INSERIMENTO DA INUT
		System.out.println("inserire un numero: ");
		Scanner in1 = new Scanner(System.in);
		int n = in1.nextInt();
		
		System.out.println("inserire un numero: ");
		Scanner in2 = new Scanner(System.in);
		int m = in2.nextInt();
		
		c.setN(n);
		c.setM(m);

		System.out.println("inserire l'operazione da fare: ");
		Scanner scelta = new Scanner(System.in);
		int s = scelta.nextInt();

		if(s==1)
		{
			System.out.println("La somma è: " + c.somma());		
		}
		else if(s==2)
		{
			System.out.println("La moltiplicazione è: " + c.moltiplicazione());		
		}
		else if(s==3)
		{
			System.out.println("La sottrazione è: " + c.sottrazione());		
		}
		else if(s==4)
		{
			System.out.println("La divisione è: " + c.divisione());		
		}
		else 
		{
			System.out.println("operazione non possibile");	
		}
		
		in1.close();
		in2.close();
		scelta.close();
	}
}
