package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharstreamRead {

	public static void main(String[] args) throws IOException {
		File file =new File( "E:/Pictures/Demo.txt");
		if(file.exists()) {
			FileReader fileReader =new FileReader(file);
			System.out.println(fileReader.read()); 
			fileReader.close();
			
			
			Scanner scanner=new Scanner(file);
			while(scanner.hasNextLine()){
				
				System.out.println(scanner.nextLine());
			}
			
			scanner.close();
			System.out.println("data is fetching from the file");
		}
		else {
			System.out.println("file is not exist");
		}
	}
}
