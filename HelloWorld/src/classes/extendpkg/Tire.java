package classes.extendpkg;

public class Tire {
	int maxRotation; //사용가능한 타이어 수명.회전수 (10)
	int accumulateRotation; //현재까지 사용한 회전수
	String location; //바퀴 장착 위치. 앞오,앞왼,뒤오,뒤왼
	
	//maxRotation = 필드
	
	public Tire (String location, int maxRotation)  //생성자
	{
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll ()
	{
		++accumulateRotation;  //롤이 한번 돌때마다 현재사용량 증가 = max로테이션이 줄어든다
		if(accumulateRotation < maxRotation) 
		{
			System.out.println(location + "Tire 수명: " +(maxRotation - accumulateRotation));
			return true;	//누적회전수 파악
		} else 
		{
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
	
	
}
