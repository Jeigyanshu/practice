package com.anshu.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add("D");
		lhs.add("A");
		lhs.add("B");
		lhs.add("B");
		lhs.add("A");
		System.out.println(lhs);
	}

}
