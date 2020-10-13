package Interview_Programs.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ReadingOnlyKeysOnlyValuesAndBothKeyValues 
{
	public static void main(String[] args) 
	{
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("A", "Apple");
		hm.put("B", "Ball");
		hm.put("C", "Cat");
		hm.put("D", "Dog");
		hm.put("D", "Doll");
		hm.put(null, "Doll");

		//To Read all the Keys
		Set<String> s1=hm.keySet();
		Iterator<String> itr1=s1.iterator();
		while(itr1.hasNext())
		{
			System.out.println("Keys:" +itr1.next());
		}
		System.out.println("-----------------------------");
		//To Read all the values
		Collection<String> c=hm.values();
		Iterator<String> itr2=c.iterator();
		while(itr2.hasNext())
		{
			System.out.println("Values:" +itr2.next());
		}
		System.out.println("-----------------------------");
		//To Read both key & values
		for(Map.Entry<String,String> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}	
	}
}
