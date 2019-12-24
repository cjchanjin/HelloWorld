package classes;

public class Student {  //학생이라는 클래스 안에 필드 +생성자+ 메소드 있다. 클래스3가지요소
	String university;
	String studentNo; //학번, 필드 변수
	String studentName;
	String major;
	int age;
	
	
	Student() //생성자 - 메소드랑 비슷한데 리턴타입이 없음 . 매개값이 없는 생성자 
	{
		
	}
	Student(String university, String studentNo, String studentName) //이 생성자를 호출할때, 매개값을 3가지 받겠다. 
	{
		this.university = university;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}
	
	
	void introduce()
	{
		System.out.println("학번은" + studentNo + "이고 이름은" + studentName + "입니다.");
	}
	
	void introduce2()
	{
		System.out.println("학교 : " + university + "학번 : " + studentNo + "이름 : " + studentName);
	}
	
	void study()	 //메소드 
	{
		System.out.println("공부한다.");
	}
	
	void basketBall()
	{
		System.out.println("농구한다.");
	}
	
	void sleep()
	{
		System.out.println("잠을잔다.");
	}
	
	void doHomework()
	{
		System.out.println("숙제한다.");
	}
	
}
