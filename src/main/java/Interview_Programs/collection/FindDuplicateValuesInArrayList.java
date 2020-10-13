package Interview_Programs.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateValuesInArrayList 
{
	public static void main(String[] args) 
	{
		 ArrayList<String> names=new ArrayList<>();
		 names.add("Mahesh");
		 names.add("Naveen");
		 names.add("Rahul");
		 names.add("Mahesh");
		 names.add("Naveen");
		 Set<String> s=new HashSet<String>();
		 for(String name:names)
		 {
			 if(s.add(name)==false)
			 System.out.println(name);
		 }
	}
}
