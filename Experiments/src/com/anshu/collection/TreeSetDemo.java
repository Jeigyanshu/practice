package com.anshu.collection;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add("Ziggy");
		ts.add("Anshu");
		ts.add("Jeigyanshu");
		System.out.println(ts);
		Iterator itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
