package learnAskInterview;

import java.util.Scanner;

public class LearnAaramStrong {

	public static void main(String[] args) {
		
		
		// number 153 = 3^3 + 5^3 + 1^3 
		System.out.println("Check Number is Amstrong Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem;
		int a=num;
		int total=0;
		
		while(num>0) {
			
			rem=num%10;
			total=total+(rem*rem*rem);
			num=num/10;
		}
		
		if(total==a) {
			
			System.out.println(a +"is Amstrong number");
		}
		
		else {
			System.out.println(a +"Not amstrong Number");
		}
		
		

	}

}
