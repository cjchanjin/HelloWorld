package classes;
class Singleton
{
	//객체(인스턴스)를 하나만 필요로 할때 쓴다
	private static Singleton singleton = new Singleton(); //필드를 싱글톤 타입으로 하나를 선언 함
	private Singleton ()		//생성자를 외부에서 호출하지 못하도록 함.
	{
		
	}
	
	static Singleton getInstance() {		//getinstance를 통해서만 호출 되도록 함
		return singleton;
		
	}
}

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton singleton = new Singleton();  //호출 불가능
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if(singleton == singleton2 ) {			//싱글톤의 겟인스턴스로 만들어지면 항상 같은 객체로 인식
			System.out.println("동일한 객체.");
		} else {
			System.out.println("다른 객체");
		}
		
	}
}
