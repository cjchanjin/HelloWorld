package classes;

public class person {
	String persName;
	int persAge;
	String persNo;
	
	
	person(String persName, String persNo, int persAge)
	{
		this.persName = persName;
		this.persNo = persNo;
		this.persAge = persAge;		
	}
	
	
	void introduce()
	{
		System.out.println("나이: " + persAge + " 이름 : " + persName + " 번호 : " + persNo);
	}
	
	
	
	
}
