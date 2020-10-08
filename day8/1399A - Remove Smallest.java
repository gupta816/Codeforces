
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			boolean flag=true;
			for(int i=0;i<n-1;i++)
			{
				if(Math.abs(arr[i]-arr[i+1])>1) {
					flag=false;
					break;
				}
			}
			if(flag==false) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
		
		
		sc.close();
	}

}
