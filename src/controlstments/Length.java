package controlstments;

public class Length {

	public static void main(String[] args) {
		String str= "Gayathri";
		int a =0;
		for(int i = 0; i < str.length(); i++) 
        {    
            if(str.charAt(i) != ' ')    
                a++;    
        }                
   System.out.println("Total no of characters="+a);
	}

}
