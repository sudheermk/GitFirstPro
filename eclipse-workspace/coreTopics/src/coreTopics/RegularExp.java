package coreTopics;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class RegularExp {
	 public static void main(String[] args) {
		Pattern p =Pattern.compile("\\.");
		String []s=p.split("sudheer.loves.sandhya.com.fucking.hard");
		for(String ss:s)
		{
			System.out.println(ss);
		}
		
		
		StringTokenizer st =new StringTokenizer("sandhya fucked by sudheer");
		while(st.hasMoreTokens())
		{System.out.println(st.nextToken());
	}

}
}