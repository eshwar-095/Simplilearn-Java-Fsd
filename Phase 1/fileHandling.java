package demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class fileHandling {
	public static void createWriteFile() throws IOException{
		File a=new File("D:\\Filehandling.txt");
		if(a.createNewFile()) {
			System.out.println("File created");
		}else {
			System.out.println("File already exists");
		}
		FileWriter b = new FileWriter(a,false);
		b.write("Hello there!");
		b.close();
	}
	public static void readFile()throws IOException{
		FileReader c=new FileReader("D:\\Filehandling.txt");
		int data;
		while((data=c.read())!=-1) {
			System.out.print((char)data);
		}
	}
	public static void appendFile()throws IOException{
		Path d= Paths.get("D:\\Filehandling.txt");
		String e = " How are you?";
		byte arr[]= e.getBytes();
		Files.write(d, arr, StandardOpenOption.APPEND);
		System.out.println("\nAppend Successfully");
	}
	public static void main(String[] args) {
		try {
			createWriteFile();
			readFile();
			appendFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
