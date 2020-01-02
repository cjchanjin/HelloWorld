package exercise;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int a=6, b=7, c=10, d=5, e=9;
		int maxValue = 0;
// 다섯개의 변수에 들어 있는 값중에 가장 큰 수를 maxValue에 대입
		int[] intAry = {6,7,10,5,9};
		
		for (int i=0; i<5; i++) 
		{
			if(intAry[i] > maxValue)
				maxValue = intAry[i];
		}
		System.out.println(maxValue);
		
//최소값구하기		
		int minValue= maxValue;
		for(int j=0; j<5; j++)
		{
			if(intAry[j] < minValue)
				minValue = intAry[j];
		}
		System.out.println(minValue);
		
	}
	
}














