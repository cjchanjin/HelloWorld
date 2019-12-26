package classes;

public class Car {

	// Car 클래스 필드 선언
	
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
							// 아무것도 없으면 default. 동일한 패키지 내 접근 가능
	private int r;			//private <-> public  : 사용자가 접근 할 수 있냐 업냐
	
	
	Car(){}
	Car(String company) {
		this.company = company;
	}
	
		
	void setCompany(String company) {
		this.company = company;
	}
	
	double getArea() {
		double result = 3.14 * this.r * this.r;
		return result;
		
		
//마우스 우클릭 -> source -> generate get set setting..		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public String getCompany() {
		return company;
	}
}
