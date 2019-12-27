package classes;

class Calculators {
	static double PI = 3.14159;  //정적변수를 쓸때는 대문자쓴다. 두 단어이상은 _ 연결
		//ex EARTH_AREA 
	String color;
	
	void setColor(String color)
	{
		this.color = color;
	}
	
	static int plus (int x, int y)
	{
		return x + y;
	}
	
	static int minus (int a, int b) 
	{
		return a - b;
	}
	
}

public class CalculatorsExample {
	public static void main(String[] args) {
		Calculators cal = new Calculators(); //
		cal.color="white";
		cal.setColor("black"); //인스턴스 메소드는 반드시 인스턴스 선언 후에 사용이 되어야 한다
		
		cal.plus(4, 5); //Calculators.plus 와 같은 메소드
		Calculators.plus(6, 7); //정적 메소드(static)는 '클래스명.메소드' 로 쓸수 있다.
		
		
	}
}
