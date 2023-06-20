package com.demo.samplestack;

public class Node {

	private Node headNode;
	private String value;
	private Node nextNode;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	/*
	 * public String toString() { return "my sample node"; }
	 */
	
	public static void main(String[] args) {
		Node newNode = new Node();
		System.out.println(newNode);
	}
}
	

