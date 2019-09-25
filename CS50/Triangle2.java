import java.util.Scanner;


public class Triangle2
{
    public static void main(String[] arg) 
	{
      Scanner in=new Scanner(System.in);
	  System.out.print("Input a: ");
	  int a=in.nextInt();
	  System.out.print("Input b: ");
	  int b=in.nextInt();
	  System.out.print("Input c: ");
	  int c=in.nextInt();
	  in.close();
	  
	  
        System.out.println("a="+a+" b="+b+" c="+c);
        if (a+b<c||a+c<b||b+c<a||a<=1||b<=1||c<=1)
		{ 
			System.out.println("NOT A TRIANGLE");
		}
		else 
		{ 
			System.out.println("It is a TRIANGLE");
		}
			
    }
}