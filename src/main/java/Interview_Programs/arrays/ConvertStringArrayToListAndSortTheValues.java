package Interview_Programs.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertStringArrayToListAndSortTheValues 
{
	public static void main(String[] args) 
	{
		String arr[]={"Z","X","B","A","S"};
		List<String> oList=Arrays.asList(arr);
		Collections.sort(oList);
		System.out.println(oList);
	}
}
