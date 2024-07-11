package oopspackage;

class Father 
{
	public void fathermethod()
	{
		System.out.println("father");
		
	}
}

class Son extends Father
{
	public void sonmethod()
	{
		System.out.println("son");
	}
}

class Grandson extends Son
{
	public void Grandsonmethod()
	{
		System.out.println("grandson");
	}
}


public class Multilevelinheritance {

	public static void main(String[] args) {
		
	}

}
