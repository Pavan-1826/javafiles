public class Main {
     public static int fib(int n,int[] memo){
        if(memo[n]!=-1) return memo[n];
    if(n<=1) return n;
    memo[n]=fib(n-1,memo)+fib(n-2,memo);
    return memo[n];
    }
    public static void main(String[] args) {
    int n=4;
    int [] memo=new int[n+1];
       memo[1]=1;
    for(int i=2;i<memo.length;i++){
        memo[i]=memo[i-1]+memo[i-2];
    
    }
    System.out.println(memo[n]);
    }
}
