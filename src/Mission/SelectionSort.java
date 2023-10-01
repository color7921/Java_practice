	package Mission;
	
	
	import java.util.Random;
	
	
	
	public class SelectionSort {
	
		private int[] initializeArray() {
			
			Random rd = new Random();	
			int[] arr = new int[10];	
			
			int i, j;	
			for (i = 0; i < arr.length;) {	
				int r = rd.nextInt(1, 101); // 1 ~ 100	
			for (j = 0; j < i; j++) {	
				if (arr[j] == r)	
					break; //중복 금지
	
			}	
			if (j == i)
				arr[i++] = r;
		}	
		return arr;	
	}	
	private void printArray(int[] arr) {	
		for (int i : arr) {	
			System.out.print(i + " ");	
		}	
		System.out.println("\n" + "=".repeat(30));	
	}	
	
	private int[] sort(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			} 
		} return arr;
	}
		
//		// 1. 전체 배열에서 제일 큰 값을 검색 : 다음 배열로 넘어가면서 앞 배열과 비교 -> 크면 뒤로 옮기기
//		// 2. 찾은 제일 큰 값과 배열의 마지막 값을 swap	

		public static void main(String[] args) {	
			SelectionSort ss = new SelectionSort();	
			int[] arr = ss.initializeArray();	
			ss.printArray(arr);	
			arr = ss.sort(arr);	
			ss.printArray(arr);	
		}	
	}	