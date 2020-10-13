package Interview_Programs.strings;

public class OneStringIsRotationOfAnotherString 
{

	public static void main(String[] args) 
	{
		String s1="javaava";
		String s2="mahesh";
		if(checkRotation(s1, s2))
			System.out.println("Yes " +s1+ " is Rotation of " +s2);
		else
			System.out.println("No " +s1+ " is not a Rotation of " +s2);
	}
	public static boolean checkRotation(String s1, String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		String s3="";
		int n=s1.length();
		for(int i=n-1;i>=0;i--)
			s3=s3+s1.charAt(i);
		if(s3.equals(s2))
			return true;
		else
			return false;
	}
}
