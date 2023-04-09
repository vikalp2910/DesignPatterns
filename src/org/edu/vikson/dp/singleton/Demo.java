package org.edu.vikson.dp.singleton;

class Demo{
	public static void main(String[] args) {
		//Test t1= new Test();
		
		Test obj1=Test.getInstance();
		Test obj2=Test.getInstance();
		
		System.out.println("=======method 1=============");
		System.out.println(obj1.hashCode());	
		System.out.println(obj2.hashCode());
		
		
		Test1 obj3=Test1.getInstance();
		Test1 obj4=Test1.getInstance();	
		
		System.out.println("=======method 2=============");
		System.out.println(obj3.hashCode());	
		System.out.println(obj4.hashCode());
		
		
		Test2 obj5=Test2.getInstance();
		Test2 obj6=Test2.getInstance();	
		
		System.out.println("=======method 3=============");
		System.out.println(obj5.hashCode());	
		System.out.println(obj6.hashCode());
		
		
		
	}
}
