package exercise;

public class TryFriend {
	private String name;
	private String phone;
	
	public TryFriend(String name, String phone) { 	//부모클래스의 생성자. 기본클래스는 없고  -> 자식에게 상속된다
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "TryFriend [name=" + name + ", phone=" + phone + "]";
	}
	public void introduce() 
	{
		System.out.println("이름은: " + name+ " 연락처는 : " + phone); 
	}
	
	
	
}
