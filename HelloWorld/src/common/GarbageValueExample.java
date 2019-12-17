package common;

public class GarbageValueExample {
	public static void main(String[] args) {				// main + ctrl +space bar
		int var1 = 125;  //제일큰 수 2,147,483,647
		byte var2 = 125;  //제일 큰 수가 127
		
		for (int i = 10; i > 0; i--) { //10번 반복.
			var1 = var1 + i;
			var2 = (byte) (var2 + i);  // int 타입을 byte 타입으로 '형변환' (casting)
			System.out.println("var1 : " + var1 + ", " + "var2 : " + var2);
		}
	}
}

