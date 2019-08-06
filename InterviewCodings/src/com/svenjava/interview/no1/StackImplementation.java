package com.svenjava.interview.no1;

public class StackImplementation {
	
	private int[] arr;
	private int top;
	private int capacity;
	
	public StackImplementation(int capacity) {
		this.arr = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
			
	}
	
	public void push(int i) {
		if (isFull()) {
			throw new RuntimeException("Stack is full!");
		}
		
		if(top < capacity) {
			this.arr[++top] = i; 
		}
	}
	
	private boolean isFull() {
		if(top >= capacity -1) {
			return true;
		}
		return false;
	}

	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		int val = arr[top--];
		return val;
	}
	
	private boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}

	public int peek() {
		return arr[top];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplementation implementation = new StackImplementation(10);
		implementation.push(10);
		implementation.push(-20);
		implementation.push(15);
		implementation.push(3);
		System.out.println(implementation.peek());
		System.out.println(implementation.peek());
		System.out.println(implementation.pop());
		System.out.println(implementation.peek());
		System.out.println(implementation.pop());
		System.out.println(implementation.pop());

	}

}
