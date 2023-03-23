package com.shinhan.day11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.shinhan.day05.Account;

public class StreamTest {

	public static void main(String[] args) {
		f3();
	}

	
	private static void f5() {
		Set<Account> data1 = new HashSet<>();
		
	}

	private static void f4() {
		Account[] arr = {new Account("1234", "택1"),new Account("1235", "택2"),new Account("1236", "택3")};
		List<Account> data1 = Arrays.asList(arr);
		data1.stream().forEach(acc->System.out.println(acc));
		
	}

	private static void f3() {
		Account[] arr = {new Account("1234", "택1"),new Account("1235", "택2"),new Account("1236", "택3")};
		
		Arrays.stream(arr).forEach(acc->System.out.println(acc));
	}

	private static void f2() {
		String[] arr1 = {"자바","웹","front","back","framework"};
		// 1. 내부반복자를 이용하고자한다면 먼저 stream을 얻는다.
		Stream<String> st = Arrays.stream(arr1);
		// 2. 내부반복자로 값을 처리한다
		Consumer<String> consumerF = (s)->{
			System.out.println(s + "******");
		};
		st.forEach(consumerF);
		
		Arrays.stream(arr1).forEach((s)->{
			System.out.println(s + "@@@@@@@");
			
		});
	}

	private static void f1() {
		// 1. 배열
		int[] arr1 = new int[] {100,30,70,20,50};
		Arrays.stream(arr1).forEach(a->System.out.println(a));
		
		// original stream
		IntStream is = Arrays.stream(arr1);		
		IntConsumer func1 = (a)->{
			System.out.println("a=" + a);
		};
		is.forEach(func1);
	}

}
