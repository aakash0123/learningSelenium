import java.util.*;

public class Fib {
	public static void main (String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int i =0;
		int j = 1 ;
		
		System.out.println(i + " "+ j);
		
		for (j= 2 ; j<=count ; j++)
		{
			
			int k = i + j  ;
			System.out.println(k );
		}
		
	}
}
