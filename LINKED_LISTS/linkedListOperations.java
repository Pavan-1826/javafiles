import java.util.*;
import java.lang.*;
class Node{
	int data;
	Node next;
	Node(int n){
		this.data=n;
		this.next=null;
	}
}

class Operations{
	Node head;
	void add(int n){
		Node newnode = new Node(n);
		if(head==null){
			head=newnode;
		}
		else{
			Node curr=head;
			while(curr.next!=null){
				curr=curr.next;
			}
			curr.next=newnode;
		}
	}
	void display(){
		Node curr=head;
		while(curr.next!=null){
			System.out.println(curr.data);
			curr=curr.next;
		}
		System.out.println(curr.data);
	}
	void add_begin(int n){
	    Node newnode = new Node(n);
	    newnode.next=head;
	    head=newnode;
	}
	void add_last(int n){
	    Node newnode = new Node(n);
	    Node curr=head;
	    while(curr.next!=null){
	        curr=curr.next;
	    }
	    curr.next=newnode;
	}
	void remove_begin(){
	    head=head.next;
	}
	void length(){
	    Node curr=head;
	    int count=1;
	    while(curr.next!=null){
	        count++;
	        curr=curr.next;                                                    
	    }
	    System.out.println("length"+count);
	}
	void remove_last(){
	    Node curr=head;
	    while(curr.next.next!=null){
	        curr=curr.next;                                                    
	    }
	    curr.next=null;
	}
}


public class linkedListOperations{
	public static void main(String[] args){
		Operations list = new Operations();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add_begin(4);
		list.add_begin(5);
		list.add_last(9);
		list.remove_begin();
		list.remove_last();
		list.display();
		list.length();
	}
}