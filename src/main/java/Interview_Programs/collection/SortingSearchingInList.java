package Interview_Programs.collection;

import java.util.Collections;
import java.util.LinkedList;

public class SortingSearchingInList 
{
	public static void main(String[] args) 
	{
		// ArrayList<Integer> al=new ArrayList<Integer>();
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(10);
		al.add(5);
		al.add(100);
		// Sorting
		Collections.sort(al);
		System.out.println("After Sorting: " + al);
		// Searching:To perform search operation in a collection, make sure that the data is sorted
		int index = Collections.binarySearch(al, 100);
		System.out.println(index);// Prints the index position of the element
		System.out.println(al.get(index));
	}
}
