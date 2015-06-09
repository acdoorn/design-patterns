package com.avans.factory;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class NodeReader {
	Reader reader;
	String s = "";
	String[] stringArray;
	String[] secondArray;
	String[] thirdArray;
	
	public NodeReader() {
		test();
	}
	
	public void test() {
		try {
			reader  =  new FileReader("C:/Users/Ruud van Daelen/Downloads/circuits/circuit1.txt");
			int data = reader.read();
			
			while(data != -1) {
			  //do something with data...
			  char dataChar = (char) data;
			  data = reader.read();
			  s = s + dataChar;
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thirdArray = s.split("\n\r");
//		System.out.println(thirdArray[0]);
//		System.out.println(thirdArray[1]);
		
		
		
		secondArray = new String[100];
		String[] firstPart = splitOnHashtag(thirdArray[0]);
		String[] secondPart = splitOnHashtag(thirdArray[1]);
		System.out.println(addAllToString(firstPart));
//		System.out.println("Deel 2");
//		System.out.println(fnalArray[1]);
	}
	
	public String[] splitOnHashtag(String s) {
		stringArray = s.split("\n");
		int y = 0;
		for(int x=0; x<stringArray.length; x++) {
			if(!stringArray[x].startsWith("#")) {
				secondArray[y] = stringArray[x];
				y++;
			}
		}
		return stringArray;
	}
	
	public String addAllToString(String[] sArray) {
		s ="";
		for(int x=0; x<sArray.length; x++) {
			if(sArray[x] != null)
			s = s + sArray[x];
		}
		return s;
	}
}
