package Interview_Programs.strings;

public class ReverseEachWordInAString 
{
	public static void main(String[] args) 
	{
		String str="my name is Mahesh";
		String words[]=str.split("\\s");//splits the string based on whitespace 
		String reverseWord="";  
		for(String w:words)//using java foreach loop to print elements of string array 
		{  
			StringBuilder sb=new StringBuilder(w);  
			sb.reverse();  
			reverseWord+=sb.toString()+"  ";  
		}  
		System.out.println("Reverse Words are: " +reverseWord);
	}
}
