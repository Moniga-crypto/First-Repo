package com.hello;
import java.util.*;  
public class MapExample1 {    
	 public static void main(String args[]){  
	  Map<Integer,String> map=new HashMap<Integer,String>();  
	  map.put(100,"Amit");  
	  map.put(101,"Vijay");  
	  map.put(102,"Rahul");  
	  map.put(103, "n");
	  System.out.println(map);
	  //map.get(100);
	  System.out.println(map.get(100));
	  System.out.println(map.size());
	  System.out.println(map.containsKey(105));
	  System.out.println(map.containsValue("vij"));
	  System.out.println(map.keySet());
	  System.out.println(map.values());
	  System.out.println(map.entrySet());
	  for(Integer i:map.keySet())
	  {
		  System.out.println(i+" "+map.get(i));
	  }
	  //for (Integer i : map.keySet())
	  //{
		//  System.out.println(i+"    "+map.get(i));
	  //}
	  //Elements can traverse in any order 
	  System.out.println("After");
	  for(Map.Entry m:map.entrySet()){  
	  System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
	}  
