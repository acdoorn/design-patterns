package models.impl;

import models.INode;
import models.Node;

public class PROBE extends Node {
	private Integer _inputA;

	public PROBE(){
		super();
	}

	@Override
	protected Integer Execute(int input) {
		_inputA = input;
		return null;
	}
	
	@Override
	public INode copy(){
		return new PROBE();
	}
}
