package com.demo.sample;

public class LinkedList {
	
	Node headNode;
	
	
	public void add(String value) {
		Node newNode = new Node();
		newNode.setValue(value);
		
		if(headNode == null) {
			headNode=newNode;
		}
		else {
			Node currentNode=headNode;
		    while(currentNode.getNextNode()!=null) {
		    	currentNode = currentNode.getNextNode();
		    }
		    currentNode.setNextNode(newNode);
		}
	}
	
	public void search(String value) {
		Node currentNode=headNode;
		boolean matchFound = false;
		
		while(currentNode != null && !matchFound) {
			if(currentNode.getValue().equals(value)){
				matchFound=true;
				System.out.println("Match found");
			}
			
			currentNode = currentNode.getNextNode();
		}
		if(!matchFound) {
		   System.out.println("Not found");
		}
	}
	
	public void insert(String value, String nextValue) {
		Node newNode = new Node();
		Node currentNode=headNode;
		boolean matchFound = false;
		
		while(currentNode != null && !matchFound) {
			if(currentNode.getValue().equals(nextValue)){
				newNode.setNextNode(currentNode.getNextNode());
				currentNode.setNextNode(newNode);
				newNode.setValue(value);
				matchFound=true;
				System.out.println("Inserted");
			}
			
			currentNode = currentNode.getNextNode();
		}
		if(!matchFound) {
		   System.out.println("Not Inserted");
		}
		
		}
	
	public void delete(String value) {
		boolean matchFound=false;
		
		if(headNode.getValue().equals(value)) {
			headNode=headNode.getNextNode();
		}
		else {
			Node currentNode=headNode;
			Node previousNode=null;
			
			while(currentNode != null && !matchFound) {


			if(currentNode.getValue().equals(value)){
				matchFound=true;
				System.out.println("Match found");
				previousNode.setNextNode(currentNode.getNextNode());

			}
			previousNode=currentNode;

			currentNode=currentNode.getNextNode();
           }
		}
		if(!matchFound) {
			   System.out.println("Not Deleted");
			}
		}
	
	
	public void print() {
		Node currentNode = headNode;
		while(currentNode != null) {
			System.out.println(currentNode.getValue());
			currentNode = currentNode.getNextNode();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		
		  list.add("Chennai"); 
		  list.add("Nanganallur");
		  //list.print();
		  //list.search("Nanganallur"); 
		  //list.insert("Villupuram", "Chennai");
		  //list.print();
		  
		  list.add("ASSSssss"); 
		  list.print();
		 
		
		//list.print();
		list.delete("ASSSssss");
		list.print();
	}

}
