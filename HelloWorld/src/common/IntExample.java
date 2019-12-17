package common;

public class IntExample {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 010; // 앞에 0붙으면 8진수
		int var3 = 0x7; // 앞에 0x 는 16진수

		System.out.println("var1: " + var1 + " 	" + "2진수");
		System.out.println("var2: " + var2 + " 	" + "8진수");
		System.out.println("var3: " + var3 + " 	" + "16진수");

		for (int i = 0; i < 10; i++) {
			System.out.print(var3++);
//			System.out.printf("%2X", var3++);
		}
	}
}
