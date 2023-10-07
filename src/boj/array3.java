package boj;

import java.util.Arrays;
import java.util.Scanner;

public class array3 {
	public static void main(String[] args) {
		// 정수 입력
		Scanner sc = new Scanner(System.in);

		// 배열 입력
		int a = sc.nextInt();
		int arr[] = new int[a];

		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();

		}
		sc.close();
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[a - 1]);

		// 최댓값, 최솟값 출력
	}
}
