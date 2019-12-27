package classes;

public class MethodExample1 {
	public static void main(String[] args) {
		//매개값이 있을수도 없을수도 있는 메소드. 리턴타입이 없는 메소드
		showName();  //메인메소드에 메소드 이름을 잡아 넣으면 해당 메소드가 실행된다.
		showName("Park");  //매개값이 들어와있다는 뜻
		showAge(30);
		
	}
	public static void showName() {
		//리턴타입이 void. 이름은 showname, 매개값도, 결과값도 없는 메소드이다
		//동일한 메소드는 2개 존재 불가
		System.out.println("Hello, I am charlie");
	}
	public static void showName(String name) {
		//매개값이 있고 없고에 따라 다른 메소드로 인식 -> 메소드오버로딩
		System.out.println("Hello, I am"  +name);
	
	}
	public static void showAge(int age) {
		System.out.println("Hello, I am" + age + "year old");
	}
}
