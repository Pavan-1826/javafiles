import java.util.*;
public class evenmain{
	public static void main(String[] args){
		int [] a=new int [5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0){
			    count+=1;
			}
		}
		System.out.println(count);
	}
}