package Interview_Programs.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ReadingValuesInList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		//LinkedList<String> a=new LinkedList<String>();
		a.add("Sun");
		a.add("Mon");
		a.add("Tue");
		a.add("Wed");
		a.add("Thu");
		a.add("Fri");
		//Reading using foreach
		for(String s:a)
		{
			System.out.println("ForEach: " +s);
		}
		System.out.println("--------------------------------------------");
		//Reading using forloop
		for(int i=0;i<a.size();i++)
		{
			System.out.println("ForLoop: " +a.get(i));
		}
		System.out.println("--------------------------------------------");
		//Reading using Iterator
		Iterator<String> itr=a.iterator();
		while(itr.hasNext())//hasNext() will check whether the data is present or not.
		{
			System.out.println("Iterator: " +itr.next());
		}	
	}

}
