package boj;

import java.util.Scanner;

public class 두수비교 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A > B) {
			System.out.println(">");
		}
		if (A < B) {
			System.out.println("<");
		}
		if (A == B) System.out.println("==");
	}
}
