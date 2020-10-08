import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int c=sc.nextInt();
		int req=1;
		int temp=s;
		while(true)
		{
			temp=s*req;
	
			
			if(temp%10==c || temp%10==0)
			{
				break;
			}
			req++;
			
		}
		
		System.out.println(req);
		
		sc.close();
	}

}
