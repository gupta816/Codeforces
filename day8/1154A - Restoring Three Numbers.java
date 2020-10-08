
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int w=sc.nextInt();
		
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(x);
		arr.add(y);
		arr.add(z);
		arr.add(w);
		Collections.sort(arr);
		
		int c=arr.get(3)-arr.get(2);
		int b=arr.get(3)-arr.get(1);
		int a=arr.get(3)-arr.get(0);
		
		System.out.println(a+" "+b+" "+c+" ");
		
	
		
		
		
		sc.close();
	}

}
