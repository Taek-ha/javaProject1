package com.shinhan.day01;

public class Counter  {

	  int count = 0;

	  Counter() { 

	    count++;  

	    System.out.print(count + "$");  

	  }

	  public static void main(String[] args) {

	      Counter c1 = new Counter();

	       Counter c2 = new Counter();

	   }  

	}
