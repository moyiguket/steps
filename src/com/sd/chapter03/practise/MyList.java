package com.sd.chapter03.practise;

/**
 * ѭ�������ʵ�֡�
 * @author da.sun
 *
 */
public class MyList {
	
	private MyNode start;
	
	private MyNode end;
	
	private static class MyNode{
		int data;
		MyNode pre;
		MyNode next;
		public MyNode(int data, MyNode pre, MyNode next) {
			super();
			this.data = data;
			this.pre = pre;
			this.next = next;
		}
		
	}
	
}
