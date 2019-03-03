package coreTopics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Java_io {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f= new File("sudheer.txt");
System.out.println(f.exists());
f.createNewFile();
System.out.println(f.exists());
@SuppressWarnings("resource")
BufferedWriter bw =new BufferedWriter(new FileWriter(f));
bw.write(100);
BufferedReader br = new BufferedReader(new FileReader(f));
String line=br.readLine();
while(line !=null)
{
	System.out.println(line);
	 line = br.readLine();
}


















	}

}
