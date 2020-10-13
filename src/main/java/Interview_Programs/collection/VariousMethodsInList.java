package Interview_Programs.collection;

import java.util.ArrayList;

public class VariousMethodsInList 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> a1 = new ArrayList<Object>();
		// LinkedList<Object> a1=new LinkedList<Object>();
		a1.add(10);
		a1.add(100);
		a1.add(10.3);
		a1.add("Mahesh");
		// Prints all the elements
		System.out.println("All the elements are: " + a1);
		// Prints selected index value
		System.out.println("Selected index value is:" + a1.get(1));
		// Prints the size
		System.out.println("Size is:" + a1.size());
		// Checks whether the elements is present or not
		System.out.println("Is the element present:" + a1.contains(20));
		// removing by index position
		a1.remove(1);
		System.out.println(a1);
		// removes all the elements but not the memory allocation of the elements
		a1.removeAll(a1);
		System.out.println(a1);
		// removes all the elements & memory allocation of the elements
		a1.clear();
		System.out.println(a1);
		ArrayList<Object> a2 = new ArrayList<Object>();
		// LinkedList<Object> a2=new LinkedList<Object>();
		a2.add(5);
		a2.add(20);
		//compares the data of two collections, it checks whether the element in 'al2' is present in 'al1' or not
		System.out.println(a1.containsAll(a2));
	}
}
