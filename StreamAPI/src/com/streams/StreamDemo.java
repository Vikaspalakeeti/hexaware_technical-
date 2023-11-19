package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {34,12,67,55,23,11};
		Stream<Integer> stream1 = Arrays.stream(arr);
		//stream1.forEach( (element)->{System.out.println(element);} );
		stream1.forEach( (element)->{System.out.println(element);} );
		stream1.forEach( System.out::println);// this is also a lambda expression 
		// if we want to store data without printing
		
		List list = Arrays.asList(arr);
		Stream<Integer> stream2 = list.stream();
		
		int a1[]=stream2.filter((element)->{ return element > 20; })
		.mapToInt((element)->{return element;})
		.toArray();
		
		IntStream stream3 = Arrays.stream(a1);
		System.out.println("filter");
		stream3.forEach(System.out::println);
		
		
		
		

	}

}
