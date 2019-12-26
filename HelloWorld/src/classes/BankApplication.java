package classes;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("================");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				createAccount();
			}else if(selectNo ==2) {
				accountList();
			}else if (selectNo==3) {
				deposit();
//			}else if (selectNo ==4) {
//				withdraw ();
			}else if (selectNo ==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
	}
	public static void createAccount() {
		Account creAcc = new Account();
		
		System.out.println("계좌번호를 입력하세요.");
		String ano = scanner.nextLine();
		creAcc.setAno(ano);
		
		System.out.println("계좌주를 입력하세요.");
		String owner = scanner.nextLine();
		creAcc.setOwner(owner);
		
		System.out.println("초기입금액을 입력하세요.");
		int balance = scanner.nextInt();
		creAcc.setBalance(balance);
	
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = creAcc;
				break;
			}
		}
		
	}
	public  static void accountList() {
		for (Account a : accountArray) {
			if (a != null)
				System.out.println(a);
		}
	}
	public static void deposit() {
		System.out.print("예금액");
		int deposit = scanner.nextInt();
		balance = balance+deposit;
	}
	
	
	
	
	
	
	
	
	
}
