package classes.extendpkg;

public class Car {
	//필드가 4개 필요함 (바퀴 위치)
//	Tire frontLeft = new Tire("앞왼쪽", 6);    	//(location, 해당바퀴 max회전수) 
//	Tire frontRight = new Tire ("앞오른쪽", 3);
//	Tire backLeft = new Tire ("뒤왼쪽", 3);
//	Tire backRight = new Tire ("뒤오른쪽", 4);
	
	Tire[] tires = {new Tire("앞왼쪽", 6), new Tire ("앞오른쪽", 3), new Tire ("뒤왼쪽", 3), new Tire ("뒤오른쪽", 4)};   
	
	
	
	void stop ()
	{
		System.out.println("[자동차가 멈춥니다]");
	}
	
	int run ()   //run 이라는 메소는 바퀴 어디가 문제가 있는지 알려준다 . 1~3 번 보여줌으로써.
	{
		System.out.println("[자동차가 달립니다]");
		for(int i = 0; i<tires.length; i++)
		{
			if(tires[i].roll() == false)    // 해당 바퀴의 최대 회전수 되면 false 
			{
				stop();
				return i+1; //왼.앞.	
			}
		}
		
		
		
//		if(frontRight.roll() == false)
//		{
//			stop();
//			return 2; // 오.앞
//		}
//		if(backLeft.roll() == false)
//		{
//			stop();
//			return 3;   //뒤.왼
//		}
//		if(backRight.roll() == false)
//		{
//			stop();
//			return 4;   //뒤.오
//		}
		
		
		
		
		return 0;
		
	}
	
}
