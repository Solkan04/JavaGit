package Interview_Programs.collection;

import java.util.ArrayList;

public class ConvertArrayListToArray 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		//TreeSet<String> a=new TreeSet<String>();
		// HashSet<String> a=new HashSet<String>();
		//LinkedList<String> a=new LinkedList<String>();		
		a.add("Sun");
		a.add("Mon");
		a.add("Tue");
		a.add("Wed");
		Object arr[]=a.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("" +arr[i]);
			//System.out.println("arr["+i+"] =:"+arr[i]);
		}
	}
}
