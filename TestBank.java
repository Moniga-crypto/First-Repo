package com.hello;

abstract class Bank {
	abstract int getRateofInterest();
}
class SBI extends Bank{
	int getRateofInterest() {
		return(7);
	}
}
class PNB extends Bank{
	int getRateofInterest() {
		return(9);
	}
}
class TestBank{
	public static void main(String[] args) {
		Bank obj;
		obj=new SBI();
		Bank obje;
		obje=new PNB();
		System.out.println("Rate of Interest is:"+obj.getRateofInterest()+"%");
		//obj.getRateofInterest();
		System.out.println("Rate of Interest is:"+obje.getRateofInterest()+"%");

		//obje.getRateofInterest();
	}
}