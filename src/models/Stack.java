package models;

import java.util.ArrayList;

public class Stack {
	private ArrayList<Object> stackArray;
	
	public Stack(){
		stackArray = new ArrayList<Object>();
	}
	
	public void push(Object input){
		stackArray.add(input);
	}
	
	public Object pop(){
			Object output = stackArray.remove(stackArray.size()-1);
			return output;
	}
	
	public Object peek(){
		return stackArray.get(stackArray.size() - 1);
	}
}
