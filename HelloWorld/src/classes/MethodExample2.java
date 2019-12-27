package classes;

public class MethodExample2 {
	public static void main(String[] args) {
		double result = sum(3.3, 4.5);
		System.out.println("결과는" + result);

		int[] intAry = { 2, 3, 4, 5, 6, 7 };
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum = sum + intAry[i];
		}
		System.out.println("합계는" + sum);

		
		printString(10, "$");
		
		
	}

	public static double sum(double a, double b) // 리턴타입이 더블이고 매개값이 있는 메소드
	{
		return a + b;
	}

	public static int sum(int[] iary)
	{
		int sum = 0;
		for(int i =0; i<iary.length; i++)
		{
			sum = sum+iary[i];
		}
		return sum;
	}
	
	//*
	//**
	//***
	//****
	
	//#
	//##
	//###
	//####
	
	//5
	//55
	//555
	//5555
	
	public static void printString(int x, String str)
	{
		for(int z =0; z<x; z++)
		{
			for(int y=0; y<=z; y++) 
			{
			 System.out.print(str);
			}
			System.out.println();
		}
	}
	
	
}











