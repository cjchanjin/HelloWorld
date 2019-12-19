package conditions;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
//		for (int m =2; m <= 9; m++)
//		{ 
//			System.out.println("***" + m + "단 ***");
//			
//			System.out.println();
//			for (int n=1; n<=9; n++)
//			{
//				
//				System.out.print(m + " X " + n + " = " + (m*n));
//				
//			}
//		}

//		for (int m =2; m <= 9; m++)
//		{ 
//			System.out.println();
//			for (int n=1; n<=9; n++)
//			{
//				
//				System.out.print(n + " X " + m + " = " + (m*n) + "\t");
//			}
//		}
		for (int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("  ★  ");
			}
			System.out.println();
		}
		
	}
}
