
package day11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	
	public static void writeBytesToFile(File f)
	{
		String s = "This file is written using a byte stream";
		try(FileOutputStream fos = new FileOutputStream(f); BufferedOutputStream bos = new BufferedOutputStream(fos))
		{
			bos.write(s.getBytes());
			bos.flush();
		}catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static void readBytesFromFile(File f)
	{
		try(FileInputStream fis = new FileInputStream(f); BufferedInputStream bis = new BufferedInputStream(fis))
		{
			byte[] b = new byte[fis.available()];
			while(bis.read()!=-1)
			{
				System.out.println(new String (b));
			}
		}catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		File f = new File("data.txt");
		writeBytesToFile(f);
		readBytesFromFile(f);
	}
}
