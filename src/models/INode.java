package models;

import controllers.NodeReader;

public interface INode extends Cloneable {
	
	abstract void Next(int input);
	abstract void setNodeReader(NodeReader nodeReader);
	abstract void AddNodeToList(INode iNode);
	INode copy();
}
