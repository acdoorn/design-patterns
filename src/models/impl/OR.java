package models.impl;

import models.INode;
import models.Node;

public class OR extends Node {
	
	private Integer _inputA, _inputB;
	
	public OR(){
		super();
	}
	
	protected Integer Execute(int input){
		if(_inputA == null){
			_inputA= input;
		}
		else if(_inputB==null){
			_inputB= input;
		}
		if(_inputA != null && _inputB != null){
			return _inputA == 1 || _inputB == 1 ? 1 : 0;
		} else{
			return null;
		}
	}
	
	@Override
	public INode copy(){
		return new OR();
	}
}
