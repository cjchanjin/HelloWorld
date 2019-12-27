package classes;

import java.util.Scanner;

public class PlayBaseBall {
	public static void main(String[] args) {
		int[] comAry = new int[3];
		for(int i = 0; i < 3; i++)
		{
			comAry[i] = (int)(Math.random()*9)+1;
		}
		
		
		for (int i =0; i<3; i++)
			System.out.println(comAry[i]);
		
		Scanner scn = new Scanner(System.in);
		int[] userAry = new int [3];
		for (int i = 0; i<3; i ++)
		{
			System.out.println("정수 입력하세요.");
			userAry[i] = scn.nextInt();
		}
		for(int i=0; i < 3; i++)
			System.out.println(userAry[i]);
		
		int strike =0, ball=0;
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++);
		}
	}
}
