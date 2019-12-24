package classes;

public class StudentExample {
	public static void main(String[] args) {

		// 필드, 생성자, 메소드 3가지 꼭 있어야 한다 클래스 구성하기 위해서
		
		String str = "Hello";
		String str1 = new String("Hello"); //new 키워드는 인스턴스를 하나 만드는것
		
		Student student = new Student();  //가운데 노란 student : 변수명
		
		student.studentNo = "191234-1234";  //점 찍으면 우리가 정의한 메소드와 필드를 나타낸다 + 오브젝트가 가지고 있는것도 표시
		student.studentName = "김철수";
		student.age = 20;
		student.major = "English";
		student.university = "Yedam";
		
		
		
		
		student.introduce(); //클래스에서 정의한 자기 소개 호출 

		
		
		
		Student student1 = new Student("Yedam", "921111-1111", "박철수"); //필드에 값 안넣고 생성자를 통해서 값을 넣음
		student1.introduce();
		
		
		
		
		System.out.println(student.major); //필드는 값을 가지고 있고 출력 할 수 잇다.
		
		student.doHomework(); //메소드 호출 . 필드와 달리 () 포함.
		
		System.out.println(student); //메모리에 가지고 있는 학생 변수의 주소
		
		
		//학교도 나오게 호출
		Student student2 = new Student();
		student2.university = "yedam";
		student2.studentNo = "19121212";
		student2.studentName = "바가바";		
				
		student2.introduce2();
		
	}
}
