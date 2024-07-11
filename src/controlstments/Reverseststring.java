package controlstments;

public class Reverseststring {

	public static void main(String[] args) {
		  
		
		String s= "abc";
		String R="";
		char ch;
		for (int i = 0; i < s.length(); i++)
		{
			 ch= s.charAt(i);
			 R= ch + R;
			}
		System.out.println("Reverdsed string="+R);
	}

}
