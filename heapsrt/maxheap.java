package heapsrt;
import java.util.*;

public class maxheap<T extends Comparable<T>> {
	
	private  ArrayList <T> heap ;
	
	public maxheap()
	{
	 heap = new ArrayList<T>();
	}
	// child1 = k*2+1   and   child2 = k*2+2 where K is parent
	
//	parent of either child is  (k-1)/2 where k is child
	
	private void heapify() {
		
	 int k = heap.size()-1;
	 T c,p;
	 int parent=k,child=k;
	
	 while(parent>0)
	 {
		parent= (child-1)/2;
		 
		if(heap.get(child).compareTo(heap.get(parent))>0)
		{
			 c = heap.get(child);
			 p  = heap.get(parent);
			heap.set(child,p);
			heap.set(parent,c);
			child = parent;
			
		}
		else {
			break;
		}
		 
	 }

	 
	 
		
	}
	
	
	 
	 public void insert(T i)
	 {
		 heap.add(i);
		 heapify();
		 System.out.println(heap);
	 }
	
	
	
	

		 

	 public void delete()
	 {
		int k=heap.size()-1;
		System.out.println(heap.get(0));
		heap.set(0,heap.get(k));
		int parent= 0,left,right;
		heap.remove(k);
		k--;
		
		while(true) {	
		left = parent*2+1;
		right = left+1;
		T p,s;

		if(heap.size()==2)
		{
			if(heap.get(1).compareTo(heap.get(0))>0)
				{
					p=heap.get(0);
				    s= heap.get(1);
				    heap.set(1,p);
					heap.set(0,s);
					break;
				}
				
		}
		if(left >k ||right>k)
		{
			break;
		}
		
				if((heap.get(right).compareTo(heap.get(parent))>0)||(heap.get(left).compareTo(heap.get(parent))>0))
			{
				left = parent*2+1;
				right = left+1;
				
				if(heap.get(left).compareTo(heap.get(right))>0)
				{
					p=heap.get(parent);
					s= heap.get(left);
					
					heap.set(left,p);
					heap.set(parent,s);	
					parent= left;
				}else {
					p=heap.get(parent);
					s= heap.get(right);
					
					heap.set(right,p);
					heap.set(parent,s);	
					parent=right;
				}
				
				

				
			}else {
				break;
			}
	
		
	 }		
		System.out.println("size="+ heap);
		
	
	 }
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
