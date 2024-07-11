package pkg;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("-------arithmetic operator----------");
      int a=30,b=20;
      System.out.println("a+b="+(a+b));
      System.out.println("a-b="+(a-b));
      System.out.println("a*b="+(a*b));
      System.out.println("a/b="+(a/b));//quotient
      System.out.println("a%b="+(a%b));//reminder
      
      System.out.println("---------assignment operator------------");
      int c=b;
      System.out.println("a+=b");//a=a+b
      System.out.println("a-=b");//a=a-b
      
      System.out.println("-----------------Relational Operator");
      int v1=20, v2=10;
      System.out.println(v1==v2); //false
      System.out.println(v1>v2); //true
      System.out.println(v1<v2); //false
      System.out.println(v1>=v2); //true
      System.out.println(v1<=v2);  //false
      
      System.out.println("-----------Logical operators----------");
      // A            B          A&B    A||B           !A        !B
      // T            T           T       T             F         F
      // T            F          F        T             F         T
      // F            T          F        T             T         F
      // F            F          F        F             T         T
       
      String username="abc";
      String   password="Abc123";
      System.out.println(username=="abc" && password=="Abc123"); //true
      System.out.println(username=="abc" || password=="Abc123"); //true
      System.out.println(!(username=="abc"));  //false
      
      System.out.println("--------------------unary operator-----------");
      // ++    ++1   1++    --    --1    1--
      int v3=5;
      System.out.println(v3++); //5
      System.out.println(v3);  //6
      System.out.println(++v3); //7
      
     System.out.println("---------ternary operator-------");
     //   variable= condition?exp1:exp2
     String ans= v1>v2?"v1 is grater":"v2 is greater";
      System.out.println(ans);
      
	}

}
