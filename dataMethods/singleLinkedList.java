package com.bridgelabz.dataMethods;

//<T> generic type.
  public class singleLinkedList<T>{
	 class Node
	 {
	    String data;
	   Node next;
	   Node(String data)
	 {
		 this.data=data;
	 }
	
	}
	 Node head;
	
	/*
	 * add the new node in linked list
	 */
	  public boolean add(String data)
	  {
		 Node n=new Node(data);
		 Node temp;
		if(head==null)
		{
			head=n;
			return true;
		}
		else
		{
			temp=head;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
return true;
		
	}
	
	//Display the data of linked list
   public void display()
  {
	Node n = head;
//	int count = 0;
//	while(n.next != null)
//	{
//		if(temp != null)
//		    System.out.println(temp.data+" ");
//	     else
//	        System.out.println(temp.data);
//		temp = temp.next;
//		
//	}
	while(n.next!=null)
	{
		System.out.println(n.data);
		n=n.next;
	}
	System.out.println(n.data);

}
/*
 * number of node present in the list
 * return  integer number of node present in the linkedlist.
 */
    public int size()
    {
    	Node temp;
    	temp = head;
    	int count=0;
    	while(temp != null)
    	{
    		temp=temp.next;
    		count++;
    	}
    	return count;
    	
    }
  
    /*
     * purpose: search the data from the linked list
     */
//      public int search(String data)
//      {
//    	  Node temp;
//    	  temp = head;
//    	  int pos=1;
//    	  if(head == null)
//    	  {
//    		  System.out.println("no element found");
//    		  return 0;
//    	  }
//    	  else
//    	  {
//    		  while ((temp.next != null) && (!temp.data.equals(data))) {
//  				temp = temp.next;
//  				pos++;
//  			}
//  			if (pos == size() && (!temp.data.equals(data)))
//  				return 0;
//  			else
//  return pos;
  //  	  }
    	  
  //    }
      /*
       * remove the data from perticular position
       */
      public String remove(int position) {
  		Node temp, temp1;
  		temp = head;
  		if (head == null) {
  			System.out.println("No element is there");
  			return null;
  		} else {
  			if (position == 1) {
  				head = temp.next;
  				return temp.data;
  			} else
  				while (temp.next.next != null && position > 1) {
  					position--;
  					temp = temp.next;
  				}
  			temp1 = temp.next;
  			temp.next = temp1.next;
  			
  		}
  		return temp1.data;
  }
      /*
  	 * Purpose: Convert LinkedList to String array.
  	 * 
  	 */
  	public String[] toArray() {
  		Node temp;
  		temp = head;
  		String[] obj = new String[size()];
  		int i = 0;
  		while (temp != null) {
  			obj[i] = temp.data;
  			temp = temp.next;
  			i++;
  		}
  		return obj;

  	}
  	
  	/*
  	 * Purpose: Sort the linkedlist in ascending order based on data.
  	 */
  	public void sort()
  	{
  		Node temp;
  		temp = head;
  		int p = size();
  		while(p > 0) 
  		{
  			temp = head;
  			while(temp.next != null)
  			{
  				if((temp.data).compareTo(temp.next.data) > 0) {
  					String t = temp.data;
  					temp.data = temp.next.data;
  					temp.next.data = t;
  				}
  				temp = temp.next;
  			}
  			p--;
  		}
  		
  	}
  	
  	/*
  	 * Purpose: Check linkedlist is empty or not.
  	 */
  	public boolean isEmpty() {
  		if(head == null)
  			return true;
  		else
  			return false;
 	}
  //search for  the item in the list.
      
  	public int search(T data) {
		Node temp;
		temp = head;
		int pos = 1;
		if (head == null) {
			System.out.println("No element is there");
			return 0;
		} else {
			while ((temp.next != null) && (!temp.data.equals(data))) {
				temp = temp.next;
				pos++;
			}
			if (pos == size() && (!temp.data.equals(data)))
				return 0;
			else
				return pos;
		}
	}
  	
  	public boolean search2(T pos2)
  	{
  		int indexPos=search(pos2);
  		if(indexPos>0)
  			return true;
  		
  		return false;
  	}
// for getting index
    public int getIndex(T data) {
    	Node temp = head;
    	for(int i = 0 ; i < size() ; i++) {
    		if(temp.data.equals(data)) {
    			return i ;
    		}
    		temp = temp.next;
    	}
		return -1;
    	
}

  }
