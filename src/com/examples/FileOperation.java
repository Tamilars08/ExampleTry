package com.examples;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) throws IOException {
	
		
File file=new File("C:\\");

//boolean mkdir = file.createNewFile();//create new folder
//System.out.println(mkdir);

//  boolean createNewFile = file.createNewFile();//create new file
//  System.out.println(createNewFile); boolean exists = file.exists();
//  System.out.println(exists);

/*boolean exists = file.exists();
System.out.println(exists);
 boolean canRead = file.canRead();
 System.out.println(canRead);
 boolean canWrite = file.canWrite();
 System.out.println(canWrite);*/
String[] list = file.list();

for(String li:list) {
System.out.println(li);
}

File[] listFiles = file.listFiles();
for(File s:listFiles) {
	System.out.println(s);
	
}

}
}