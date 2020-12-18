package com.hello;

public class TestArray {
	public static void main(String args[])
	{
		int[] number=new int[5];
		number[0]=10;
		number[1]=20;
		number[2]=30;
		number[3]=40;
		number[4]=50;
		for(int i=0;i<number.length;i++)
		//for(int i=number.length-1;i>=0;i--)
			System.out.println(number[i]+" ");
	}

}
