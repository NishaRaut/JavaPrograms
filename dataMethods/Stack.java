package com.bridgelabz.dataMethods;

//Generic type
     public class Stack<T>{
	   int capacity;
	   int top=-1;
	   Object stack[];
	   
	   public Stack(int capacity)
	   {
		   this.capacity=capacity;
		   stack = new Object[capacity];
	   }
	                       
	   
	  /*
	   * purpose add the new data in the stack
	   * return true or false. Check data added or not
	   */
	
	public boolean push(T data)
	{
		if(top==(capacity-1))
		{
			System.out.println("Stack overflow");
			return false;
		}
		else
		{
			stack[++top]=data;
			return true;
		}
	}
	/*
	 * purpose: Remove the data from the stack
	 */
     
	public T pop()
	{
		//Object temp;
		if (top == -1)
		{
			System.out.println("Stack underflow");
			return null;
		}
		else
		{
			return (T)stack[top--];
		}
	}

	/*
	 * Purpose: To display the data.
	 */
	public String toString() {
		String st = "";
		for(int i=0; i<=top; i++) {
			st = st + stack[i];
			if(i<top)
				st = st + ",";
		}
		return st;
}    
	/*
	 * Purpose: To peek the last data of the stack.
	 */
	public T peek() {
		Object temp;
		if(top == -1) {
			System.out.println("Stack Underflow");
			return null;
		}
		else {
			temp = stack[top];
			return (T)temp;
		}
	}
	
	/*
	 * Purpose: To check stack is empty or not.
	 */
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public int size() {
		return top + 1;
	}
}
     

