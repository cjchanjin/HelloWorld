package common;

import javax.sound.midi.Soundbank;

public class BooleanForExample {
	public static void main(String[] args) {
		
		int var1 = 0;
		var1 = 97;
		for (int i = 0; i < 10; i++) {
		}
		
//		// 60점 이상 pass or fail
//		if(var1 >60)
//			System.out.println("pass");
//		else
//		System.out.println("fail");

		//90점 이상 양호, 70 이상 보통, 아니면 미흡
		if(var1 > 90) {
			System.out.println("A");
			if (var1 >95)
			System.out.println("A+");
		}
		else if (var1 > 70)
			System.out.println("B");
		else if (var1 > 60)
			System.out.println("C");
		else if (var1 > 50)
			System.out.println("D");
		else
			System.out.println("F");
}
}

