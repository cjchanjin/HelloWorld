package classes;

public class FriendExample {
	public static void main(String[] args) {
		Friend[] fArray = new Friend[5];
		UnivFriend[] uArray = new UnivFriend[5];
		ComFriend[] cArray = new ComFriend[5];
		
		UnivFriend uf = new UnivFriend("name1", "1111", "Yeda", "java"); //각 클래스 필드들 순서대로 적음
		ComFriend cf = new ComFriend("name2", "2222", "YDCompany", "Develop");
		Friend f = new Friend("name3", "3333");
		Friend f1 = uf;
		Friend f2 = cf;
		
		//자식 클레스는 부모 클래스 변수에 할당 할 수 있다. (자동 형변환 -> 동일 타입에 할당 가능)
		
		uf.getName();	//Friend class 가 가지고 있는 속성
		uf.getPhone();	//Friend class 가 가지고 있는 속성
		uf.getUniv();		//Univ 클래스가 가지고있는 속성
		uf.getMajor();	//Univ 클래스가 가지고있는 속성
		
		//자식 클래스에는 부모가 가진 클래스나 메소드를 그대로 사용 할 수 있다.
		
		f1.getName();	 //friend
		f1.getPhone();	 //friend
				
		//부모타입인 f1 에서는 자식이 가진 거를 할당 할 수 없음. f2 도 마찬가지
		
		
		//friend 배열
		fArray[0] = uf;
		fArray[1] = cf;
		fArray[2] = f;
		
		for(int i=0; i<3; i++)
		{
//			System.out.println(fArray[i]);
			fArray[i].introduce();
		}
		
	}
}
