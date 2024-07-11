package oopspackage;

interface car1{
	public void acceleration();
	public void speedlimit();
}

interface carshop{
	
}
class kia implements car1,carshop
{

	@Override
	public void acceleration() {
	System.out.println("kia acceleration");
	}

	@Override
	public void speedlimit() {
		System.out.println("kia speedlimit");
		
	}
	
}
class mahindra implements car1{

	@Override
	public void acceleration() {
		System.out.println("mahindra acceleration");
	}

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		
	}
}



	


public class Interface {

	public static void main(String[] args) {
		car1 ob = new kia();
		ob.acceleration();
		ob.speedlimit();
	}

}
