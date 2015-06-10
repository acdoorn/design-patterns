package factory;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

import models.INode;


public class NodeFactory {
	

	private static final Map<String, INode> nodes;
	private static final ServiceLoader<INode> loader;
	
	static {
		nodes = new HashMap<String, INode>();
		loader = ServiceLoader.load(INode.class);
		
		for (INode node : loader) {
			nodes.put(node.getClass().getSimpleName(), node);
		}
	}
	
	public static final INode create(final String name) {
		if (nodes.containsKey(name)) {
			return nodes.get(name).copy();
		}
		
		final String message = String.format("Node '%s' was not found, is the services file up to date?", name);
		throw new IllegalArgumentException(message);
	}
}
