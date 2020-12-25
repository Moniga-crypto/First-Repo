package com.hello;

import java.util.Hashtable;

public class Hashtable1 {
	public static void main(String args[]) {
		Hashtable ht=new Hashtable();//capacity is 11,load factor is 0.75
		//Hashtable ht = new Hashtable(initial capacity)//create 
		//Hashtable ht = new Hashtable(initial capacity,load factor);
		ht.put(101, "name1");
		ht.put(102, "name2");
		ht.put(103, "name3");
		ht.put(104, "name4");
		System.out.println(ht);
		System.out.println(ht.get(104));
		System.out.println(ht.remove(104));
		System.out.println(ht);
		System.out.println(ht.containsKey(102));
		System.out.println(ht.containsValue("name1"));
	}

}
