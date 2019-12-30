package classes;

import java.util.Scanner;

public class FriendExe {
	private static Scanner scanner = new Scanner(System.in);
	private static Friend[] friendAry = new Friend[100];
	
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
	private static void inPutData()
	{
		boolean run = true;
		while(run)
		{
		System.out.println("====================================================");
		System.out.println("구분을 선택하세요. 1.대학동창  | 2.회사동료  | 3.그 외  | 4.맨 처음");
		System.out.println("====================================================");
		System.out.print("선택> ");
		int selectNo = scanner.nextInt();
		scanner.nextLine();  //엔터키 소진
		
		if(selectNo ==1){
			Univer();
		}else if (selectNo ==2)	{
			coop();
		}else if (selectNo ==3) {
			etc();
		}else if (selectNo ==4) {
			run = false;
		}
	}
	System.out.println("맨 처음으로 이동");
	}
	
	private static void Univer()
	{
		System.out.println("이름을 입력하세요.");
		String name = scanner.nextLine();
		
		System.out.println("연락처를 입력하세요.");
		String phone = scanner.nextLine();
		
		System.out.println("학교를 입력하세요.");
		String univ = scanner.nextLine();
		
		System.out.println("전공을 입력하세요.");
		String major = scanner.nextLine();
		
		Friend uniAry = new UnivFriend(name, phone, univ, major);
		for (int i = 0; i < friendAry.length; i++) {
			if (friendAry[i] == null) 
			{
				friendAry[i] = uniAry;
				System.out.println("결과 : '대학동창'에 저장 되었습니다.");
				break;
			}
		}
	}
	
	private static void coop()
	{
		System.out.println("이름을 입력하세요.");
		String name = scanner.nextLine();
		
		System.out.println("연락처를 입력하세요.");
		String phone = scanner.nextLine();
		
		System.out.println("회사를 입력하세요.");
		String company = scanner.nextLine();
		
		System.out.println("부서를 입력하세요.");
		String dept = scanner.nextLine();
		
		Friend comAry = new ComFriend(name, phone, company, dept);
		for (int i = 0; i < friendAry.length; i++) {
			if (friendAry[i] == null) 
			{
				friendAry[i] = comAry;
				System.out.println("결과 : '회사동료'에 저장 되었습니다.");
				break;
			}
		}
	}
	
	private static void etc()
	{
		System.out.println("이름을 입력하세요.");
		String name = scanner.nextLine();
		
		System.out.println("연락처를 입력하세요.");
		String phone = scanner.nextLine();
		
		Friend fAry = new Friend(name, phone);
		for (int i = 0; i < friendAry.length; i++) {
			if (friendAry[i] == null) 
			{
				friendAry[i] = fAry;
				System.out.println("결과 : '그 외'에 저장 되었습니다.");
				break;
			}
		}
	}

	private static void search()
	{
		System.out.println("이름을 입력하세요.");
		String name = scanner.nextLine();
		
		if(findName(name)==null)
		{
			System.out.println("등록되지 않은 이름입니다.");
		}
		
			
	
	}
	private static void list()
	{
		for(int i = 0; i<friendAry.length; i++)
		{
			System.out.println("이름: " +friendAry[i].getName()+ "\t" +"전화번호: " 
							+ friendAry[i].getPhone() + "\t" +"학교: " +friendAry[i].getUniv()
							+ "\t" + "전공: " + friendAry[i].getMajor() + "\t" + "회사: " + 
							friendAry[i].getCompany() + "\t" + "부서 : " + friendAry[i].getDept());
		}
	}
	
	
	
	
	
	
	private static Friend findName(String name) 
	{
		for(int i=0; i<friendAry.length; i++)
		{
			if(friendAry[i] == null)
			{
				break;
			}
			if(friendAry[i].getName().equals(name))
			{
				return friendAry[i];
			}
		}
		return null;
	}
}

