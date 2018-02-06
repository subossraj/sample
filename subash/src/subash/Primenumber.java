package subash;

import java.unit.*;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		
		int a;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter your number :");
		
		a = sc.nextInt();
		
		System.out.println("your input is :" + a);
		
		for(int i=2;i<=a/2;i++)
		{
			if(a%i == 0)
				
			{
		
		
		System.out.println("not prime:"+i);
		break;
	}
	
	else
	{
		System.out.println("prime:"+i);
		continue;
	}
}}
}
