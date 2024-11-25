import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int k=sc.nextInt();
 
        long[] a=new long[100005];
        for(int i=0;i<k;i++)a[i]=1;
 
        for(int i=k;i<100005;i++){
            a[i]=(a[i-1]+a[i-k])%1000000007;
        }
        long[] sum=new long[100005];
 
        long z=0;
        for(int i=0;i<100005;i++){
            z=(z+a[i])%1000000007;
            sum[i]=z;
        }
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
 
            z=sum[y]-sum[x-1];
            if(z<2)z+=1000000007;
            sb.append(z+"\n");
        }
        System.out.println(sb);
 
    }
}
