import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		
			{
			long a,b;
			a=sc.nextLong();
			b=sc.nextLong();
			
			long ans;
			
			if(a==b)
			{
				ans=0;
			}
			else if(a>b)
			{
				ans=((a-b)/10)+1;
				if((a-b)%10==0) ans-=1;
			}
			else {
				ans=((b-a)/10)+1;
				if((b-a)%10==0) ans-=1;
			}
			System.out.println(ans);
			
			}
		sc.close();
		
}
}
