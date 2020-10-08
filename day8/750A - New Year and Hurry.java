import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int total=240;
		int q=0;
		for (int i=1;i<n+1;i++)
		{
			total-=5*i;
			if(total>=k) {
			
			q++;
			}
			else {
				break;
			}
		}
		System.out.println(q);
		sc.close();
	}

}
