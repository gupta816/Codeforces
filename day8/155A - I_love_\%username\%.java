import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int am=0;
		int imin=arr[0];
		int imax=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>imax)
			{
				am++;
				imax=arr[i];
			}
			else if(arr[i]<imin)
			{
				am++;
				imin=arr[i];
			}
			
		}
		System.out.println(am);
		
	
		
		
		
		sc.close();
	}

}
