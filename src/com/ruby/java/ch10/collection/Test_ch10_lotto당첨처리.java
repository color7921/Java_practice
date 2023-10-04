package com.ruby.java.ch10.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class ListComparator2 implements Comparator<List<Integer>> {
	@Override
	public int compare(List<Integer> l1, List<Integer> l2) {
		Iterator<Integer> ait = l1.iterator();
		Iterator<Integer> bit = l2.iterator();
		while (ait.hasNext()) {
			int anum = ait.next();
			int bnum = bit.next();
			if (anum > bnum)
				return 1;
			else if (anum < bnum)
				return -1;
		}
		return 0;
	}
}
public class Test_ch10_lotto당첨처리 {

	public static void main(String[] args) {

		lotto_generator(5000);

		
	}

	public static void lotto_generator(int n) {
		Random number = new Random();
		HashSet<HashSet<Integer>> lot = new HashSet<>(); 
		//HashSet<Integer>하나의 복권번호 HashSet<HashSet<Integer>> 복권번호 묶음
		HashSet<Integer> lotto = null;
		List<List<Integer>> al = new ArrayList<>();
		//복권을 담는 과정
		for (int i = 0; i < n; i++) {

			lotto = new HashSet<>();

			for (int j = 0; lotto.size() < 7; j++) {//6개 번호와 보너스 번호
				lotto.add(number.nextInt(1, 46));
			}
			lot.add(lotto);
			
			List<Integer> L = new ArrayList<>(lotto);
			Collections.sort(L);
			
			//오름차순
			//System.out.println(L);
			al.add(L);
			//리스트 L을 al에 추가
		}
		System.out.println("lot = " + al);
		
		
		Collections.sort(al, new ListComparator2());
		//al 내부의 리스트를 정렬
		//al.sort(new ListComparator()); 위의 코드랑 같은 뜻
		System.out.println("lot = " + al);
		//hashset의 리스트를 정렬하는 알고리즘 개발
		//hashset를 arrayList로 변환
		//당첨번호 추첨
		HashSet<Integer> win = new HashSet<>();
		//당첨 번호를 저장하기 위한 HashSet 객체 생성 코드
		for (int j = 0; win.size() < 7; j++) {//6개 번호와 보너스 번호
			win.add(number.nextInt(1, 46));
		}
		System.out.print("당첨번호: " + win);//6개의 당첨번호와 보너스번호
		// 6개를 맞힌 복권을 찾는다 
		System.out.println();
		winnerLotto(win, al);//1등을 찾는다
		
	}
	static void winnerLotto(HashSet<Integer> w,List<List<Integer>> al ) {
		for (int i = 0; i < al.size(); i++) {
			checkWinner(w, al.get(i));
		}
	}
	static void checkWinner(HashSet<Integer> w,List<Integer> elem) {

		int count = 0;
		List<Integer> L = new ArrayList<> (w);
		Collections.sort(L);
		for (int i = 0; i < elem.size()-1; i++)
		{
			Integer num = L.get(i);
			//arraylist에만 get 사용 가능
			  //HashSet<Integer> w2 = w;
			if (elem.contains(num)) { //elem은 리스트
	                count++;
		}
		switch (count) {
		case 0:
		case 1:
		case 2:
			//System.out.println("꽝");
			break;
		case 3:
			//System.out.println("5등 복권 " + elem + " 당첨번호:" + L);
			break;
		case 4:
			System.out.println("4등 복권 " + elem + " 당첨번호:" + L);
			break;
		case 5:
			if (elem.get(6).equals(L.get(6))) 
			{
				System.out.println("2등 복권 " + elem + " 당첨번호:" + L);
				break;
			}
			else {
				System.out.println("3등 복권 " + elem + " 당첨번호:" + L);
				break;
			}
			
		case 6:
			System.out.println("1등 복권 " + elem + " 당첨번호:" + L);
			break;
		}
		}
		
	}

}
