package com.streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FiltersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,3,4,5};
		IntStream stream = Arrays.stream(arr);
		stream.limit(3).forEach(System.out::println);
		stream.distinct().forEach(System.out::println);
		stream.skip(3).forEach(System.out::println);
		
		int ar2[]= {5,10,15,20};
		IntStream stream2 = Arrays.stream(ar2);
		OptionalInt optional =stream2.reduce((a,b)->{ return a+b;});
		if optional.isPresent(){
		int result = optional.getAsInt();
		System.out.println("res"+result);
		}
		
		
	
	}

}
