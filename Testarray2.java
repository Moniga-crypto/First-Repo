package com.hello;

public class Testarray2 {
	static void min(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]+" ");
	}
	public static void main(String args[]) {
		//min(new int[] {3,4,6,7,8,9}); passing anonymous array to method(need not declare an array)
		int a[]= {1,2,3,4,5};  // declaring and initializing
		min(a);  //passing array to method
	}
}
