package oopspackage;

public class Methodoverloading {

	public static void main(String[] args) {
		

	}
	
	
	public void add()
	{
		int a=20,b=30;
		int c= a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b)
	{
		int c= a+b;
		System.out.println("c="+c);
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println("c="+c);
	}
	public void add(int  a,double b)
	{
		double c=a+b;
		System.out.println("c="+c);
	}

}
