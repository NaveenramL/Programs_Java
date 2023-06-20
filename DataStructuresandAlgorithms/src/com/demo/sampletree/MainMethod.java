package com.demo.sampletree;

import com.demo.sampletree.Node;

public class MainMethod {
	
	Node rootNode;
	
	public void addElements(int value) {
		Node newNode = new Node();
		newNode.setValue(value);
		
		if(rootNode == null) {
			rootNode=newNode;
		}
		if((newNode.getValue() < rootNode.getValue()) && rootNode.getLeftNode()==null){
			rootNode.setLeftNode(newNode);
			addElements(value);
		}
		else if((newNode.getValue() > rootNode.getValue()) && rootNode.getRightNode()==null){
			rootNode.setRightNode(newNode);
			addElements(value);
		}
		
      
		
		/*
		 * if(newNode.getValue() < rootNode.getValue()) {
		 * rootNode.setLeftNode=addElements(value); }
		 */
	   // if(newNode.getValue()<rootNode.getValue() && newNode.getValue()< rightNode.)
	    
	   
	}
	
	 public void printElements() {
	    	if(rootNode!=null) {
	    		System.out.println(rootNode.getValue());
	    		if(rootNode.getLeftNode()!=null) {
	    			System.out.println(rootNode.getLeftNode().getValue());
	    			printElements();
	    		}
	    		else if(rootNode.getRightNode()!=null) {
	    			System.out.println(rootNode.getRightNode().getValue());
	    			printElements();
	    		}
	    	}
	    }
	 
	 
	public static void main(String[] args) {
		
		Node nodeObject = new Node();
		nodeObject.setValue(100);
		nodeObject.setValue(40);
		nodeObject.setValue(110);
		nodeObject.setValue(10);
		
		MainMethod m = new MainMethod();
		m.printElements();
	}
}
