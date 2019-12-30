package exercise;

public class test01 {
	public static void main(String[] args) {
		int[][]ar = new int [5][5];//{{10,20}, {30,40}};
		int i, j;
		
		for(i=0; i<ar.length; i++)
		{
			for(j=0; j<ar.length; j++)
				System.out.print(" "+ar[i][j]);
			System.out.println();
		}

//		int[][] arr1 = new int[5][5];
//
//		for (int s = 0; s < arr1.length; s++) 
//		{
//			for (int t = 0; t < arr1.length; t++) 
//			{
//				System.out.print(arr1[s][t] + " ");
//			}
//		}
//		System.out.println();
	}
}
