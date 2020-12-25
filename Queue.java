package com.hello;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
	public static void main(String args[])
	{
		PriorityQueue<String> q1=new PriorityQueue<String>();
		q1.add("Moniga");
		q1.add("Pooja");
		q1.add("Preethi");
		q1.add("Preethi");
		System.out.println(q1);//Insertion same and duplicate
		
		//get head element element() peek()
        //System.out.println(q1.element());//exception
        //System.out.println(q1.peek());//null
        
        //return and removeremove and poll 
       /* System.out.println(q1.remove());//exception
        System.out.println(q1);
        System.out.println(q1.poll());//null
        System.out.println(q1);*/
		
		
		//return and read by iterator
		
	}

}
