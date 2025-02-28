package com.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("tops1.txt");
		String s1="This is file write/read operation using java";
		byte b[]=s1.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("File written successfully");
		
		FileInputStream fis=new FileInputStream("tops1.txt");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
				
	}

}
