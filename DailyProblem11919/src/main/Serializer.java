package main;

import java.util.ArrayList;
import java.util.List;

public class Serializer {

	protected String serialize(Node node) {
		List<String> stringList = new ArrayList<String>();
		serialize(node, stringList);
		String serialized = "[";
		for(String nodeString : stringList) {
			if(nodeString.equals(stringList.get(0))) {
				serialized = serialized.concat(nodeString);
			}else {
				serialized = serialized.concat(", "+nodeString);
			}
		}
		return serialized.concat("]");
	}
	
	protected void serialize(Node node, List<String> treeVariables) {
		if(node==null) {
			treeVariables.add("empty");
			return;
		}
		treeVariables.add(node.val);
		serialize(node.left, treeVariables);
		serialize(node.right, treeVariables);
	}
	
	protected Node deserialize(String tree) {	
		return DeserializeRecursively(tree);
	}
	
	private static Node DeserializeRecursively(String treeString) {
		String firstString = treeString.substring(1, treeString.indexOf(","));
		treeString=treeString.substring(treeString.indexOf(",")+1);
		    if (firstString.equals("empty"))
		    {
		        return new Node(null);
		    }
		
		    Node node = new Node(firstString);
		
		    node.left = DeserializeRecursively(treeString);
		
		    node.right = DeserializeRecursively(treeString);
		
		    return node;
	}
}
