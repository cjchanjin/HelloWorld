package test;

import java.util.Scanner;

public class test22 {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int kor, eng, mat = 0;
		int sum = 0;
		double avg = 0;
		String name;
		
		System.out.println("score 입력하세요.");
		name = scanner.nextLine();
		
		System.out.println("score 입력하세요.");
		kor = scanner.nextInt();
		
		System.out.println("score 입력하세요.");
		eng = scanner.nextInt();
		
		System.out.println("score 입력하세요.");
		mat = scanner.nextInt();
		
		sum = kor+eng+mat;
		avg = (double)sum /3;
		
		System.out.println("이름: " + name);
		System.out.println("합계점수 : " + sum);
		System.out.printf("평균점수 : " + "%.1f", avg);
	}
}
