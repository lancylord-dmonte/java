package pack1;

import java.util.*;
import java.io.*;

public class primeDish {
  
  static void checker(int[] a,int b){
    int[] ans=new int[b];
    int count=0; 
    while(count!=b)
    {
    for(int i=0;i<b;i++)
    {
      if(isprime(a[i]))
      {count+=1;
        ans[i]=count;
        a[i]=-10;
      }
      
    }
   for(int i=0;i<b;i++)
    {
      a[i]+=1;
    }
    for(int i=0;i<b;i++)
    {
      if(a[i]<0)
      {
        a[i]=-10;
      }
    }
        
  
      
      
    }
    
    
    
   // System.out.println(Arrays.toString(ans));
    String st="";
    for(int p: ans)
    {
      st= st+ p+" ";
    }
    System.out.println(st);

   
    }
  
  
  static boolean isprime(int a)
  { if(a<0)
  return false;
    int num =a, i = 2;
    boolean flag = false;
    while (i <= num / 2) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }

      ++i;
    }

    if (!flag)
      return true;
    else
      return false;
  }

  
  
  
  public static void main(String args[]) throws IOException {
    
    
    Scanner s = new Scanner(System.in);
    int i=Integer.parseInt(s.nextLine());
    while(i!=0)
    {
    int j=Integer.parseInt(s.nextLine());
    String str[]= s.nextLine().split(" ");
    int a[]=new int[str.length];
  for(int k =0 ;k < str.length;k++){
    a[k]= Integer.parseInt(str[k]);
}

   
   checker(a,j);
      i--;
    }
    
}
}