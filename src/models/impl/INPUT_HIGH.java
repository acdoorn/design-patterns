package models.impl;

import models.INode;
import models.Node;


public class INPUT_HIGH extends Node {

	public INPUT_HIGH(){
		super();
	}

	@Override
	protected Integer Execute(int input) {
		// TODO Auto-generated method stub
		return input;
	}
	
	@Override
	public INode copy(){
		return new INPUT_HIGH();
	}

}
