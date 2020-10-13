package Interview_Programs.arrays;

public class SecondSmallestNumberInAnArray 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,5,6,3,2,10};  
		int temp;  
		for (int i=0;i<a.length;i++)   
		{  
			for (int j=i+1;j<a.length;j++)   
		    {  
				if (a[i]>a[j])   
		        {  
					temp=a[i];  
		            a[i]=a[j];  
		           	a[j]=temp;  
		        }  
		    }  
	    }
		System.out.println("Second Largest Number is:" +a[1]); 
	}
}
