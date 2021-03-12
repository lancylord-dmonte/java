package pack1;
import java.util.*;
public class tp {
	public static void main(String args[])throws Exception 
	{
List <Character> ch=new ArrayList<>(); 

ch.add('a');
ch.add('b');
ch.add('a');

ch.remove(Character.valueOf('a'));
System.out.println(ch);

	}
}
