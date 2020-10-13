package Interview_Programs.collection;

import java.util.TreeMap;

public class TreeMapExample 
{
	public static void main(String[] args) 
	{
		TreeMap<String, String> tm=new TreeMap<String, String>();
		tm.put("A", "Apple");
		tm.put("A", "Air");
		tm.put("B", null);
		tm.put("C", null);
		tm.put("D", "Doll");
		tm.put("E", "Doll");
		System.out.println(tm);
	}
}
