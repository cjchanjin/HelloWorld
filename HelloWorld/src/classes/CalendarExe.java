package classes;

public class CalendarExe {
	public static void main(String[] args) {
		//해당월의 날짜 수 , 시작 요일 계산
		int month = 11;
		System.out.println(month + "월은 " + getMaxDate(month) + "일 까지다." );
		System.out.println(month + "월은 " + getFirstDayofMonth(month)+ "요일로 시작한다.");
		
		String[] weeks = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		for(int i=0; i<weeks.length; i++)
		{
			System.out.print(" " + weeks[i]);
		}
		System.out.println();
		System.out.println("============================");
		
		
		int spaceCnt = 0;
		for(int i = 1; i<getFirstDayofMonth(month); i++)
		{
			System.out.println("  ");
			spaceCnt++;
		}
		
		//7일 단위로 출력
		for(int i = 1; i <=getMaxDate(month); i++)
		{
//			System.out.print(i+ ""));
			System.out.printf("%3d", i);
			if(i%7 == 0)
				System.out.println();
		}
		
	}
	
	//월 시작 요일 계산
	public static int getFirstDayofMonth(int month)
	{
		int result = 0;
		if(month ==9)
		{
			result = 1;
		}else if (month ==10)
		{
			result = 3;
		}else if(month ==11)
		{
			result = 6;
		}else if(month ==12)
		{
			result = 1;
		}
		return result;
	}
	
	
	//월별 날짜 수 계산
	public static int getMaxDate(int month)
	{
		int dayCnt=0;
		if(month<=7)
		{
			if(month%2 ==1)
			{
				dayCnt=31;
			}else if(month==2)
			{
				dayCnt= 28;
			}else
			{
				dayCnt=30;
			}
		}else if (month%2 ==1)
		{
			dayCnt=30;
		}else
		{
			dayCnt=31;
		}
		return dayCnt;
	}
	
	
}
