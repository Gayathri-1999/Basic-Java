package oopspackage;

public class Acessmodifier1 {
	
	private int a= 5;
	int b=10;
	protected int c=20;

	public static void main(String[] args) {
		
		Acessmodifier1 ob= new Acessmodifier1();
		System.out.println(ob.a);
		System.out.println(ob.c);
	}

}
