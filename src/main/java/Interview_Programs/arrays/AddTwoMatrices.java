package Interview_Programs.arrays;

public class AddTwoMatrices 
{
	public static void main(String[] args) 
	{
		//creating two matrices
		int a[][]={{1,3,4},{3,4,5}};
		int b[][]={{1,3,4},{3,4,5}};
		int c[][]=new int[2][3]; //creating another matrix to store the sum of two matrices
		//adding & printing addition of 2 matrices
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];//use - for substraction
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
