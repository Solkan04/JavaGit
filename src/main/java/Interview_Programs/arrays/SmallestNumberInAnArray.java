package Interview_Programs.arrays;

public class SmallestNumberInAnArray 
{
	public static void main(String[] args) 
	{
		int n[]={7,3,8,0,4,3,6,9,7};
	  	int s=n[0];   
	  	for(int i=1;i<n.length;i++) 
	  	{
	     		if(n[i]<s)
	    	 		s=n[i];
	  	}
	  	System.out.println("Smallest Number is : " +s);
	}
}
