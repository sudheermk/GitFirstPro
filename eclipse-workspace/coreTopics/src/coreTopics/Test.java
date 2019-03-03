package coreTopics;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);
int i=s.nextInt();
if(i>60)
{
	throw new CustomException("decrease  u  r  age");
}else if(i<20)
{
	throw new CustomException("incereasw age");
	
}else 
{
	throw new CustomException("get mail")
;}
	
	}

}
