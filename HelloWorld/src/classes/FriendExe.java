package classes;

import java.util.Scanner;

public class FriendExe {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run)
		{
			System.out.println("================");
			System.out.println("1.입력 | 2.조회 | 3.리스트 | 4.종료");
			System.out.println("================");
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
	private static void inPutData()
	{
		boolean run = true;
		while(run)
		{
		System.out.println("================");
		System.out.println("구분을 선택하세요. 1)대학동창 2)회사동료 3)그외 4)메인메뉴");
		System.out.println("================");
		System.out.print("선택> ");
		int selectNo = scanner.nextInt();
		scanner.nextLine();  //엔터키 소진
		
		if(selectNo ==1){
			Univer();
		}else if (selectNo ==2)	{
			Coop();
		}else if (selectNo ==3) {
			etc();
		}else if (selectNo ==4) {
			run = false;
		}
	}
	System.out.println("메인메뉴로 이동");
	
	private static void Univer()
	{
		System.out.println("이름을 입력하세요.");
		String uf.getName = scanner.nextLine();
		
		System.out.println("연락처를 입력하세요.");
		String uf.getPhone = scanner.nextLine();
		
		System.out.println("학교를 입력하세요.");
		String uf.getUniv = scanner.nextLine();
		
		System.out.println("전공을 입력하세요.");
		String uf.getMajor = scanner.nextLine();
		
	}
	
	
	
	}
}

