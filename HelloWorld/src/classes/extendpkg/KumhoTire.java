package classes.extendpkg;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation)
	{
		super(location, maxRotation);  		//부모클래스꺼 가져올때 super 씀
	}

	@Override   //roll 메소드를 재정의
	public boolean roll ()
	{
		++accumulateRotation; 
		if(accumulateRotation < maxRotation) 
		{
			System.out.println(location + "KumhoTire 수명: " +(maxRotation - accumulateRotation));
			return true;	
		} else 
		{
			System.out.println("***" + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
	
	

}
