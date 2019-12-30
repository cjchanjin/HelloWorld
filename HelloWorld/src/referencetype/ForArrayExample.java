package referencetype;

public class ForArrayExample {
	public static void main(String[] args) {
		int sum = 0;
		for(int i= 0; i<=10; i++)
		{
			sum += i;
		}
		System.out.println(sum);
	
		int sum2 = 0;
		int i = 1;
		while(i<=10)
		{
			sum2 += i;
			i++;
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for(int k =0; k<=100; k++)
		{
			if(k%3 ==0)
				sum3 += k;
		}
		System.out.println(sum3);
		
		int var7 = 0;
		for(int q=0; q<=100; q++)
		{
			if(q%7 ==0)
			{
				var7 = q;
//			System.out.println(var7);
			}
//			System.out.println(var7);
		}
		System.out.println(var7);
		
				
		while(true)
		{
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num==5)
				break;
//			System.out.println(num);
		}
		System.out.println("5출력 완료");
		
		
	}
}
