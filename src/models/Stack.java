package models;

import java.util.Arrays;

public class Stack {
	private String[] stackArray;
	
	private int stackSize;
	
	private int topOfStack = -1;
	
	Stack(int size){
		stackSize = size;
		
		stackArray = new String[size];
		
		Arrays.fill(stackArray, "-1");
	}
	
	public void push(String input){
		if(topOfStack +1 < stackSize){
			topOfStack++;
			
			stackArray[topOfStack] = input;
		}
		else{
			System.out.println("No room in Stack");
		}
	}
	
	public String pop(){
		if(topOfStack >= 0){
			stackArray[topOfStack] = "-1";
			
			return stackArray[topOfStack--];
		}
		else{
			System.out.println("Stack is empty");
			return "-1";
		}
	}
	
	public String peek(){
		return stackArray[topOfStack];
	}
}
