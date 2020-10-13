package Interview_Programs.collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplicateValuesInLinkedList 
{
	public static void main(String[] args) 
	{
		 LinkedList<String> names=new LinkedList<String>();
		 names.add("Mahesh");
		 names.add("Naveen");
		 names.add("Rahul");
		 names.add("Mahesh");
		 names.add("Naveen");
		 Set<String> s=new HashSet<String>();
		 for(String name:names)
		 {
			 if(s.add(name)==true)
			 System.out.println(name);
		 }
	}
}
