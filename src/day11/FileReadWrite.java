package day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileReadWrite {
	
	public static void writeCharToFile(File f)
	{
		String s = "This file is written using a char stream";
		try(FileWriter fw = new FileWriter(f); BufferedWriter bw = new BufferedWriter(fw)) 
		{
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	public static void readCharFromFile(File f)
	{
		try (BufferedReader br = new BufferedReader(new FileReader(f)))
		{
			String line = "";
			while((line = br.readLine())!= null)
			{
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		File f = new File("data.txt");
		writeCharToFile(f);
		readCharFromFile(f);
	}
}
