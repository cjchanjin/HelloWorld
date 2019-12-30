package exercise;

public class exercise03 {
	public static void main(String[] args) {
		int score = 85;
		String result = (!(score>90))? "가" : "나"; // ! 논리 부정 -> 반대 결과값
		System.out.println(result);
	}
	
//	public static void exam () { 
//		int value = 356;
//		System.out.println(value -= value % 100);
//		//value = value - (value%100);
//		//value = (value / 100) * 100
//	}
//	public static void exam () { 
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		double area = ((lengthTop + lengthBottom) / 2.0) * height;
//		System.out.println(area);
//		
//	}
//	public static void exam () { 
//		int x = 10;
//		int y = 5;
//		
//		System.out.println(( x > 7) && (y <= 5));
//		System.out.println( x%3 == 2) || ( y%2 != 1 ));
//				
//	}
//	public static void exam () { 
//		double x = 5.0;
//		double y = 0.0;
//		
//		double z = x % y;
//		
//		if(double.isNaN(z))	{
//			System.out.println("~");
//			
//		}
//		
//	}
}
