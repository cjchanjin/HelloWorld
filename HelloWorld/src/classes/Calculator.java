package classes;

public class Calculator {
	int plus(int x, int y)	{	//메소드 만든것.
		return x + y;
	}
	double avg(int a, int b) {
		int sum = plus(a, b);	//메소드에서 또 다른 메소드 호출 가능
		double average = sum / 2.0;
		return average;
	}
	
	void execute () {
		int a = 10, b = 20;
		double result = avg(a, b);
		println("결과값은 : " + result);
	}
	
	void println(String str) {		//println를 정의 해줌으로써 위에서 사용가능
		System.out.println(str);
	}
}
