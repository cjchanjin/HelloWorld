package referencetype;

public class ArrayExample {
	public static void main(String[] args) {
		// 배열 : 변수가 너무 많이 필요할때
//		int[] intAry = { 0, 1, 2, 3, 4 }; // int intAry[] 이렇게도 가능
//		System.out.println(intAry[2]);

//		int sum = 0;
//		for (int i = 0; i <= 4; i++) 
//		{
//			sum += intAry[i];
//		}
//		System.out.println(sum);
		
		/////////////////////////////////////////////////
		
//		int sum = 0;
//		int sum1 = 0;
//		for(int i = 0; i<=4; i++)
//		{
//			if( i % 2 == 1)
//				sum += intAry[i];
//			else
//				sum1 += intAry[i];
//		}
//		System.out.println("홀 수의 합: " + sum);
//		System.out.println("짝 수의 합: " + sum1);
		
		///////////////////////////////////////////////////
//		
//		for (int i = 0; i <=4; i++)
//		{
//			System.out.print(intAry[i]);
//		}
//		/////////////////////////////////////////////////// 배열은 0번째 부터 시작한다
		
//		intAry[2] = 30;
//		System.out.println(intAry[2]);
		
//		///////////////////////////////////////////////////
		
		String[] strAry = {"hello", "nice", "good",	"wonderful"};
		System.out.println(strAry[0]);
		System.out.println(strAry[1]);
		System.out.println(strAry[2]);

		String[] strAry1 = { "hello", "nice", "good", "wonderful" };
		for (int i = 0; i < 4; i++)
			System.out.println(strAry1[i]);

//		///////////////////////////////////////////////////
//		int [] num = new int[25];
//		num[0] = 1;
//		num[1] = 2;
//		num[2] = 3;
//		num[3] = 4;
//		num[4] = 5;
//		
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.println(num[4]);
		
//		int [] num = new int [25];
//		int var = 0;
//		for(int i = 0; i<=25; i++)
//		{
//			var = i;
//			System.out.print(var + "\t");
//			if( i % 5 == 4)
//				System.out.println();
//		}
		
//		///////////////////////////////////////////////////
		
		int [] num = new int[25];
		int summary = 0;
		double avg = 0;
				
		for(int i =0; i<=25; i++)
		{
			summary += i;
		}			
			avg = ((double) summary) / 25; 
			System.out.println(summary);
			System.out.println(avg);
		
		
		
		
		
		
		
	}
}
