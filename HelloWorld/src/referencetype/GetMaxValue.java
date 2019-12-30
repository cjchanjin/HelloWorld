package referencetype;

public class GetMaxValue {
	public static void main(String[] args) {
		int a = 5, b = 8, c = 3;
		int temp = 0;
		
		System.out.println("정렬 전: " + a +", "+ b+ ", " + c);
		
		if(a<b)
		{
			temp=a;
			a=b;
		}
		if(c<temp)
		{
			b=temp;
		}
		System.out.println("정렬 후: " + a +", "+ b+ ", " + c);
	}
}
