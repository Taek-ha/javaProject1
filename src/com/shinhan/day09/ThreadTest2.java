package com.shinhan.day09;


public class ThreadTest2 {

	
	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		// Thread를 익명구현객체로 만들기
		// Thread t1 = new MyThread1();
		// Thread t2 = new MyThread2();
		// Runnable r = new MyThread3();
		// Thread t3 = new Thread(r);
		Thread t1 = new Thread() {
			@Override
			public void run() {	
				for(int i=1; i<=26; i++) {
					System.out.println("["+getName()+"] i="+ i);
				}		
			} // run
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {	
				for(char i='A'; i<='Z'; i++) {
					System.out.println("["+getName()+"] i="+ i);
				}
				
			} // run
		};
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(char i='a'; i<='z'; i++) {
					System.out.println("["+Thread.currentThread().getName()+"] i="+ i);
				}			
			}
		});
		t1.start();
		t2.start();
		t3.start();
	}

}
