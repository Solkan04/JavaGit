package Interview_Programs.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertStringArrayToListAndRemoveDuplicateElements 
{
	public static void main(String[] args) 
	{
		String arr[]={"P","Z","A","P","Z","I","X"};
		List<String> oList=Arrays.asList(arr);
		Set<String> oSet=new HashSet<String>(oList);
		System.out.println(oSet);
	}
}
