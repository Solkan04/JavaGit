package Interview_Programs.arrays;

import java.util.Arrays;

public class SmallestNumberInAnArrayBySorting 
{
	public static void main(String[] args) 
	{
		int a[]={2,5,6,3,2,};
		Arrays.sort(a);  
		System.out.println("Smallest Number is: " +a[0]);
	}
}
