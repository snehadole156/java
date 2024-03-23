package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamRead {

	public static void main(String[] args) throws IOException {
		File file=new File("E:/Pictures/Demo.txt");
		if(file.exists()) {
			FileInputStream fileInputStream =new FileInputStream(file);
			System.out.println(fileInputStream.read());
			fileInputStream.close();
			System.out.println("data is fetching from the the file");
		}else {
			System.out.println("file does not exists");
		}
	}
}
