package controllers;

import java.util.HashMap;
import java.util.Map.Entry;

import models.INode;
import factory.NodeFactory;

public class MainController {
	private NodeReader reader;
	private HashMap<String, INode> circuit;
	
	public MainController() {
		this.reader = new NodeReader();
		this.circuit = new HashMap<String, INode>();
	}
	
	public void generate(String path) {	
		reader.readFile(path);		
		generateNodes(reader.getNodes(), true);
		generateNodes(reader.getEdges(), false);
	}
	
	public void execute(int INPUT_HIGH, int INPUT_LOW) {
		for (Entry<String, INode> entry : circuit.entrySet()) {
			String compValue = entry.getValue().getClass().getSimpleName().toString();
			if(compValue.contains("INPUT")){
				entry.getValue().Next(compValue.equals("INPUT_HIGH") ? INPUT_HIGH : INPUT_LOW );
			}
		}
	}
	
	private void generateNodes(String[] stringArray, boolean isFirstPart ) {
		for(int x=0; x < stringArray.length; x++) {
			if(stringArray[x] != null) {
				if(isFirstPart) {			
		    		String nodeName = stringArray[x].substring(0,stringArray[x].indexOf(":"));
			    	String nodeValue = stringArray[x].substring(stringArray[x].indexOf(":")+1,stringArray[x].indexOf(";"));
			    	nodeValue = nodeValue.replaceAll("\\s+","");	
					circuit.put(nodeName, NodeFactory.create(nodeValue));
				} 
				else {
					if(!stringArray[x].equals("")) {
			    		String nodeName = stringArray[x].substring(0,stringArray[x].indexOf(":"));
				    	String nodeValue = stringArray[x].substring(stringArray[x].indexOf(":")+1,stringArray[x].indexOf(";"));
				    	nodeValue = nodeValue.replaceAll("\\s+","");
						
				    	// If multiple edges then split
						if(nodeValue.contains(",")) {
			    			String[] split = nodeValue.split(",");
			    			for (int i = 0; i < split.length; i++) {
			    				circuit.get(nodeName).AddNodeToList(circuit.get(split[i]));
			    			}
			    		} else {
		    				circuit.get(nodeName).AddNodeToList(circuit.get(nodeValue));
			    		}
					}
				}
			}
		}
	}
	
	
}
