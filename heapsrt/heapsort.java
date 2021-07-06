package heapsrt;
import java.util.*;

public class heapsort {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	

	System.out.println("SELECT MODE : asc or dsc");
	String mode =sc.nextLine();
	
		if(mode.equals("dsc")) {
			maxheap<Integer> mh = new maxheap<Integer>();
			System.out.println("Enter Values");
		String s =sc.nextLine();
		while(!s.equals("done"))
		{
			try {
			mh.insert(Integer.parseInt(s));}
			catch(Exception E)
			{
				System.out.print("Enter number not Stirng");
			}
			
			s = sc.nextLine();
		}
	
	
		System.out.println("inserted and now delete");
		String sw = sc.nextLine();
		while(!sw.equals("done"))
		{try {
			mh.delete();}
		catch(Exception E) {
			System.out.println("Elements are empty");
		}
		 sw = sc.nextLine();
		}
			
		
			
			
			
		}
		else if(mode.equals("asc"))
			{	minheap<Integer> mh = new minheap<Integer>();
				System.out.println("Enter Values");
			String s =sc.nextLine();
			while(!s.equals("done"))
			{
				try {
				mh.insert(Integer.parseInt(s));}
				catch(Exception E)
				{
					System.out.print("Enter number not Stirng");
				}
				
				s = sc.nextLine();
			}
	
	
			System.out.println("inserted and now delete");
			String sw = sc.nextLine();
			while(!sw.equals("done"))
			{try {
				mh.delete();}
			catch(Exception E) {
				System.out.println("Elements are empty");
			}
			 sw = sc.nextLine();
			}
				
			
				
				
				
			}
	}

}
