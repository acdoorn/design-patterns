package com.avans.factory;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class NodeReader {
	private Reader reader;
	private String s = "";
	private String[] stringArray;
	private String[] nodes;
	private String[] edges;
	
	public NodeReader() {
	}
	
	public void readFile(String path) {
		try {
			this.reader  =  new FileReader(path);
			int data = reader.read();
			
			while(data != -1) {
			  //do something with data...
			  char dataChar = (char) data;
			  data = this.reader.read();
			  s = s + dataChar;
			}
			this.reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		String[] splitArray = s.split("\n\r");		
		
		this.nodes = splitOnHashtag(splitArray[0]);
		this.edges = splitOnHashtag(splitArray[1]);
		//System.out.println(addAllToString(nodes));
		//System.out.println(addAllToString(edges));
	}
	
	public String[] getNodes() {
		return nodes;
	}
	
	public String[] getEdges() {
		return edges;
	}
	
	private String[] splitOnHashtag(String s) {
		stringArray = s.split("\n");
		String[] returnArray = new String[100];
		int y = 0;
		for(int x=0; x<stringArray.length; x++) {
			if(!stringArray[x].startsWith("#")) {
				returnArray[y] = stringArray[x];
				y++;
			}
		}
		return returnArray;
	}
	
	private String addAllToString(String[] sArray) {
		//for output
		s ="";
		for(int x=0; x<sArray.length; x++) {
			if(sArray[x] != null) {
				s = s + sArray[x];
			}
		}
		return s;
	}
}

