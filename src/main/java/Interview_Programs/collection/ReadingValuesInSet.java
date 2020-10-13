package Interview_Programs.collection;

import java.util.HashSet;
import java.util.Iterator;

public class ReadingValuesInSet 
{
	public static void main(String[] args) 
	{
		HashSet<String> a=new HashSet<String>();
		//TreeSet<String> a=new TreeSet<String>();
		a.add("Sun");
		a.add("Mon");
		a.add("Tue");
		a.add("Wed");
		a.add("Thu");
		a.add("Fri");
		for(String s:a)
		{
			System.out.println("ForEach: " +s);
		}
		System.out.println("--------------------------------------------");
		Iterator<String> itr=a.iterator();
		while(itr.hasNext())//hasNext() will check whether the data is present or not.
		{
			System.out.println("Iterator: " +itr.next());
		}
	}
}
