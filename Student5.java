package com.hello;

class Student5{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    Student5(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Student5(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Student5 s1 = new Student5(111,"Karan");  
    Student5 s2 = new Student5(222,"Aryan",25); 
    Student5 s3=new Student5(123,"kavs");
    Student5 s4 = new Student5(555,"nand",30);
    s1.display();  
    s2.display();  
    s3.display();
    s4.display();
   }  
}
