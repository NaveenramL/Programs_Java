package com.demo.sampletreedemo;

public class TreeSample {

	private Node rootNode;
	
	public Node getRootNode() {
		return rootNode;
	}

	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}

	public void addNode(int value) {
		
		//create a new node with the passed value
		Node newNode = new Node();
		newNode.setValue(value);
		
		//create the root node if it does not exist.
		if(getRootNode() == null) {
			setRootNode(newNode);
			return;
		}
		
		//if root node exist, then traverse till the leaf node and then add the new node.
		addNode(getRootNode(), newNode);
	}
	
	//100, 60
	//70,60
	public void addNode(Node currentNode, Node newNode) {
		int currentValue = currentNode.getValue();
		int newNodeValue = newNode.getValue();
		
		if(newNodeValue < currentValue) {
			//traverse left side
			if(currentNode.getLeftNode() == null) {
				currentNode.setLeftNode(newNode);
			}else {
				addNode(currentNode.getLeftNode(), newNode);
			}
		} else {
			//traverse right side
			if(currentNode.getRightNode() == null) {
				currentNode.setRightNode(newNode);
			}else {
				addNode(currentNode.getRightNode(), newNode);
			}
		}
		
	}
	
	public void printNode(Node node) {
		if(node == null) {
			return;
		}
		
		System.out.println(node.getValue());
		printNode(node.getLeftNode());
		printNode(node.getRightNode());
		
	}
	
	public void deleteElements(int value) {
		if(rootNode == null) {
			return;
		}
		if(rootNode.getValue()==value && (rootNode.getLeftNode()==null && rootNode.getRightNode()==null)) {
			//rootNode.setValue(0);
			return;
		}
		deleteElements(getRootNode() , value);
	}
	
	public Node deleteElements(Node currentNode , int value) {
		int currentValue = currentNode.getValue();
		
		if(currentValue < value) {
			deleteElements(currentNode.getLeftNode(),value);
		}
		else if(currentValue > value) {
			deleteElements(currentNode.getRightNode(),value);
		}
		
		else {
			if(currentNode.getLeftNode()==null) {
				return currentNode.getRightNode();
			}else if(currentNode.getRightNode()==null) {
				return currentNode.getLeftNode();
			}
			currentValue=minValue(currentNode.getRightNode());
			currentNode.getRightNode().setRightNode(deleteElements(currentNode.getRightNode(),currentValue));;
		}
		/*
		 * if(currentValue < value) { if(currentNode.getLeftNode().getValue()==value) {
		 * 
		 * }else { deleteElements(currentNode.getLeftNode(),value); } } else
		 * if(currentValue > value) { if(currentNode.getRightNode().getValue()==value) {
		 * 
		 * }else { deleteElements(currentNode.getRightNode(),value); } }
		 */
		return currentNode;
	}
	
	int minValue(Node currentNode) {
		int minimumvalue = currentNode.getValue();
		while(currentNode.getLeftNode()!=null) {
			minimumvalue = currentNode.getLeftNode().getValue();
			currentNode=currentNode.getLeftNode();
		}
		return minimumvalue;
	}

	public static void main(String[] args) {
	
		TreeSample tSample = new TreeSample();
		tSample.addNode(100);
		tSample.printNode(tSample.getRootNode());
		
		System.out.println("----");
		tSample.addNode(70);
		tSample.printNode(tSample.getRootNode());
		
		System.out.println("----");
		tSample.addNode(120);
		tSample.printNode(tSample.getRootNode());

		System.out.println("----");
		tSample.addNode(60);
		tSample.printNode(tSample.getRootNode());
	
		System.out.println("----");
		tSample.addNode(150);
		tSample.printNode(tSample.getRootNode());

		System.out.println("----");
		tSample.addNode(75);
		tSample.printNode(tSample.getRootNode());

		System.out.println("----");
		tSample.addNode(65);
		tSample.printNode(tSample.getRootNode());

		System.out.println("----");
		tSample.addNode(78);
		tSample.printNode(tSample.getRootNode());

		System.out.println("----");
		tSample.addNode(110);
		tSample.printNode(tSample.getRootNode());
		
		System.out.println("----");
		tSample.deleteElements(150);
		tSample.printNode(tSample.getRootNode());
		
	}

}
