package com.bridgelabz.dataMethods;


/**
 * @author Nisha Raut
 * @param <T>
 */
public class Queue <T>{
	int front;
	int rear;
	int capacity;
		Object que[];
	
	public Queue(int capacity)
	{
		front = rear = -1;
		this.capacity=capacity;
		 que=new Object[capacity];
		 
	}

	
     /**
     *purpose: Used to insert the data or elements into the queue. 
     * @param data
     * @version 1.0
     * @since 23-01-2019
     */
    public boolean enQueue(T data)
      {
        if(capacity == rear)
        {
        	System.out.println("stack is full.");
        	return false;
        }
        if(front == -1)
        {
         front++;
        }
    	que[++rear]=data;
    	for(int i = 0 ; i < rear+1 ;i++ ) {
//    		System.out.println(que[i]);
    	}
    	return true;
      }
      
      /**
     * purpose: Used to remove the data or elements from the queue.
     */
    public T dequeue() {
		T temp;
		if(front == -1) {
			System.out.println("Queue is empty");
			return null;
		}
		else {
			temp = (T) que[front++];
			if(front == rear+1) 
			{
				rear = -1;
				front = -1;
			}
			return temp;
		}
}
    /**
	 * Purpose: Display the data of the queue.
	 * 
	 */
	public String toString() 
	{
		if(front == -1) {
			System.out.println("Empty Queue");
			return null;
		}
		else {
			String st = "";
			for(int i=front; i<=rear; i++)
			{
				st = st + que[i];
				if(i<rear)
					st = st + ",";
			}
			return st;
		}
	}
	
	/**
	 * Purpose: To check queue is empty or not
	 * 
	 * @return  True or False
	 */
	public boolean isEmpty(){
		if(front == -1)
			return true;
		return false;
	}
	
	/**
	 * Purpose: To find out the size of the queue
	 * 
	 * @return  integer number of data present in the queue.
	 */
	public int size() {
		int count = 0;
		for(int i=front;i<=rear;i++)
		{
			count++;
		}
		return count;
	}
}
