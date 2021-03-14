package learnAskInterview;

import java.util.Scanner;

public class NumberPower {
	
	public static void main(String[] args) {
		
		int p=1;
		int n;
		int num;
		
		System.out.println("Enter number");
		
		Scanner sc=new Scanner(System.in);
		Integer i1=sc.nextInt();
		
        System.out.println("Enter power");
		
		Scanner sc1=new Scanner(System.in);
		Integer i2=sc1.nextInt();
		
		num=i1;
		n=i2;
		
		while(n>=1) {
			
			p=p*i1;
			n--;
		}
		
		
		System.out.println(p);
		System.out.println(Math.sqrt(p));
		
	}

}
