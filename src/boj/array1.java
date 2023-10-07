package boj;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {

		//배열 만들기
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		//배열값 입력
		for(int i =0; i<a; i++) {
			arr[i] =sc.nextInt();
		}
		//배열과 같은 값이면 count를 올리기
		for(int j = 0; j<arr.length; j++) {
			if(j==arr[j]);
			count++;
		}
		
		//count 출력
		
		System.out.println(count);
	}
}
