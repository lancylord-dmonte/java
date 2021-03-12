package pack1;

import java.util.Scanner;

class tree {

	node root;
	tree()
	{
		root=null;
	}
	
	class node{
		node left,right;
		int data;
		node(int d)
		{
			left=null;
			right=null;
			data=d;
		}
	}
	
	static void Insert(int d,tree t)
	{
		if(t.root==null)
		{	
			node newnode=t.new node(d);
			t.root=newnode;
			newnode.left=null;newnode.right=null;
			
		}
		else {
			
		node temp= t.root;
		node newnode=t.new node(d);
		while(temp.left!=null && temp.right!=null)
		{
			if(d<temp.data)
			{
				temp=temp.left;
			}
			else
			{
				temp=temp.right;
			}
		}
		if(d<temp.data)
		{
			temp.left=newnode;
		}else {
			temp.right=newnode;
		}
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int i=7;
		tree tr=new tree();
		while (i!=4)
		{i= s.nextInt();
		switch(i)
		{
		case 1:int j= s.nextInt();
				tree.Insert(j,tr);break;
	//	case 2:t.print(t);break;
	//	case 3: t.deleteend(t);break;
		case 4:break;
		}
	}
	
	
	
	
	
}}
