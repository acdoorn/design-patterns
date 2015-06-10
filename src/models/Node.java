package models;

import java.util.ArrayList;

import controllers.NodeReader;

abstract public class Node implements INode{
	public ArrayList<INode> _nextNodeList;
	public NodeReader _nodeReader;
	protected abstract Integer Execute(int input);
	
	public Node(){
		_nextNodeList = new ArrayList<INode>();
	}
	
	public void Next(int input){
	Integer result = Execute(input);
		if(result != null)
		{
			for(INode c: this._nextNodeList){
				c.Next(result);
			}
		}
	}
		
	public void AddNodeToList(INode c){
		_nextNodeList.add(c);
	}

	
	public void setNodeReader(NodeReader nodeReader){
		this._nodeReader = nodeReader;
	}
	
}