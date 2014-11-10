package p1;

import java.util.Scanner;

public class Exe {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This is version 2");
		
		System.out.print("Input the first number: ");
		int var1 = input.nextInt();
		
		System.out.print("Input the second number: ");
		int var2 = input.nextInt();
		
		System.out.println("The answer of adding 2 numbers is: " + (var1+var2));
	}
}
