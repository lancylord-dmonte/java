import java.util.*;
import java.io.*;
import java.util.Collections.*;

public class CrossBridge {
  
  static char freq(String st)
  {
  List <Character> a = new ArrayList<Character>();

  for (char ch: st.toCharArray()) {
            a.add(ch);
        }
  
  
  int x=Collections.frequency(a,'X');
  int y=Collections.frequency(a,'Y');

  if(x>y)
    return 'X';
  else if(x<y)
    return 'Y';
  else
 return 'Z';
  
  
  
  }
  static int answer(String st){
  char c=freq(st);
  int step1=0;
  int step2=0;
  int store1=-7;
  int store2=-7;
  if (c=='X' || c=='Y' || c=='Z'){
    for (int i =0;i<st.length();i++)
    {
      
      if(st.charAt(i)=='Y')
      {
        if(store1!=i-1)
        {
          step1+=1;
          store1=i;
        }
        store1=i;
      }
      
      
    }
    

  }
  if(c=='X' || c=='Y' || c=='Z') {
    for (int i =0;i<st.length();i++)
    {
      
      if(st.charAt(i)=='X')
      {
        if(store2!=i-1)
        {
          step2+=1;
          store2=i;
        }
        store2=i;
      }
      
      
    }
    
  }


   
     if(step1>=step2)
      return step2;
      else
      return step1;
   
  
  
  }
  
  public static void main(String args[]) throws IOException {
    
  Scanner s= new Scanner (System.in);
  int ex= Integer.parseInt(s.nextLine());
  
  for(int i=1;i<=ex;i++)
  {
   String st= s.nextLine();
   System.out.println(answer(st));
  }
    
  }
}