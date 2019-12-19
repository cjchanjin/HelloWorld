package operators;

public class stringEqualsExample {
	public static void main(String[] args) {
//		String str1 = "신민철"; // 1,2 주소값이 같다
//		String str2 = "신민철"; // 1,2 주소값이 같다
//		String str3 = new String("신민철"); // new로 만들면 새로운 주소값을 가짐
//
//		System.out.println(str1 == str2); // 주소값이 같은지 다른지 비교 true, false
//		System.out.println(str1 == str3);
//		System.out.println();
//		System.out.println(str1.equals(str2)); // 주소값 x 내용이 같은지 다른지 비교. equals 라는 method 사용
//		System.out.println(str1.equals(str3));
//
//		if (str1 == str3) {
//			System.out.println("같은 내용입니다.");
//		} else {
//			System.out.println("다른 내용입니다.");
//		}
//		if (str1.equals(str3)) {
//			System.out.println("같은 내용입니다.");
//		} else {
//			System.out.println("다른 내용입니다.");
//		}
//		int var1 = 10;
//		int var2 = 20;
//		int var3 = 30;
//		
//		if (++var1 > 15 && ++var2 >30) {
//			System.out.println(var1 + "=== " + var2);
//		}
//		System.out.println(var1 + ", " + var2);

//		int var1 = 10;
//		int result = var1 << 1;		// 1비트만큼 옆으로 이동
//		System.out.println(result);

		int score = 85;
		char grade; 
		grade = (score > 90) ? 'A' : 'B'; // 조건이 참이면 a, 아니면 b를 출력하라
		System.out.println(grade);		//if ~esle(lf~else) 랑 같은 결과

		grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
	
		
//		int score = 99;
//		int score = 87;
//		int score = 90;
//		int score = 45;
//		int score = 76;
//		int score = 69;
//		char grade;
//		grade = (score > 95) ? 'A' : ((score > 90) ? 'A': (score > 85) ? 'B' : (score > 80) ? 'B' : 
//					(score > 75) ? 'C' : (score > 70) ? 'C' : (score > 65) ? 'D' : (score > 60) ? 'D' : 'F'));
	}
}
