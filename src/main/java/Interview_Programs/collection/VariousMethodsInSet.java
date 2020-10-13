package Interview_Programs.collection;

import java.util.HashSet;

public class VariousMethodsInSet 
{
	public static void main(String[] args) 
	{
		HashSet<Object> h1 = new HashSet<Object>();
		// TreeSet<Object> h1=new TreeSet<Object>();
		h1.add(10);
		h1.add(100);
		h1.add(10.3);
		h1.add("Mahesh");
		// Prints all the elements
		System.out.println("All the elements are: " + h1); 
		// Prints the size
		System.out.println("Size is:" + h1.size());
		// Checks presence of elements
		System.out.println("Element present:" + h1.contains(20)); 
		// removes the value in set, pass the value instead of index position
		h1.remove(10);
		System.out.println(h1);
		// removes all the elements but not the memory allocation of the elements
		h1.removeAll(h1); 
		System.out.println(h1);
		// removes all the elements & memory allocation of the elements
		h1.clear();
		System.out.println(h1);
		HashSet<Object> h2 = new HashSet<Object>();
		// TreeSet<Object> h2=new TreeSet<Object>();
		h2.add(5);
		h2.add(20);
		//compares the data of two collections, it checks whether the element in 'al2' is present in 'al1' or not
		System.out.println(h1.containsAll(h2));

	}
}
