package controlstments;

public class Nestedif {

	public static void main(String[] args) {
		int age=15,weight=55;
		
		if (age>=18)
		{
			if(weight>=55)
			{
				System.out.println("you are Eligible");
			}
			
			else 
			{
				System.out.println("not eligible");
			}
			
		}
		else
		{
			System.out.println("not eligible for donation");
		}
	}

}
