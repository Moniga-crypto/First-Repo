package com.hello;

import java.util.ArrayList;
import java.util.Iterator;
public class Collection {
	public static void main(String args[]) {
		ArrayList <Integer> al=new ArrayList<Integer>();
		//List al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		System.out.println(al);
		System.out.println("Number of elements:"+al.size());
		//al.contains(500);
		System.out.println(al.contains(500));
		System.out.println(al.get(2));
		System.out.println(al.set(1,1000));
		System.out.println(al);
	}
	}
