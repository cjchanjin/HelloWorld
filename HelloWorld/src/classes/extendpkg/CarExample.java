package classes.extendpkg;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<=10; i++)	 //run을 여러번 반복 해본다 (5회)
		{
			int problemLocation = car.run();   //1회 run 은 타이어를 한바퀴씩 사용하고 문제 위치를 알려줌
			
			switch(problemLocation)
			{
//			case 1:
//				System.out.println("앞왼쪽 교체.");
//				car.frontLeft = new HankookTire ("앞왼쪽", 10);
//				break;
//			case 2:
//				System.out.println("앞오른쪽 교체.");
//				car.frontRight = new KumhoTire ("앞오른쪽", 11);
//				break;
//				
//			case 3:
//				System.out.println("뒤왼쪽 교체.");
//				car.backLeft = new HankookTire ("뒤왼쪽", 13);
//				break;
//				
//			case 4:
//				System.out.println("뒤오른쪽 교체.");
//				car.backRight = new KumhoTire ("뒤오른쪽", 12);
//				break;
				
			case 1:
				System.out.println("앞왼쪽 교체.");
				car.tires[0] = new HankookTire ("앞왼쪽", 10);
				break;
			case 2:
				System.out.println("앞오른쪽 교체.");
				car.tires[1] = new KumhoTire ("앞오른쪽", 11);
				break;
				
			case 3:
				System.out.println("뒤왼쪽 교체.");
				car.tires[2] = new HankookTire ("뒤왼쪽", 13);
				break;
				
			case 4:
				System.out.println("뒤오른쪽 교체.");
				car.tires[3] = new KumhoTire ("뒤오른쪽", 12);
				break;
			}
			System.out.println("---------------------------------------------");
		}
		
		
	}
}
