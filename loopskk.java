package testClassess;

import java.util.Scanner;

public class loopskk {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
//		int nums =1;
		int today =00;
//		while (nums <= 10) {
//			
//			System.out.println(nums);
//			nums += 1;
		
//		---------------------------- greatest of 3 numbers ---------------------------------------------------------------
		
//		System.out.println("Enter A");
//		int a = input.nextInt();
//		System.out.println("Enter B");
//		int b = input.nextInt();
//		System.out.println("Enter C");
//		int c = input.nextInt();
//		
//		if (a>b && a>c) {
//			System.out.println("Greatest is A " + a);
//		}
//		else if (b>a && b>c) {
//			System.out.println("Greatest is B " + b);
//		}
//		else {
//			System.out.println("Greatest is C " + c);
//		}
//		
//		int max = a;
//		if(b>max) {
//			max =b;
//		}
//		if (c>max) {
//			max = c;
//		}
//		
//		System.out.println("Maximum is " + max);
//		System.out.println(Math.max(10, 20));
//		
//		System.out.println("Sabse Bda " + Math.max(a, Math.max(b,c)));
		
//		 --------------- CASE CHECK ------------------------------------------------------------------------------
		
//		System.out.println("Enter a Letter");
//		char ch = input.next().charAt(0);
//		
//		if(ch >= 'A' && ch <= 'Z') {
//			System.out.println("It is Uppercase");
//		}
//		else {
//			System.out.println("It is lowercase");
//		}
//	
		
//		--------------- FIBBONACCCCIII SERIES -----------------------------------------------------------------
		
//		int first  =0;
//		int second = 1;
//		
//		int result = 0;
//		int n = input.nextInt();
//		System.out.println(0);
//		System.out.println(1);
//		for (int i=2; i<=n; i++) {
//			result = first +second;
//			first = second;
//			second = result;
////			System.out.println(result);
//		}
//		
//		System.out.println(result);
		
//		----------------------- Count how many times number coming --------------------------------------------
		
//		 int n = 12234278;
//		 
//		 int count =0;
//		 while (n>0) {
//			 
//			 int rem = n%10;
//			 if (rem == 2) {
//				 count ++;
//			 }
//			 
//			 n /= 10;
//		 }
//		 
//		 System.out.println(count);
		
		
//	-------------------------REVERSE A NUMBER---------------------------------------------
//		int number = 6389541;
//		
//		while (number>0) {
//			int rem = number %10;
//			System.out.print(rem);
//			number /=10;
//		}
		
//		int number = 6389541;
//		int ans = 0;
//		while (number>0) {
//			int rem = number %10;
//			number /=10;
//			
//			ans = ans*10+rem; 
//		}
//			System.out.println(ans);
		
//	--------------------------- CALCULATOR -----------------------------------------------------------------
		
		System.out.println("Enter first Number");
		int num1 = input.nextInt();
		System.out.println("Enter Second Number");
		int num2 = input.nextInt();
		
		System.out.println("Enter operation");
		char ch = input.next().trim().charAt(0);
		
		if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch =='%') {
			
			if(ch == '+') {
				System.out.println(num1 + num2);
			}
			if(ch == '-') {
				System.out.println(num1 - num2);
			}
			if(ch == '*') {
				System.out.println(num1 * num2);
			}
			if(ch == '/') {
				if (num2 >0) {
				System.out.println(num1 / num2);
				}
				else {
					System.out.println("Can't Divide by ZERO");
				}
			}
			if(ch == '%') {
				if (num2 >0) {
					System.out.println(num1 % num2);
					}
					else {
						System.out.println("Can't Modulo by ZERO");
					}
			}
		}
		else {
			System.out.println("Please Enter correct operation");
		}
		
		
		}
	}

