package referencetype;

public class MethodExample {
	public static void main(String[] args) {
		printStar();
		
		int s1 = sum(3, 5);
		System.out.println(s1);
		
		double s2 = divideBy(5, 3);
		System.out.println(s2);
		
		String result = printResult("박찬진");
		System.out.println(result);
		
		double result3 = calculator(8, 5, "+");
		System.out.println("8+5 는 " + result3);		
	}
	
	public static double calculator(double a, double b, String cal)
	{
		double result3 = 0;
		if(cal.equals ("+"))
		{
			result3 = a+b;
		}
		else if(cal.equals ("-"))
		{
			result3 = a-b;
		}
		else if(cal.equals ("*"))
		{
			result3 = a*b;
		}
		else if(cal.equals ("/"))
		{
			result3 = a/b;
		}
		else if(cal.equals ("%"))
		{
			result3 = a%b;
		}
		return result3;
	}
	
		
	public static int sum(int a, int b)
	{
		int result = 0;
		result = a*b;
		return result;
	}
	
	public static double divideBy(int c, int d)
	{
		double result2 = 0;
		result2 = (double)c/d;
		return result2;
	}
	
	public static String printResult(String name)
	{
		String str = "반갑습니다 " + name + "씨."; 
		return str;			
	}	
	
	public static void printStar()
	{
		System.out.println("*");
	}
}
