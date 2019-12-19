package conditions;

public class Switchexample {
	public static void main(String[] args) {
		int score = 80;
		switch (score) {		//크다 작다 를 쓸 수 없다. 딱 해당하는 숫자에만 작동
			case 90 :
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
			break; //스위치 구문 조건 맞으면 빠져나옴
			
			case 80 :
			System.out.println("점수가 80보다 큽니다.");
			System.out.println("등급은 B 입니다.");
			break;
			
			case 70 :
			System.out.println("점수가 70보다 큽니다.");
			System.out.println("등급은 C 입니다.");
			break;
			
			default :
			System.out.println("점수가 70보다 작습니다.");
			System.out.println("등급은 D 입니다.");				
		}
		int num = (int)(Math.random()*6) + 1;		//Math.random() 0~1 사이 아무 숫자나 랜덤으로 생성. ex 0.34453
		System.out.println(num);
		switch(num)
		{
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}
		
		
	
	}
}
