package com.homework.list;

import java.util.ArrayList;

public class List <T>{
	private ArrayList<T> list = new ArrayList<T>();

	public List(ArrayList<T> list) {
		super();
		this.list = list;
	}

	public List() {
		super();
	}

	private ArrayList<T> getList() {
		return list;
	}

	private void setList(ArrayList<T> list) {
		this.list = list;
	}
	public void addElement (T element) {
		list.add(element);
		
	}
}
