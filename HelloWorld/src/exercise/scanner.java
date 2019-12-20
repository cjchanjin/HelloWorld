package exercise;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		boolean run = true;
		int score = 0, menu = 0, sum = 0, avg = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (run)
		{
			System.out.println("--------------------------------");
			System.out.println("1. 입력 2. 합계 3. 평균 4. 종료");
			System.out.println("--------------------------------");
			System.out.println("선택>");
			menu = scanner.nextInt();
			scanner.nextLine();
			if (menu ==1)
			{
				System.out.println("1.입력>");
				score = scanner.nextInt();
				score = score + 0;				
			}
			else if(menu ==2)
			{
				System.out.println("2. 합계>");
				System.out.println(score+score);
			}
			else if(menu ==3)
			{
				System.out.println("3. 평균>");
			}
			else if(menu ==4)
			{
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
