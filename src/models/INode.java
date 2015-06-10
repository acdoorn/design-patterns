package models;

import com.avans.factory.NodeReader;

public interface INode extends Cloneable {
	
	abstract void Next(int input);
	abstract void setCircuit(NodeReader nodeReader);
	abstract void AddNodeToList(INode iNode);
	INode copy();
}
