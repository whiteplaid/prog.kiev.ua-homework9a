package com.homework.list;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int number = 10;
		fullfil(number);
		

	}
	public static <T> void fullfil (T element) {
		ArrayList<T> list = new ArrayList<>();
		for (int i = 0; i < 10;i++) {
			list.add(element);
		}
		for (int i = 0; i < 2; i++) {
			list.remove(i);
		}
		list.remove(list.size()-1);
		System.out.println(list);
	}

}
