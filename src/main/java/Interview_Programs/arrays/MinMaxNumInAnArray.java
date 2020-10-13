package Interview_Programs.arrays;

public class MinMaxNumInAnArray 
{
	public static void main(String[] args) 
	{
		int n[]={8, 2, 7, 1, 4, 9, 5};
      	int s=n[0]; int l=n[0];      
      	for(int i=1;i<n.length;i++) 
      	{
      		if(n[i]>l)
      			l=n[i];
      		else if(n[i]<s)
      			s=n[i];
      	} 
      	System.out.println("Largest Number is : " +l);
      	System.out.println("Smallest Number is : " +s);
	}
}
