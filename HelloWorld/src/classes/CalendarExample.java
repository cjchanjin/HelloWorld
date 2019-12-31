package classes;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(2020, 1, 1); //날짜 기본 정보 설정 (2020년 2월 1일) -> 설정 안하면 오늘날짜 기준으로 잡힘
		
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + cal.get(Calendar.MONTH)); //0부터 1월이 시작해서 12월이 11로 찍힌다
		System.out.println("일 : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("마지막 일 : " + cal.getActualMaximum(Calendar.DAY_OF_MONTH)); //해당월의 제일 마지막(getactualmaximum)
		System.out.println("오늘의 요일 : " + cal.get(Calendar.DAY_OF_WEEK)); //오늘날짜의 요일  (3 = 일월화)
		
		createCal(2020, 2);
		
		System.out.println();
		System.out.println();
		
		String feb = cal.get(Calendar.MONTH)+1+"월";
		System.out.printf("%16s", feb);
		System.out.println();
		System.out.println("              " + (cal.get(Calendar.MONTH)+1)+"월" + "                 ");
		System.out.println("=====================");
		
	}
	
	public static void createCal(int year, int month)
	{
		
	}
}
