package classes;

public class Friend {
	private String name;
	private String phone;
	private String univ;
	private String major;
	private String company;
	private String dept;
	
	public Friend(String name, String phone) { 	//부모클래스의 생성자. 기본클래스는 없고  -> 자식에게 상속된다
		super();
		this.name = name;
		this.phone = phone;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
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
		return "Friend [이름: " + name + ", 연락처: " + phone + ", 학교: " + univ + ", 전공: " + major 
				+ ", 회사: "	+ company + ", 부서: " + dept + "]";
	}
	
	public void introduce() 
	{
		System.out.println("이름은: " + name+ " 연락처는 : " + phone); 
	}
	
}
