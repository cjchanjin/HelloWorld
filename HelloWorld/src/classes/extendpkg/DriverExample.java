package classes.extendpkg;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle ();
		
		vehicle = new Bus();
		vehicle = new Truck();
		
		//매개변수의 다형성/
		driver.drive(vehicle); //드라이버 클래스에 드라이브라는 메소는 비히클 클래스를 받는다
		
		Bus bus = new Bus();
		Truck truck = new Truck();
		driver.drive(bus);
		driver.drive(truck);
		
	}
}
