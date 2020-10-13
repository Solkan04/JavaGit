package Interview_Programs.strings;

public class LengthOfStringWithoutLengthMethod 
{
	public static void main(String[] args) 
	{
		String s="mahesh";
		char c[]=s.toCharArray();
		int i=0;
		for(char r:c)
			i++;
		System.out.println("Length of String is: " +i);
	}
}
