package com.avans.factory;

public class MainController {
	private NodeReader reader;
	private NodeFactory factory = new NodeFactory();
	private String path = "./src/readablefiles/circuit1.txt";
	//private Array[] circuit;
	
	//Constructor
	public MainController() {
		this.reader = new NodeReader();
		reader.readFile(path);
	}
	

	
	public void generate() {
		callFactory(reader.getNodes(), true);
		callFactory(reader.getEdges(), false);
	}
	
	public void execute() {
		
	}
	
	private void callFactory(String[] sArray, boolean isFirstPart ) {
		for(int x=0; x<sArray.length; x++) {
			if(sArray[x] != null && isFirstPart) {
				//TODO 
			}
			if(sArray[x] != null && !isFirstPart) {
				//TODO
			}
		}
	}
}
