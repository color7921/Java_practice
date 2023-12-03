package mission;

import java.io.BufferedReader;
import java.io.FileReader;

public class BigNumber_KHJ {

	public static void main(String[] args) {
		
		try {
			//File file = new File("numfile1.txt");
			//FileReader filereader = new FileReader("numfile1.txt");
			BufferedReader br = new BufferedReader(new FileReader("numfile1.txt"));
			String s1 = br.readLine();
			String s2 = br.readLine();
			
			String[] a1 = s1.split("");
			String[] a2 = s2.split("");
			
			int[] num1 = new int[a1.length];
            for (int i = 0; i < a1.length; i++) {
                num1[i] = Integer.parseInt(a1[i]);
            }
            
            int[] num2 = new int[a2.length];
            for (int j = 0; j < a2.length; j++) {
                num2[j] = Integer.parseInt(a2[j]);
            }
		}
		 catch(Exception e)
	}
            public static void reverseArray(int[] arr) {
    	        for (int i = 0; i < arr.length / 2; i++) {
    	            int temp = arr[i];
    	            arr[i] = arr[arr.length - 1 - i];
    	            arr[arr.length - 1 - i] = temp;
    	        }
    	        reverseArray(num1);
                reverseArray(num2);
            }
            
            
	}

 //12345랑 6789를 각각 문자열로 만들고 배열로 바꾸기 -> split 
		
		
// 입력 12345 + 6789 출력 {5,4,3,2,1} + {9,8,7,6} -> {14,12,10,8,1} -> 4,3,1,9,1
// ->19134

// 텍스트 파일 읽기
// 숫자 배열로 분리
// 리버스 두 번
// byte로 분리


