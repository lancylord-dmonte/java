package pack1;
import java.util.*;
public class quick{
	
	static int quicks(int arr[],int l,int r)
	{ 
		int pivot=arr[r];
		int i=-1;
		for(int j=0;j<r;j++)
		{
			if(arr[j]<pivot)
			{ 	i+=1;
				int t=arr[j];
				arr[j]=arr[i];
				arr[i]=t;
			}
		}
		i=i+1;
		int k=arr[r];
		arr[r]=arr[i];
		arr[i]=k;
		
		return i;
		
	}
	
	
	static void quicksort(int arr[],int l,int r)
	{ if(l<r)
	 {
		int inter=quicks(arr,l,r);
		quicksort(arr,l,inter-1);
	    quicksort(arr,inter+1,r);
	 }
	}

	
	
	
	
	
	public static void main(String args[])
	{
		
		System.out.println("Enter n");
		
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter ele");
		
		for (int i=0;i<n;i++)
		{	
			int t=s.nextInt();
			arr[i]=t;
			
			
		
		
	
		
		}
		quicksort(arr,0,n-1);
		for (int i:arr)
		{
			System.out.println(i);
		}
		s.close();
	}

}
