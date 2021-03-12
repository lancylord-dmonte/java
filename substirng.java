package pack1;

import java.io.*;

import java.util.*;

public class substirng {
    // Complete the substrCount function below.
    static boolean palin(String ar)
    {
    String n=ar;
    for(int i=0;i<ar.length();i++)
    {
        if(n.charAt(i)!=ar.charAt(ar.length()-1-i))
        {
            return false;
        }
    }return true;
    
    
    }
    static long substrCount(int n, String s) {
        int count=n;
      for(int letter=1;letter<n;letter++)
      {
          for(int i=0;i<n-letter;i++)
          {System.out.println(s.substring(i,i+letter+1));
              if(palin(s.substring(i,i+letter+1)))
              {
              count++;}
          }
      }
       
       
    return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        System.out.println(result);
        
        

        scanner.close();
    }
}



