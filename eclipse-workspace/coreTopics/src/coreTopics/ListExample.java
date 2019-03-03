package coreTopics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> l =new ArrayList<String>();
//		l.add(0, "sudheer");
//l.add(1,"sandhya");
//l.add("ramya");
//System.out.println(l.size());
//System.out.println(l.get(0));
//l.remove(1);
//System.out.println(l.size());

//		Stack<String> s= new Stack<String>( );
//		s.push("sudheer");
//		s.push("sandhya");
//		s.push("ramya");
//		System.out.println(s.size());
//		System.out.println(s.search("sudheer"));
//	s.peek();
//	System.out.println(s.pop());
//	System.out.println(s.size());
//		
//		TreeSet< String> ts =new TreeSet<>();
//		
//		ts.add(null);
//		ts.add("sudheer");
//		ts.add("sandhya");
//		System.out.println(ts);
//		
//	Map<String,Integer> m =new HashMap<String,Integer>();
//	m.put("sudheer",100);
//	m.put("sandhya", 200);
//	m.put("ramya", 300);
//	System.out.println(m);
//	Set<String> s=m.keySet();
//	System.out.println(s);
//		
	List<String>  al =new ArrayList<String>();
		al.add("sudheer");
		al.add("sandhya");
		al.add("ramya");
		
		System.out.println(al);
		Collections.sort(al);
		Iterator< String> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Collections.sort(al);
		
		
		
		
		
		
		
		
		
		

	}

}
