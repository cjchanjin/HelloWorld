package exercise;

import java.util.Scanner;

public class Test02 {
	
	String[] name = {"A", "B", "C", "D", "E"};
	int [] score = new int[5];
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		boolean run = true;
		while(run) {
			System.out.println("1. In put score  | 2. Score List | 3. SUM score & AVG score  | 4. Who got max score ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				inPutScore();
			
			}
		}
	}
	
	public void inPutScore() {
		for(int i = 0; i<name.length; i++) {
			System.out.println("in put score of student   " + name[i] );
			score[i] = sc.nextInt();
			sc.nextLine();
			}
		System.out.println("complete in put score");
		}
}
