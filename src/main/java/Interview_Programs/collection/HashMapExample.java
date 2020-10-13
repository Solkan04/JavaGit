package Interview_Programs.collection;

import java.util.HashMap;

public class HashMapExample 
{
	public static void main(String[] args) 
	{
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("A", "Apple");
		hm.put("A", "Air");
		hm.put(null, "Bag");
		hm.put("B", "Bag");
		hm.put("D", null);
		hm.put("E", null);
		System.out.println(hm);	
	}
}
