import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int total=a+b;
		
		int ma=Math.min(a, b);
		//System.out.println(ma);
		total=total-2*ma;
		//System.out.println(total);
		System.out.print(ma+" ");	
		System.out.print(total/2);
		
		
		sc.close();
	}

}
