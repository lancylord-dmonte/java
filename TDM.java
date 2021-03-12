package pack1;

import java.util.*;
import java.util.Scanner;

public class TDM {
public static void main(String args[])
{
	int memory=-1,users;
	
	final int slot=417;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Numbers of Users");
	users=s.nextInt();
	List <Integer> delay = new ArrayList<Integer>(users);
	System.out.println("Enter delay");
	for(int i=1;i<=users;i++)
	{	System.out.println("Delay for User"+i);
		int de=s.nextInt();
		delay.add(de);
	}
	System.out.println("CYCLE 1");
	//Cycle 1
	for(int i=0;i<users;i++)
	{
		if(delay.get(i)<10)
		{
			System.out.println("Slot for user "+(i+1) +" = "+(memory+1) +" to "+(memory+1+slot));
			memory=memory+1+slot;
		}
		else{
			System.out.println("Slot for user "+(i+1) +"= No Slot");
		}
	}
	memory=-1;
	//Cycle 2
System.out.println("CYCLE 2");
	for(int i=0;i<users;i++)
	{
		if(delay.get(i)>10)
		{
			System.out.println("Slot for user "+(i+1) +" = "+(memory+1) +" to "+(memory+slot));
			memory=memory+1+slot;
		}
		else{
			System.out.println("Slot for user "+(i+1) +"= Waiting");
			memory=memory+1+slot;
		}
	}
	
	
	s.close();
}
}
