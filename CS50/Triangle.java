public class Triangle
{
    public static void main(String[] arg) {
      int a =5,b=26,c=3;
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