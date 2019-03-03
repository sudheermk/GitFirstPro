package coreTopics;

public class EnumExp {
	public static void main(String[] args) {
		books e=books.java;
		books.m();
		System.out.println(e);
		
	}
}
enum books
{
	java,php,sharepoint;
	static  int m()
	{System.out.println("hii");
		return 0;
		 
	}
}
