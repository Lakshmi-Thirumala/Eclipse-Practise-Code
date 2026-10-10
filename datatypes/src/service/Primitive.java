package service;

public class Primitive {
	
	public static void main(String[] args) {
		
		byte age = 25;
		short year = 2026;
		int population = 1000000;
		long distance = 10000000098L;
		
		float price = 99.99f;
		double pi = 3.149896378695;
		
		char grade = 'A';
		boolean isJavaFun = true;
		
		System.out.println(age);
		System.out.println(year);
		System.out.println(population);
		System.out.println(distance);
		System.out.println(price);
		System.out.println(pi);
		System.out.println(grade);
		System.out.println(isJavaFun);
		
		String s = "name";
		System.out.println(s);
		System.out.println(s.getClass().getName());
		System.out.println(s.getClass().getSimpleName());
		
		int a= 5;
		int b=2;
		float f = 2.0f;
		float g = 3.5f;
		
		System.out.println("a+b"+a +b+f);
		System.out.println(a+f);
		System.out.println(a/f);
		System.out.println(a/b);
		System.out.println(a%f);
		System.out.println(a%b);
		
	}

}
