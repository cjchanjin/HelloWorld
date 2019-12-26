package classes;

import java.util.Scanner;

public class PersonExample2 {
	public static void main(String[] args) {
		person[] perAry = new person[3];
		
		person p1 = new person("kim", "12345", 20);
		person p2 = new person("park", "54332", 28);
		person p3 = new person("jung", "65403", 26);
		
		perAry[0] = p1;
		perAry[1] = p2;
		perAry[2] = p3;
		
		for (int i = 0; i<3; i++)
		{
			perAry[i].introduce();
		}
		System.out.println("==========================");
		
		//확장 for
		for(person p : perAry)
		{
			p.introduce();
		}
		////////////////////////////////////////////////////////////////////////////
		
		boolean run = true;
		String name = "", no = "";
		int age = 0, menu = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run)
		{
			System.out.println("-----------------------------------");
			System.out.println("1.이름 2.나이 3.번호 4.확인 5.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택>");
			menu = scanner.nextInt();
			scanner.nextLine();
			
			if(menu == 1)
			{
				System.out.println("이름");
				name = scanner.nextLine();
				name = name;
			}
			
			if(menu == 2)
			{
				System.out.println("나이");
				age = scanner.nextInt();
				age = age;
			}
			
			if(menu == 3)
			{
				System.out.println("번호");
				no = scanner.nextLine();
				no = no;
			}
			
			if(menu == 4)
			{
				System.out.println("이름 :" + name + "   나이 : " + age + "   번호: " + no);
			}
			
			if(menu ==5)
			{
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
		
	}
}
