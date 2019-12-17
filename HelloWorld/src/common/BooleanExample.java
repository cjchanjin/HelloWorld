package common;

public class BooleanExample {
	public static void main(String[] args) {
//		boolean trueOrFalse = false; // true
		boolean trueOrFalse = 100 >20;
		int var1 = 10;
		trueOrFalse = var1 >15;
		
		for (int i = 0; i < 10; i++) {
		var1++;
			
//		if (var1 < 5)
		trueOrFalse = var1 > 15;
		if (trueOrFalse)
			System.out.println(var1 + "=> 참일 경우에 ");
		else
			System.out.println(var1 + "=> 거짓일 경우에");
		}
	 System.out.println("End of Program");
	}
}
