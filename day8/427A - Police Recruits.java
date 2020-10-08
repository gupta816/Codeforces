
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int ans=0;
		int tot=0;
		for(int i=0;i<n;i++)
		{
			int temp=sc.nextInt();
			if(temp!=-1) tot+=temp;
			else {
				if(tot==0) ans++;
				else tot--;
			}
		}

		System.out.println(ans);
		
		
		sc.close();
	}

}
