package Interview_Programs.collection;

import java.util.ArrayList;

public class AddOneListToAnotherList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		//LinkedList<String> a1=new LinkedList<String>();
		a1.add("Sun");
		a1.add("Mon");
		System.out.println("Before Adding arraylist1:" +a1);
		ArrayList<String> a2=new ArrayList<String>();
		//LinkedList<String> a2=new LinkedList<String>();
		a2.add("Tue");
		a2.add("wed");
		System.out.println("Before Adding arraylist2:"  +a2);
		a1.addAll(a2);
		System.out.println("After Adding:" +a1);
	}
}
