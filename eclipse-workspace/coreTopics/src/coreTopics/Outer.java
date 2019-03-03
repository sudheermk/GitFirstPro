package coreTopics;

import java.util.ArrayList;

public class Outer {
	
	ArrayList<String> al  = new ArrayList<>() ;
	

}class Test1
{
	public static void main(String[] args) {
		Outer o =new Outer();
		o.al.add("aaa");
		o.al.add("bbb");
		System.out.println(o);
}
}