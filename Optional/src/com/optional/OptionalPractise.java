package com.optional;

import java.util.Optional;

public class OptionalPractise {
	
	public static void main(String... args) {
		
		String name = "fayaz";
		System.out.println(name.length());
		
//		String name1 = null;
//		System.out.println(name1.length());//gives NullPointerException
		
		//to overcome this  we useOptional
		
		Optional<String> name2 = Optional.of(name);
		System.out.println(name2.get().length());
		
//		Optional<String> name3 = Optional.of(null); //-- still we get null opinter exception
//		System.out.println(name3.get().length());
		
//		Optional<String> empty = Optional.empty();  //No Such elemnt exception
//		System.out.println(empty.get());
		
		
		//the purpose of using optional is not to getr Null pointer exception
		
//		Optional<String> name4 = Optional.ofNullable(null);//saying value can be null
//		System.out.println(name4.get());// but if we use get value still then we land into a problem again
		
		Optional<String> name5 = Optional.ofNullable(null);//saying value can be null
		System.out.println(name5.orElse("Invalid"));//exception getting handled here 
		
		Optional<String> name6 = Optional.ofNullable(null);//saying value can be null
		System.out.println(name6.orElseThrow(()-> new RuntimeException("Give correct value") ) );//exception getting handled here 
		
		Optional<String> name7 = Optional.ofNullable(null);
		if(name7.isPresent()){
			System.out.println(name7.get());
		}else {
			System.out.println("Invalid input");
		}
		
		Optional<String> name8 = Optional.of(null);//it throws null pointer exception it cannot handle 
		if(name8.isPresent()){
			System.out.println(name7.get());
		}else {
			System.out.println("Invalid input");
		}
			
			
		
		
		
	}

}
