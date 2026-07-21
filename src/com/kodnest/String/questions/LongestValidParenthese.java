package com.kodnest.String.questions;

import java.util.Scanner;
import java.util.Stack;

public class LongestValidParenthese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ------------ take user input -------------
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Parenthese:- ");
		String s = sc.next();
		
		int res = longPara(s);
		System.out.println(res);
		

	}
	
	public static int longPara(String str) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(-1);
		
		int maxlength = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if (ch == '(') {
				stack.push(i);
			} 
			else {
				stack.pop();
				
				if (stack.isEmpty()) {
					stack.push(i);
				} else {
					maxlength = Math.max(maxlength, i - stack.peek());
				}
			}
				
		}
		
		return maxlength;
	}

}
