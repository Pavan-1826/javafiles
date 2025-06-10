import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int []arr=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
		    int mini=i;
		    for(int j=i;j<arr.length;j++){
		        if(arr[j]<arr[mini]){
		            mini=j;
		        }
		    }
		    int temp=arr[i];
		    arr[i]=arr[mini];
		    arr[mini]=temp;
		}
		for(int i=0;i<5;i++){
		    	System.out.println(arr[i]);
		}
	
	}
}
