package Interview_Programs.collection;

import java.util.HashSet;

public class HashSetUserDefinedRowsAndLoadRatio 
{
	public static void main(String[] args) 
	{
		// No of rows will be 32, but the load ratio by default is 0.75f
		HashSet<Object> h1 = new HashSet<Object>(32);
		h1.add(10);
		h1.add(10.3);
		h1.add(100);
		System.out.println("User Specified Rows & Default Load Ratio: " + h1);
		System.out.println("--------------------------------------");
		// The no of rows will be 30 & the load ratio is 0.90f
		HashSet<Object> h2 = new HashSet<Object>(30, 0.90f);
		h2.add(10);
		h2.add(10.3);
		h2.add(100);
		System.out.println("User Specified Rows & Load Ratio: " + h2);
	}
}
