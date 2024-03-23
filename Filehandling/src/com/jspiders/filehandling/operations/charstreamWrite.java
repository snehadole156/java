package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class charstreamWrite {

	public static void main(String[] args) throws IOException {
		File file =new File("E:/Pictures/Demo.txt");
		if(file.exists()) {
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write("java is programming language");
			System.out.println("data is written to the file");
			fileWriter.close();
		}else {
			boolean status=file.createNewFile();
			if(status) {
				System.out.println("fil is created");
				FileWriter fileWriter =new FileWriter(file);
				fileWriter.write("java is programming language");
				System.out.println("dara is written in the file");
				fileWriter.close();
			}
		}
	}
}
