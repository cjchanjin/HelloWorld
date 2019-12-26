package classes;

public class CalculatorExample {
	public static void main(String[] args) {
		
		//인스턴스 생성
		Calculator cal = new Calculator(); //Calculator 이라는 타입의 cal 변수에 담음 (new Calculator = 인스턴스)
		cal.execute();  //인스턴스를 통해서 만들어진 변수를 실행할 수 있다.
		
		double avg = cal.avg(30, 50); //avg 메소드 호출 -> 해당 클래스 밖에서 호출시엔 cal. 이런거 붙여줘야 함.
		cal.println("두 수의 결과값은 " + avg);
		
	}
}
