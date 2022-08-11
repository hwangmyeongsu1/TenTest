package com.hw1.controller;

public class TokenController {
	
	public String afterToken(String str) {
		String str1 = str.replaceAll(" ","");
		return str1;
	}
	public String firstCap(String input) {
		input = input.substring(0,1).toUpperCase() + input.substring(1);
		return input;
	}
	public int findChar(String input, char one) {
		return 0;
	}
	
	
}
