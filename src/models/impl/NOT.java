package models.impl;

import models.INode;
import models.Node;

public class NOT extends Node {
	
	public NOT(){
		super();
	}
	
	protected Integer Execute(int input){
		return input == 1 ? 0 : 1;
	}
	
	@Override
	public INode copy(){
		return new NOT();
	}


}