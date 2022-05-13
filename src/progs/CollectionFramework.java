package progs;

import java.util.*;

public class CollectionFramework {

	public static void main(String[] args) 
	{
		List<Integer> al= new ArrayList<>();
		al.add(6);
		al.add(8);
		al.add(3);
		System.out.println(al.get(2));
		System.out.println("*");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("*");
		for(int i =0;i<al.size();i++)
		{
			
			System.out.println(al.get(i));
		}
//		**************************************************
		System.out.println("linkedlist");
		List<Integer> ll = new LinkedList<>();
		ll.add(5);
		ll.add(6);
		ll.add(1);
		ll.add(9);
		Iterator lit = ll.iterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("after removing");
//		ll.remove(0);
//		ll.remove(9);
//		for(int i=0;i<ll.size();i++)
//		{
//			System.out.println(ll.get(i));
//		}
		Iterator lit1 = ll.iterator();
		while(lit1.hasNext())
		{
			System.out.println(lit1.next());
		}
//		**********************************************
		
		System.out.println("stack");
		Stack<Integer> s = new Stack<>();
		s.add(1);
		s.add(7);
		s.add(3);
		s.push(4);
		
	
		Iterator sit = s.iterator();
		while(sit.hasNext())
		{
			System.out.println(sit.next());
		}
		System.out.println("*");
//		System.out.println(s.pop());
//		Iterator sit1 = s.iterator();
//		while(sit1.hasNext())
//		{
//			System.out.println(sit1.next());
//		}	
		
//		**********************************************
//		elements are ordered based on the natural priority of the elements 
		System.out.println("Queue");
		Queue<Integer> q =new PriorityQueue<>();
		q.add(2);
		q.add(7);
		q.add(7);
		q.add(0);
		
		
		Iterator qit = q.iterator();
//		q.
		System.out.println(q.peek());
//		System.out.println(q.poll()); returns and removes the head of the queue
		
		while(qit.hasNext())
		{
			System.out.println(qit.next());
		}
//		***********************************************
		System.out.println("ArrayDeque");
		Deque<Integer> ad = new ArrayDeque<>();
		ad.add(5);
		ad.add(9);
		ad.add(1);
		
		Iterator adit = ad.iterator();
		while(adit.hasNext())
		{
			System.out.println(adit.next());
		}
		System.out.println(ad.peek());
		ad.addFirst(1);
		ad.addLast(10);
//		ad.
		Iterator adit1 = ad.iterator();
		System.out.println("*");
		while(adit1.hasNext())
		{
			System.out.println(adit1.next());
		}
		System.out.println(ad.peek());
//		************************************************
		System.out.println("hashset");
		HashSet<Integer> hs = new HashSet<>();
		hs.add(3);
		hs.add(7);
		hs.add(1);
		hs.add(3);
		Iterator hsit = hs.iterator();
		while(hsit.hasNext())
		{
			System.out.println(hsit.next());
		}
//		************************************************
		System.out.println("linkedhashset");
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(3);
		lhs.add(7);
		lhs.add(1);
		lhs.add(3);
		
		Iterator lhsit = lhs.iterator();
		while(lhsit.hasNext())
		{
			System.out.println(lhsit.next());
		}
//		********************************************
		System.out.println("TreeSet");
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(7);
		ts.add(1);
		ts.add(3);
		Iterator tsit = ts.iterator();
		while(tsit.hasNext())
		{
			System.out.println(tsit.next());
		}
		
		System.out.println("distinct array");
		int arr[] = {1,3,4,2,1};
		TreeSet<Integer> ts1 = new TreeSet<>();
		for(int i:arr)
		{
			ts1.add(i);
		}
		Iterator dhsit1 = ts1.iterator();
		while(dhsit1.hasNext())
		{
			System.out.println(dhsit1.next());
		}
		System.out.println("last 2 numbers");
		System.out.println(ts1.toArray()[ts1.toArray().length-1]+""+ts1.toArray()[ts1.toArray().length-2]);
//		************************************************
		System.out.println("Map");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		hm.
		
		

	}

}
