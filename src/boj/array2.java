package boj;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {

		// N(배열 갯수),X(정수) 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 배열의 갯수를 입력하세요");
		int a = sc.nextInt();
		int arr[] = new int[a];

		System.out.println("배열에 들어갈 정수를 입력하세요");
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("정수를 입력하세요");
		int x = sc.nextInt();

		// 배열 만큼의 정수 입력
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < x)
				System.out.println(x+ " 보다 낮은 수는 " + arr[j] + "입니다.");
		}
	}
}
