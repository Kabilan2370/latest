package com.first_operation.in;
import java.util.Scanner;
public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a two numbers :");
		Scanner an = new Scanner(System.in);
		int a = an.nextInt();
		int b = an.nextInt();
		
		int lcm = (a > b) ? a : b;
		
		while(true) {
			if(lcm % a == 0 && lcm % b == 0) {
				System.out.println(lcm);
				break;
			}++lcm;
		}
	}

}
