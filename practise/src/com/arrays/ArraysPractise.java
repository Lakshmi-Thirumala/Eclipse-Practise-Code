package com.arrays;

import java.util.Scanner;

public class ArraysPractise {
	
	public static void main(String args[]) {
		
		ArraysPractise  arp = new ArraysPractise();
//		arp.byteValuesMethod();
//		arp.shortValuesMethod();
//		arp.intValuesMethod();
		//arp.longValuesMethod();
	//	arp.floatValuesMethod();
//		arp.doubleValuesMethod();
//		arp.charValuesMethod();
		arp.StringValuesMethod();
		}
	
	void byteValuesMethod() { 
		System.out.println("Enter byte values :");
		System.out.println("Enter size of byte array : ");
		Scanner byteSize = new Scanner(System.in);
		int byteValue = byteSize.nextInt();
		byte[] byteValues = new byte[byteValue];
		for(int i=0;i<byteValue;i++) {
			byteValues[i]= byteSize.nextByte();
		}
		for(int i = 0 ; i<byteValue;i++) {
			System.out.println(byteValues[i]);
		}
		
	}
	
	void shortValuesMethod() { 
		System.out.println("Enter short values :");
		System.out.println("Enter size of shortarray : ");
		Scanner shortSize = new Scanner(System.in);
		int shortValue = shortSize.nextInt();
		short[] shortValues = new short[shortValue];
		for(int i=0;i<shortValue;i++) {
			shortValues[i]= shortSize.nextShort();
		}
		for(int i = 0 ; i<shortValue;i++) {
			System.out.println(shortValues[i]);
		}
		
	}
	
	void intValuesMethod() { 
		System.out.println("Enter int values :");
		System.out.println("Enter size of intarray : ");
		Scanner intSize = new Scanner(System.in);
		int intValue = intSize.nextInt();
		int[] intValues = new int[intValue];
		for(int i=0;i<intValue;i++) {
			intValues[i]= intSize.nextInt();
		}
		for(int i = 0 ; i<intValue;i++) {
			System.out.println(intValues[i]);
		}
		
	}
	
	void longValuesMethod() { 
		System.out.println("Enter long values :");
		System.out.println("Enter size of longarray : ");
		Scanner longSize = new Scanner(System.in);
		int longValue = longSize.nextInt();
		long[] longValues = new long[longValue];
		for(int i=0;i<longValue;i++) {
			longValues[i]= longSize.nextLong();
		}
		for(int i = 0 ; i<longValue;i++) {
			System.out.println(longValues[i]);
		}
		
	}
	
	void floatValuesMethod() { 
		System.out.println("Enter float values :");
		System.out.println("Enter size of floatarray : ");
		Scanner floatSize = new Scanner(System.in);
		int floatValue = floatSize.nextInt();
		float[] floatValues = new float[floatValue];
		for(int i=0;i<floatValue;i++) {
			floatValues[i]= floatSize.nextFloat();
		}
		for(int i = 0 ; i<floatValue;i++) {
			System.out.println(floatValues[i]);
		}
		
	}
	
	void doubleValuesMethod() { 
		System.out.println("Enter double values :");
		System.out.println("Enter size of doublearray : ");
		Scanner doubleSize = new Scanner(System.in);
		int doubleValue = doubleSize.nextInt();
		double[] doubleValues = new double[doubleValue];
		for(int i=0;i<doubleValue;i++) {
			doubleValues[i]= doubleSize.nextDouble();
		}
		for(int i = 0 ; i<doubleValue;i++) {
			System.out.println(doubleValues[i]);
		}
		
	}
	
	void charValuesMethod() { 
		System.out.println("Enter char values :");
		System.out.println("Enter size of chararray : ");
		Scanner charSize = new Scanner(System.in);
		int charValue = charSize.nextInt();
		char[] charValues = new char[charValue];
		for(int i=0;i<charValue;i++) {
			charValues[i]= charSize.next().charAt(0);
		}
		for(int i = 0 ; i<charValue;i++) {
			System.out.println(charValues[i]);
		}
		
	}
	
	void StringValuesMethod() { 
		System.out.println("Enter String values :");
		System.out.println("Enter size of Stringrray : ");
		Scanner stringSize = new Scanner(System.in);
		int stringValue = stringSize.nextInt();
		stringSize.nextLine();
		String[] stringValues = new String[stringValue];
		for(int i=0;i<stringValue;i++) {
			stringValues[i]= stringSize.nextLine();
		}
		for(int i = 0 ; i<stringValue;i++) {
			System.out.println(stringValues[i]);
		}
		
	}


}
