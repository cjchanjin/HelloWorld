package classes.extendpkg;

public class ParentExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.method1();
		parent.method2();
		//parent.method3();    -> 부모클래스에 정의되어 있지 않아 사용 불가능
		
		Child child = (Child) parent;  //parent 변수를 child 타입으로 강제 형변환 해서, method3 실행 가능하게됨
		child.field2 = "data2";
		child.method3();
		
		Parent parent2 = new Parent();	 //parent2 가 child 인스턴스가 아니라서 그냥 실행 하면 오류남 
		if(parent2 instanceof Child)
		{
			Child child2 = (Child) parent2;
			child2.method3();	
		}else
		{
			System.out.println("형변환 할 수 없습니다.");
		}
		  
		
	}
}
