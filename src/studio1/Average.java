package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("First integer:");
		int n1 = in.nextInt();
		
		System.out.println("Second integer:");
		int n2 = in.nextInt();
		
		System.out.print("Average = " + (n1+n2)/2.0);
	}

}
