package com.hello;

class Parent  //Super keyword 
           {
			Parent()
			{
				System.out.println("Parent Constructor");
			}
               int a=40;
		       void display()
		{
			System.out.println("PARENT CLASS");
		}
	}
	class Child extends Parent
	{
		//super();Implicitly called by the jvm
		Child()
		{
			System.out.println("Child Constructor");
		}
		
		int a=30;
		void display()
		{
			//System.out.println(b);
			System.out.println(a);
			System.out.println(super.a);
			System.out.println("CHILD Class");
			super.display();
		}
		}
	class ParentChild
	{
		public static void main(String args[])
	{
		Child obj = new Child();
		obj.display();
	}
}