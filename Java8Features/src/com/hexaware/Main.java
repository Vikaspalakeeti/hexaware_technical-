package com.hexaware;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface m=(int a, int b)->{return a+b;};
		int res = m.add(8, 8);
		System.out.println("result : "+res);
	}

}
