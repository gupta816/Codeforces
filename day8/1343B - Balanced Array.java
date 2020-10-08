
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)  
		{
			int n=sc.nextInt();
			int x=n/2;
		
			if(n%4==0)
			{
				System.out.println("YES");
				for(int i=0;i<n;i++)
				{
					if(i<x)
					{
						System.out.print(2*(i+1)+" ");
					}
					else {
						if(i==n-1)
						{
							System.out.println((2*(i-x)+1)+x);
						}
						else {
						System.out.print((2*(i-x)+1)+" ");
						}
					}
				}
			}
			else {
				System.out.println("NO");
			}
			
		
		}
		sc.close();
	}

}
