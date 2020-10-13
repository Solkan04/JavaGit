package Interview_Programs.arrays;

public class LargestNumberInAnArray 
{
	public static void main(String[] args) 
	{
		int n[]={7,3,8,0,4,3,6,9,7};
      	int l=n[0];   
      	for(int i=1;i<n.length;i++) 
      	{
    	  	if(n[i]>l)
  			 l=n[i];
      	}
      	System.out.println("Largest Number is : " + l);
	}
}
