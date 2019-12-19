package conditions;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i =1; i<=10; i++)
		{
			if (i%2 ==1)
			{
				continue;		//if조건에 따라서 continue 만나면, 처리 안하고 다음으로 넘어감.(해당 조건에 부합시 건너뛴다)
			}
//			System.out.println(i);
			System.out.print(i + "\t");
		}
	}
}
