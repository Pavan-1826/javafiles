import java.util.*;
public class Main{
	public static void main(String[] args){
		int [] a=new int [5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0){
			    evencount+=1;
			}
			else{
		    oddcount+=1;
		    }
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}
}