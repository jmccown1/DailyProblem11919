package main;

public class Main {

	public static void main(String[] args) {
		Serializer serializer = new Serializer();
		Node myTree = new Node("root", new Node("left", new Node("left.left")), new Node("right"));
		
		String treeAsString = serializer.serialize(myTree);
		
		System.out.println("Tree after serialization: " + treeAsString);

		if(serializer.deserialize(serializer.serialize(myTree)).left.left.val.equals("left.left")) {
			System.out.println("Success: String deserialized successfully");
		}else {
			System.out.println("Error: Something didn't workout right..");
		}
	}
}
