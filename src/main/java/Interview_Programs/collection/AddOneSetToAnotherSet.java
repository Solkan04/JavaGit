package Interview_Programs.collection;

import java.util.HashSet;

public class AddOneSetToAnotherSet 
{
	public static void main(String[] args) 
	{
		HashSet<String> a1=new HashSet<String>();
		//TreeSet<String> a1=new TreeSet<String>();
		a1.add("Sun");
		a1.add("Mon");
		System.out.println("Before Adding hashset1:" +a1);
		HashSet<String> a2=new HashSet<String>();
		//TreeSet<String> a2=new TreeSet<String>();
		a2.add("Tue");
		a2.add("wed");
		System.out.println("Before Adding hashset2:"  +a2);
		a1.addAll(a2);
		System.out.println("After Adding:" +a1);
	}
}
