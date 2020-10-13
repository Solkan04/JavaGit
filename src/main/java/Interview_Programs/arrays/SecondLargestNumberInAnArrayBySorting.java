package Interview_Programs.arrays;

import java.util.Arrays;

public class SecondLargestNumberInAnArrayBySorting 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,5,6,3,2};  
		Arrays.sort(a);  
		System.out.println("Second Largest Number:" +a[a.length-2]);
	}
}
