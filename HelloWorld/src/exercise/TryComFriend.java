package exercise;

public class TryComFriend extends TryFriend{
	private String company;
	private String dept;
	
	public TryComFriend(String name, String phone, String company, String dept) 
	{
		super(name, phone);
		this.company = company;
		this.dept = dept;
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
	
	@Override
	public String toString() {
		return "TryComFriend [company=" + company + ", dept=" + dept + "]";
	}

	@Override
	public void introduce() {
		// TODO Auto-generated method stub
		super.introduce();
		System.out.println("이름은: " + super.getName()+ " 연락처는 : " + super.getPhone()
		+"회사: " +company+ "부서는 : "+ dept);
	}
	
	
	
	
}
