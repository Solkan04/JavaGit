package Interview_Programs.collection;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseElementsInLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<String> al=new LinkedList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		Collections.reverse(al);
		System.out.println("After Reverse Order: " + al);	
	}
}
