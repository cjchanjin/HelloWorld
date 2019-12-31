package classes;

public class UnivFriend extends Friend { //friend 클래스 상속 받는다 
	private String univ;
	private String major;
	
	public UnivFriend(String name, String phone, String univ, String major) {  //생성자 형성 , 상속+자기꺼 필드들 생김
		super(name, phone); //부모클래스 생성자 호출됨.
		this.univ = univ;
		this.major = major;
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
//		return "UnivFriend [univ=" + univ + ", major=" + major + "]";
		return "이름은: " + super.getName()+ " 연락처는 : " + super.getPhone()
		+"학교: " +univ+ "전공은 : "+ major;
	}

	@Override
	public void introduce() {
		// TODO Auto-generated method stub
		super.introduce();
		System.out.println("이름은: " + super.getName()+ " 연락처는 : " + super.getPhone()
								+"학교: " +univ+ "전공은 : "+ major); 
	}
	
}
