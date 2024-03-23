package com.jspiders.filehandling.operations;

public class array {
 
	public static void main(String[] args) {
		int[] a= {0,5,9,15,18,22};
		int b[]= {3,9,12,18,20,24};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]!=b[j]) {
					int c= a[i+1];
					int d=b[j+1];
					System.out.println(c);
					System.out.println();
				}
			}
		}
	}
}
