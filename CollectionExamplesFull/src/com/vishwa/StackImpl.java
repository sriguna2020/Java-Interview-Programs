package com.vishwa;

import java.util.Arrays;

public class StackImpl {

	int maxsize;
	static int stackArray[];
	int front;
	public StackImpl(int size)
	{
	  maxsize=size;
	  stackArray=new int[size];
	  front=-1;
	  System.out.println("Size of stack is "+size);
	}
	public void push(int num)
	{
		if(isFull())
			System.out.println("Stack is full iteam "+num+" is not pushed");
		else
		{
			stackArray[++front]=num;
			System.out.println("Iteam  "+num+" is pushed");
		}
	}
	public void pop()
	{
		if(isEmpty())
			System.out.println("Stack is empty iteam  is not poped");
		else
		{
			int pop=stackArray[front];
			front--;
			System.out.println("Iteam  "+pop+" is poped");
		}
	}
	public boolean isFull()
	{
		return  (front==maxsize-1);
	}
	public boolean isEmpty()
	{
		return (front==-1);
	}
	public static void main(String[] args) {
		
		StackImpl stack=new StackImpl(4);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(Arrays.toString(stackArray));
		stack.push(5);
	    stack.pop();
	    stack.pop();
	    stack.pop();
	    stack.pop();
	    stack.push(5);
	    System.out.println(Arrays.toString(stackArray));
	    stack.pop();
	    stack.push(6);
	    System.out.println(Arrays.toString(stackArray));
	    
	    
	}

}
