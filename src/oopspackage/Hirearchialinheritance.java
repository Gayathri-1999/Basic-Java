package oopspackage;


class Animal
{
	public void animalmethd() {
		System.out.println("animalmethd");
	}
}

class Lion extends Animal
{
	public void lionmethd()
	{
		System.out.println("lion");
	}
}
class Tiger extends Animal
{
	public void tigermethd()
	{
		System.out.println("Tiger");
	}
}
public class Hirearchialinheritance {

	public static void main(String[] args) {
		Tiger t= new Tiger();
		t.tigermethd();
		t.animalmethd();
		
		Lion l= new Lion();
		l.lionmethd();
		l.animalmethd();
	}

}
