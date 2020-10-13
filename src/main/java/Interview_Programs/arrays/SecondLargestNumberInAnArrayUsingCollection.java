package Interview_Programs.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumberInAnArrayUsingCollection 
{
	public static void main(String[] args) 
	{
		Integer a[]={1,2,5,6,3,2};  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		System.out.println("Second Largest Number:" +list.get(a.length-2));
	}
}
