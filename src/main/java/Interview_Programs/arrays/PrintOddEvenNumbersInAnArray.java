package Interview_Programs.arrays;

public class PrintOddEvenNumbersInAnArray 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,5,6,3,2};  
		for(int i=0;i<a.length;i++)
		{  
			if(a[i]%2!=0)  
				System.out.print("Odd Numbers: "+a[i]);
			else if(a[i]%2==0)
				System.out.print("Even Numbers: "+a[i]);
			System.out.println();
		}  
	}
}
