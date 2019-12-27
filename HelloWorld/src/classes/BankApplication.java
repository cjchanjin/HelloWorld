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
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			scanner.nextLine();  //엔터키 소진
			
			if(selectNo ==1) {
				createAccount();
			}else if(selectNo ==2) {
				accountList();
			}else if (selectNo==3) {
				deposit();
			}else if (selectNo ==4) {
				withdraw ();
			}else if (selectNo ==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
	}
	private static void createAccount() {
		System.out.print("계좌번호를 입력하세요.");
		String ano = scanner.nextLine();
		
		System.out.print("계좌주를 입력하세요.");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액을 입력하세요.");
		int balance = scanner.nextInt();
		scanner.nextLine();
		
		Account newAcc = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) 
			{
				accountArray[i] = newAcc;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
		
	}
	private static void accountList() 
	{
		for(int i = 0; i<accountArray.length; i++)
		{
			if(accountArray[i] == null)
			{
				break;
			}
			System.out.println(accountArray[i]); //generate tostring 기능 이용할때 출력하는법
			
//			System.out.println("계좌번호: " +accountArray[i].getAno()+ "\t" +"계좌주: " 
//								+ accountArray[i].getOwner() + "\t" +"예금액: " +accountArray[i].getBalance());
		}
	}
	
	private static void deposit() {
		System.out.println("입금할 계좌번호를 입력하십시오.");
		String ano = scanner.nextLine();
		System.out.println("입금액");
		int deposit = scanner.nextInt();
		scanner.nextLine();
		
		if(findAccount(ano)==null)
			{
			System.out.println("등록되지 않은 계좌번호입니다.");
			} else
			{
				findAccount(ano).setBalance(findAccount(ano).getBalance()+deposit);
				System.out.println("입금이 완료 되었습니다.");
			}
	}
	
	private static void withdraw()
	{
		System.out.println("출금할 계좌번호를 입력하십시오.");
		String ano = scanner.nextLine();
		System.out.println("출금액");
		int withdraw = scanner.nextInt();
		scanner.nextLine();
		
		if(findAccount(ano)==null)
		{
			System.out.println("등록되지 않은 계좌번호입니다.");
		}else
		{
			findAccount(ano).setBalance(findAccount(ano).getBalance()-withdraw);
			System.out.println("출금이 완료 되었습니다.");
		}
	}
	
	private static Account findAccount(String ano) 
	{
		for(int i=0; i<accountArray.length; i++)
		{
			if(accountArray[i] == null)
			{
				break;
			}
			if(accountArray[i].getAno().equals(ano))
			{
				return accountArray[i];
			}
		}
		return null;
	}
}
