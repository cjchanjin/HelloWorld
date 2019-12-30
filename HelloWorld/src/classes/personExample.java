package classes;

public class personExample {
	public static void main(String[] args) {
		person[] persAry = new person[3];
		
		person p1 = new person(null, null, 0);
		person p2 = new person(null, null, 0);
		person p3 = new person(null, null, 0);
		
		persAry[0] = p1;
		persAry[1] = p2;
		persAry[2] = p3;

		
		p1.persAge = 32;
		p1.persName = "박찬진";
		p1.persNo = "010-3826-3364";
		p1.introduce();
		
		
		
		//////////////////////////////////////////////////////
//		person p1 = new person("김철수", "9101010-123123");
//		person p2 = new person("박철수", "9101015-123123");
//		person p3 = new person("황철수", "9101016-123123");
//		
//		person[] perAry = new person[3];
//		perAry[0] = p1;
//		perAry[1] = p2;
//		perAry[2] = p3;
//		for (int i = 0; i<3; i++)
//		{
//			perAry[i].introduce();
//		}
		/////////////////////////////////////////////////////////
		
		//확장 for
		for (person p : persAry)
		{
			p.introduce();
		}
	}
}
