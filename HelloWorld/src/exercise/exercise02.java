package exercise;

import java.util.Scanner;

public class exercise02 {
	public static void main(String[] args) {
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);
//		System.out.println(z);
//		System.out.println(x + " , " + y);

		// exerciese 4-03
		int sum = 0;
		for(int i =1; i<=100; i++)
		{
			if( i % 3 == 0)
				sum += i;
		}
		System.out.println(sum);
	
		// 4-04
//		int num1, num2;
//		boolean run = true;
//		while(run)
//		{
//			num1 = (int) (Math.random()*6) +1;
//			num2 = (int) (Math.random()*6) +1;
//			System.out.println("("+num1+", " + num2 + ")");
//			if (num1 + num2 ==5)
//			{
//				run = false;
//			}
//		}
//		System.out.println("프로그램 종료");

		// 4-05
//		for (int x = 1; x <= 10; x++) {
//			for (int y = 1; y <= 10; y++) {
//				if ((4 * x) + (5 * y) == 60) {
//					System.out.println("(" + x + ", " + y + ")");
//				}
//			}
//		}
		// 4-07
//		boolean run = true;
//		int balance = 0, menu = 0, amt = 0; //balance = 잔액, amt = 예금액, 
//		Scanner scanner = new Scanner(System.in);  //scanner 에러시 import scanner 클릭  ' import java.util.Scanner;'
//		
//		while(run)
//		{
//			System.out.println("----------------------------");
//			System.out.println("1.예금 2.출금 3.잔액 4.종료");
//			System.out.println("----------------------------");
//			System.out.println("선택>");
//			menu = scanner.nextInt();
//			scanner.nextLine(); //엔터 소진 시
//			
//			if(menu==1)
//			{
//				System.out.println("예금액>");
//				amt = scanner.nextInt();
//				balance = balance + amt;
//			}
//			else if (menu ==2)
//			{
//				System.out.println("출금액>");
//				amt = scanner.nextInt();
//				balance = balance - amt;
//			}
//			else if (menu ==3)
//			{
//				System.out.println("잔고>" + balance);				
//			}
//			else if (menu ==4)
//			{
//				run = false;
//			}
//		}
//		System.out.println("프로그램 종료");
	}
}		
		