import java.util.*;
public class Main
{ 
    static int ver=4;
    static List<Integer>[] gr=new ArrayList[4];
	public static void main(String[] args) {
	    for(int i=0;i<ver;i++){
	        gr[i]=new ArrayList<>();
	    }
	    addn(0,1);
	    addn(0,2);
	    addn(1,2);
	    addn(2,3);
	    print();
	}
	static void addn(int i,int j){
	    gr[i].add(j);
	     gr[j].add(i);
	}
	static void print(){
	    for(int i=0;i<ver;i++){
	        System.out.print(i+":");
	        for(int ver:gr[i]){
	            System.out.print(ver+" ");
	        }
	        System.out.println();
	    }
	}
}
