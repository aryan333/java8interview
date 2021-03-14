package hackerEarth;
import java.util.*;
public class TestClass1 {
	
	public static void main(String args[] ) throws Exception {
		
		/*
		 * Read different types of data from standard input, process them as shown in
		 * output format and print the answer to standard output.
		 * 
		 * Input format: First line contains integer N. Second line contains string S.
		 * 
		 * Output format: First line should contain N x 2. Second line should contain
		 * the same string S.
		 */
        

        // Write your code here
		Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        sc.nextLine();
        String story = sc.nextLine();
         

      
       System.out.println(number*2);
       System.out.println(story);
       

    }

}
