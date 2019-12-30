package exercise;

import java.util.Scanner;

public class TryFriendExample {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run)
		{
			System.out.println("===============================");
			System.out.println("1.입력 | 2.조회 | 3.리스트 | 4.종료");
			System.out.println("===============================");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			scanner.nextLine();  //엔터키 소진
			
			if(selectNo ==1) {
				inPutData();
			}else if(selectNo ==2) {
				search();
			}else if (selectNo==3) {
				list();
			}else if (selectNo ==4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
		
	}
}
