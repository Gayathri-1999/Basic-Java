package oopspackage;

abstract class Car
{
	abstract public void acceleration();
	abstract public void speedlimit();
	public void colour()
	{
		System.out.println("white");
	}
}

class maruti extends Car{

	@Override
	public void acceleration() {
		System.out.println("maruti acceleration");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("speedlimit maruti");
		
	}

}
class wagnor extends Car{

	@Override
	public void acceleration() {
		System.out.println("wagnor acceleration");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("wagnor speedlimit");
		
	}
	
}


public class Abstractclass {

	public static void main(String[] args) {
		maruti ob=new maruti();
		ob.acceleration();
		ob.speedlimit();
		
		wagnor ob1= new wagnor();
		ob1.acceleration();
		ob1.speedlimit();

	}

}
