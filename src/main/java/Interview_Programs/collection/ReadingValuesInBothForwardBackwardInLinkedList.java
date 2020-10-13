package Interview_Programs.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReadingValuesInBothForwardBackwardInLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<String> a=new LinkedList<String>();
		a.add("Sun");
		a.add("Mon");
		a.add("Tue");
		a.add("Wed");
		a.add("Thu");
		System.out.println(a);
		System.out.println("***********************");
		//ListIterator Interface is used to traverse the element in backward and forward direction.
		ListIterator<String> list=a.listIterator();
		//Forward direction
		while(list.hasNext())
		{
			System.out.println("Forward :"+list.next());
		}
		System.out.println("***********************");
		//Backward direction
		while(list.hasPrevious())
		{
			System.out.println("Backward :"+list.previous());
		}
	}
}
