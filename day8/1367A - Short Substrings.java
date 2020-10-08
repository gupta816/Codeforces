
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=-1)
		{
			String st=sc.nextLine();
			if(st.length()<3)
			{
				System.out.println(st);
			}
			else {
				String st2=""+st.charAt(0);
			
				for(int i=1;i<st.length();i+=2)
				{
					st2+=(st.charAt(i));
				}
				
				
				System.out.println(st2);
			}
			
			
			
		}
		
		
		sc.close();
	}

}
