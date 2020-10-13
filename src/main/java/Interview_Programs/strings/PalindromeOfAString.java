package Interview_Programs.strings;

public class PalindromeOfAString 
{
	public static void main(String[] args) 
	{
		String s="madam";
		int n=s.length();
		String str="";
		for(int i=n-1;i<=0;i++)
		{
			str=str+s.charAt(i);
		}
		if(str.equals(s))
			System.out.println(s+ " is Palindrome");
		else
			System.out.println(s+ " is not Palindrome");
	}
}
