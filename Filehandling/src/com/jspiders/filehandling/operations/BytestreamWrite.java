package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BytestreamWrite {

	public static void main(String[] args) throws IOException {
		File file=new File("E:/Pictures/Demo.txt");
		if(file.exists()) {
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			fileOutputStream.write(1000);
			System.out.println("data is written to the file");
			fileOutputStream.close();
		}else {
			boolean status=file.createNewFile();
			if(status) {
				FileOutputStream fileOutputStream=new FileOutputStream(file);
				fileOutputStream.write(1244);
				System.out.println("data is written to the file");
				fileOutputStream.close();
			}
			else {
				System.out.println("file does not exist");
			}
		}
	}
}
