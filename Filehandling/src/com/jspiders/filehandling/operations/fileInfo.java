package com.jspiders.filehandling.operations;

import java.io.File;

public class fileInfo {

	public static void main(String[] args) {
		File file=new File("E:/Pictures/Demo.txt");
		if(file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length());
			if(file.canWrite()) {
				System.out.println("file is writable");
			}else {
				System.out.println("file is not writable");
			}
			if(file.canRead()) {
				System.out.println("file is redable");
			}else {
				System.out.println("file is not redable");
			}
			if(file.canExecute()) {
				System.out.println("file is executable");
			}else {
				System.out.println("file does not extectable");
			}
		}else {
			System.out.println("file does not exists");
		}
	}
}
