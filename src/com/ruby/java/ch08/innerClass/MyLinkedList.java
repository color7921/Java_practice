package com.ruby.java.ch08.innerClass;


public class MyLinkedList {

	public Node head = null;
	
	private class Node { // 내부 클래스
		private String data; //칸 생성
		private Node link; // 칸 생성
		
		public Node(String data) {
			this.data = data;
		}
	}
	
	public MyLinkedList() {}
	//연결 리스트(*****중요*****)
	public void add(String data) {
		Node newNode = new Node(data); // 공간 할당
		if(head == null) {
			head = newNode;
		} else {
			Node next = head; //변수 선언
			while(next.link != null) { // 2개의 java, link 칸 중에 link를 가리킴(null) java -> link -> html 순서대로
				next = next.link;
			}
			next.link = newNode;
		}
	}
	
	public void print() {
		if(head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while(next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}
}
