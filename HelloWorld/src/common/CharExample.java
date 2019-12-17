package common;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		int v1 =c2;
		System.out.println(v1);
//		System.out.println("c1 : " + c1 + ", " + "c2 : " + c2 + ", " + "c3 : " + c3);
//		
//		c1 = (char) (c1 + 1);  //c1을 1씩 더해주겠다
//		System.out.println("c1 + 1: " +c1);

		// A~Z 까지 화면에 출력 프로그램 작성.
		for (int i = 0; i < 26; i++) {
			System.out.print(c1 + "  ");
			c1 = (char) (c1 + 1);
		}

	}
}
