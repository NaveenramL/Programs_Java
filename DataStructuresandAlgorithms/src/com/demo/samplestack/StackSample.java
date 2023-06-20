package com.demo.samplestack;

import com.demo.sample.Node;

public class StackSample {

	Node tailNode;
	
	public void add(String value) {
		Node newNode = new Node();
		newNode.setValue(value);
		
		if(tailNode == null) {
			tailNode=newNode;
		}
		else {
			newNode.setNextNode(tailNode);
			tailNode=newNode;
		}
	}
	
	public int count() {
		int count =0;
		Node currentNode=tailNode;
		if(tailNode==null) {
			System.out.println("The Number of Element(s) in the Stack are : "+count);
		}
		else {
			while(currentNode!=null) {
				currentNode=currentNode.getNextNode();
				count++;
			}
			System.out.println("The Number of Element(s) in the Stack are : "+count);
		}
		return count;
	}
	
	public void print() {
		Node currentNode=tailNode;
		if(tailNode==null) {
			System.out.println("No elements present in the stack.");
		}
		else {
			while(currentNode!=null) {
				System.out.println(currentNode.getValue());
				currentNode=currentNode.getNextNode();
			}
		}
	}
	
	public void remove() {
		tailNode=tailNode.getNextNode();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackSample s = new StackSample();
		s.add("Villupuram");
		s.add("Chennai");
		s.add("Cuddalore");
		s.print();
		System.out.println("-----------------");
		s.count();
		System.out.println("-----------------");
		s.remove();
		s.print();
		System.out.println("-----------------");
		s.remove();
		s.print();
	}

}
