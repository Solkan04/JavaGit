package Interview_Programs.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateValuesInStringArrayUsingCollection 
{
	public static void main(String[] args) 
	{
		String arr[]={"P","Z","A","P","Z","I","X"};
		Set<String> oSet=new HashSet<String>();
		for(int i=0;i<arr.length;i++)
		{
			if(oSet.add(arr[i])==false)
				System.out.println("Duplicate record :"+arr[i]);
		}
	}
}
