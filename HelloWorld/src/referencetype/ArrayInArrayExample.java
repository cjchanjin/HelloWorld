package referencetype;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] intAry = new int[5][4];
		
		intAry[0][0] = 1;
		intAry[0][1] = 2;
		intAry[0][2] = 3;
		intAry[0][3] = 4;
		
		intAry[1][0] = 5;
		intAry[2][1] = 6;
		intAry[3][2] = 7;
		intAry[4][3] = 8;
		
		
		for(int i = 0; i<intAry.length; i++)
		{
			for(int k = 0; k<intAry.length; k++)
			{
				intAry[i][k] = 0;
				System.out.println(intAry[i][k]);
			}
		}
	}
}
