package Interview_Programs.collection;

import java.util.HashMap;

public class VariousMethodsInMap 
{
	public static void main(String args[])
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		String s=hm.get(100); //Reading specific values
		System.out.println("Value is:" +s);
		boolean b=hm.containsKey("A");//To check whether key exist or not
		System.out.println("Key Exists:" +b);
		boolean b1=hm.containsValue("Boy");//To check whether value exists or not
		System.out.println("Value Exists:" +b1);
		hm.remove(100); //removing the elements
		System.out.println(hm);	
	}
}
