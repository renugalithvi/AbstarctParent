package org.abs;

import java.io.File;
import java.io.IOException;

public class FileOp {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\GreenTech");
		boolean d = f.mkdir();
		System.out.println(d);
	
	File f1=new File("D:\\GreenTech\\test\\java\\inherit.txt");
	boolean mk = f1.mkdirs();
	System.out.println(mk);
	
	boolean crt = f1.createNewFile();
	System.out.println(crt);
	boolean canRead = f1.canRead();
	System.out.println(canRead);
	boolean cb = f1.canWrite();
	System.out.println(cb);
	
	
}
}