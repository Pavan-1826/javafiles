import java.util.*;
class queue{
    int [] arr=new  int[5];
    int rear=-1;
    int front=-1;
    void push(int i){
        if(rear==arr.length-1){
            System.out.println("queue overflow");
        }
        else{
            front++;
            arr[front]=i;
        }
    }
    void pop()
    {
    if(front==-1){
            System.out.println("queue empty");
        }
        else{
            System.out.println("delete element is"+arr[front]);
           front--;
        }
    }
    void peek()
    {
   if(front==-1){
            System.out.println("queue empty");
        }
        else{
            System.out.println("peek element is"+arr[front]);
         
        }
    }
    void display()
    {
    System.out.println("element are");
    for(int i=0;i<front;i++)
    {
        System.out.println(arr[front]);
    }
}
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		queue s=new queue();
		s.push(1);
		s.push(2);
		s.push(3);
		s.display();
		s.pop();
		s.display();
		s.peek();
	}
}