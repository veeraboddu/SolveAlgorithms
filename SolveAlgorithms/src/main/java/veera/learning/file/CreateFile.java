package veera.learning.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	
	public static void main(String arg[]) throws IOException {
		
	    createFile();
	    writetoFile();
		readFromFile();
		
	}
	
	public static void createFile() throws IOException {
		
		File newfile = new File("JavaFile.txt");
		
		if(newfile.createNewFile()) {
			System.out.println("File Created"+newfile.getName());
		}else {
			System.out.println("File already exist");
		}
	}
	
	public static void writetoFile() throws IOException {
		
		FileWriter filwrt = new FileWriter("JavaFile.txt");
		filwrt.write("Welcome to the Java world we can you miracle in JAVA");
		filwrt.write("\nWelcome to the Meghana Home");
		filwrt.write("\nYou can have a lot of fun in Meghana sticker world");
		filwrt.close();
	}

	public static void readFromFile() throws FileNotFoundException {
		File fileread = new File("JavaFile.txt");
		Scanner scnobj = new Scanner(fileread);
		while(scnobj.hasNextLine()) {
			System.out.println(scnobj.nextLine());
		}
	}
}
