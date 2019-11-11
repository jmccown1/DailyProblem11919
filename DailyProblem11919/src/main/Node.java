package main;

public class Node {
	
	protected String val;
	protected Node left;
	protected Node right;
	
	public Node(String val, Node left, Node right) {
		this.val = val;
		this.left=left;
		this.right=right;
	}
	
	public Node(String val, Node left) {
		this.val = val;
		this.left=left;
	}
	
	public Node(String val) {
		this.val = val;
	}
}
