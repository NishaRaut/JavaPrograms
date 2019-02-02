package com.bridgelabz.dataMethods;

public class checkQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
//		singleLinkedList<String> ls=new singleLinkedList<String>();
//		ls.add("jjj");
//		ls.add("ddd");
//		ls.add("ccc");
//	    ls.add("bbb");
//	    ls.add("kkk");
//		ls.display();
//		System.out.println("size:"+ls.size());
//		System.out.println("search:"+ls.search("ccc"));
//		System.out.println("remove:"+ls.pop(3));
//		System.out.println("check:"+ls.isEmpty());
//      	//System.out.println("\n" .sort());
//	}
//}
   singleLinkedList<String> l=new singleLinkedList<String>();
   l.add("aaa");
   l.add("nnn");
   l.add("abc");
   l.add("fgn");
//   l.display();
  // l.remove(1);
   System.out.println("------------------");
   l.display();
   System.out.println("aaa ---> "+l.search("aaa"));
   System.out.println("nnn ---> "+l.search("nnn"));
   System.out.println("abc ---> "+l.search("abc"));
   System.out.println("fgn ---> "+l.search("fgn"));
   System.out.println(l.search2("aaa"));
   System.out.println(l.search2("nnn"));
   System.out.println(l.search2("abc"));
   System.out.println(l.search2("fgn"));
   System.out.println("-------------------------");
   System.out.println("dfxgdf ---> "+l.search("dfxgdf"));
   System.out.println("jgh ---> "+l.search("jgh"));
   System.out.println("rt ---> "+l.search("rt"));
   System.out.println(l.search2("dfxgdf"));
   System.out.println(l.search2("jgh"));
   System.out.println(l.search2("rt"));
//		Stack<Integer> s=new Stack<Integer>(10);
//		s.push(10);
//		s.pop();
//		System.out.println(s);
}
	
}