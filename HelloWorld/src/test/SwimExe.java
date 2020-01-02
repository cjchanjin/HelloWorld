package test;

import java.util.Scanner;

import classes.Friend;

public class SwimExe {
	private static Scanner scanner = new Scanner(System.in);
	private static SwimMember[] swimAry = new SwimMember[100];

	public static void main(String[] args) {
		boolean run = true;
		while(run)
		{
			System.out.println("===============================");
			System.out.println("1.입력 | 2.수정 | 3.삭제 | 4.리스트 | 5.종료");
			System.out.println("===============================");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if(selectNo ==1) {
				inPutData();
			}else if(selectNo ==2) {
				update();
			}else if (selectNo==3) {
				delete();
			}else if (selectNo==4) {
				list();
			}else if (selectNo ==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void inPutData()
	{
		System.out.println("회원ID를 입력하세요.");
		String memberId = scanner.nextLine();
		
		System.out.println("이름을 입력하세요.");
		String name = scanner.nextLine();
		
		System.out.println("연락처를 입력하세요.");
		String phone = scanner.nextLine();
		
		for (int i = 0; i < swimAry.length; i++) {
			if (swimAry[i] == null) 
			{
				swimAry[i] =  new SwimMember(memberId, name, phone);
				System.out.println("결과 : 회원정보가 저장 되었습니다.");
				break;
			}
		}
		
	}
	
	private static void update()
	{
		System.out.println("수정할 회원ID를 입력하세요");
		String memberId = scanner.nextLine();
		SwimMember tempUpdate = findId(memberId);
		if(tempUpdate==null)
		{
			System.out.println("등록되지 않은 회원입니다.");
		} else
		{
			System.out.println(tempUpdate);
			System.out.println("이름을 수정하세요");
			String name = scanner.nextLine();
			
			System.out.println("연락처를 수정하세요.");
			String phone = scanner.nextLine();
		
			for (int i = 0; i < swimAry.length; i++) {
				if (swimAry[i] == tempUpdate) 
				{
					swimAry[i] =  new SwimMember(memberId, name, phone);
					System.out.println("결과 : 회원정보가 수정 되었습니다.");
					break;
				}
			}
		}
		
	}
	
	
	private static void delete()
	{
		System.out.println("삭제할 회원ID를 입력하세요");
		String memberId = scanner.nextLine();
		SwimMember tempDelete = findId(memberId);
		if(tempDelete==null)
		{
			System.out.println("등록되지 않은 회원입니다.");
		} else
		{
			boolean run  = true;
			while(run)
			{
				System.out.println(tempDelete);
				System.out.println("해당 회원정보를 삭제하시겠습니까? (1.삭제 / 2.취소)");
				System.out.print("선택> ");
				int selectNo = scanner.nextInt();
				scanner.nextLine();
				
				if (selectNo == 1) {
					for(int i=0; i<swimAry.length; i++)
					{
						if(swimAry[i].getMemberId().equals(memberId))
						{
							swimAry[i] = null;
							break;
						}
					}
					System.out.println("회원정보가 삭제되었습니다.");
					break;
					
				}else if (selectNo == 2) {
					run = false;
				}
			}
			System.out.println("메인메뉴로 이동");
		}
	}
	
	
	private static void list()
	{
		for(int i = 0; i<swimAry.length; i++)
		{
			if(swimAry[i]==null)
				continue;
//				break;
			
			System.out.println("회원ID: " + swimAry[i].getMemberId()+ "\t" + "이름: " +swimAry[i].getName()+ "\t" +"전화번호: "	+ swimAry[i].getPhone() );
		}
	}
	
	
	private static SwimMember findId(String memberId) 
	{
		for(int i=0; i<swimAry.length; i++)
		{
			if(swimAry[i] == null)
			{
				continue;
//				break;
			}
			if(swimAry[i].getMemberId().equals(memberId))
			{
				return swimAry[i];
			}
		}
		return null;
	}
	
	
	
	
	
}

