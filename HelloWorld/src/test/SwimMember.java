package test;

public class SwimMember {
	private String memberId;
	private String name;
	private String phone;
	
	public SwimMember(String memberId, String name, String phone) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.phone = phone;
		
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
		return "SwimMember [회원ID=" + memberId + ", 이름=" + name + ", 전화번호=" + phone + "]";
	}
	
	
}
