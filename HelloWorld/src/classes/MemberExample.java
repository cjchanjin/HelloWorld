package classes;

import java.util.Scanner;

public class MemberExample {

	 Member[] memberAry = new Member[3]; // 클래스 안에서 배열을 선언 -> 동일클래스 내에서 다 접근 가능
	 Scanner sc = new Scanner(System.in);

//	public  void main(String[] args) { // void - 메인 메소드 호출시 리턴값이 void (없음) 다.
//												//  고정
//		execute();
//	}							//main 메소드 없애도 MemberMain 클래스에서 실행 가능
	 							//static 없애도 된다.
	
	public  void execute() {  
		
		int cnt = 0, menu = 1;
		while (true) {
			System.out.println("=================");
			System.out.println("1.생성 2.조회 3.리스트 4.종료");
			System.out.println("=================");
			System.out.println("선택>");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				searchMember();
			} else if (menu == 3) {
				listMember();
			} else if (menu == 4) {
				break;
			}

		}
		System.out.println("프로그램 종료.");
	}

	public  void searchMember() {
		System.out.print("id입력하세요.");
		String inputId = sc.nextLine();
		System.out.print("pw입력하세요.");
		String inputPw = sc.nextLine();

		for (Member mem : memberAry) {
			if (mem != null) {
				if (inputId.equals(mem.getId()) && inputPw.equals(mem.getPassword())) {
					System.out.println(mem);
					break;
				} else if (inputId.equals(mem.getId()) && inputPw != (mem.getPassword())) {
					System.out.println("비밀번호가 틀립니다.");
					break;
				} else if (inputId != (mem.getId()) && inputPw.equals(mem.getPassword())) {
					System.out.println("없는 id입니다");
					break;
				}

				// id,pw ==> ok
				// id(o), pw(x) => "비밀번호가 틀립니다."
				// id(x), pw(x) => "없는 id입니다."
			}
		}

	}

	public  void listMember() {
		for (Member m : memberAry) {
			if (m != null)
				System.out.println(m);
		}
	}

	public  void createMember() {
		Member mem = new Member(); // member 인스턴스 생성 . mem 변수 . Member 타입

		System.out.println("이름을 입력: ");
		String name = sc.nextLine();
		mem.setName(name);

		System.out.println("id를 입력: ");
		String id = sc.nextLine();
		mem.setId(id);

		System.out.println("password를 입력: ");
		String password = sc.nextLine();
		mem.setPassword(password);

		System.out.println("age를 입력: ");
		int age = sc.nextInt();
		mem.setAge(age);

		// memberAry 배열에 넣는다
		for (int i = 0; i < memberAry.length; i++) {
			if (memberAry[i] == null) {
				memberAry[i] = mem;
				break;
			}
		}

	}

}
