package Interview_Programs.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElementsInArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		Collections.reverse(al);
		System.out.println("After Reverse Order: " + al);
	}
}
