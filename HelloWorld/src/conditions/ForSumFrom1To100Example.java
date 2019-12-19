package conditions;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
//		for(int i=1; i<=100; i++1;) 
//		{
//			sum += i;
//		}
//		
//		System.out.println("1~100 합 : " + sum);
	
		for(int i=1; i<=100; i++) 
		{
			if(i%2==1)
				sum1 += i; //홀수 합 
			else
				sum2 += i; //짝수 합
			
			sum3 += i;	//1~100 합
		}
		
		System.out.println("1~100 합 : " + sum1);
		System.out.println("1~100 합 : " + sum2);
		System.out.println("1~100 합 : " + sum3);
	}
}
