package models.impl;

import models.INode;
import models.Node;


public class OR extends Node {
	
	private Integer input1, input2;
	
	public OR(){
		super();
	}
	
	protected Integer Execute(int input){
		if(input1 == null){
			input1= input;
		}
		else if(input2==null){
			input2= input;
		}
		if(input1 != null && input2 != null){
			return input1 == 1 || input2 == 1 ? 1 : 0;
		} else{
			return null;
		}
	}
	
	@Override
	public INode copy(){
		return new OR();
	}
}
