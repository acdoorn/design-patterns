package models.impl;

import models.INode;
import models.Node;


public class PROBE extends Node {

	public PROBE(){
		super();
	}

	@Override
	protected Integer Execute(int input) {
		System.out.println("Output = "+ input);
		return null;
	}
	
	@Override
	public INode copy(){
		return new PROBE();
	}
}
