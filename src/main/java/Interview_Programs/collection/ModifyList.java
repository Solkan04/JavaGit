package Interview_Programs.collection;

import java.util.ArrayList;

public class ModifyList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		//LinkedList<String> a=new LinkedList<String>();
		a.add("Sun");
		a.add("Mon");
		a.add("Tue");
		a.add("Wed");
		System.out.println("Before Modification :"+a);
		a.set(1, "Monday");
		System.out.println("After Modification :"+a);
	}
}
