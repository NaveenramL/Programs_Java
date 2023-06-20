package com.demo.samplequeue;

import java.util.NoSuchElementException;

import com.demo.sample.Node;

public class QueueSample {

	Node headNode;

	public void add(String value) {
		Node newNode = new Node();
		newNode.setValue(value);

		if (headNode == null) {
			headNode = newNode;
		} else {
			Node currentNode = headNode;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}
	}

	public void delete() {
		boolean matchFound = false;

		headNode = headNode.getNextNode();
			
		}
	
	public Node poll() {
		//boolean matchFound = false;
		Node currentNode=headNode;
		//Node previousNode =headNode;
         if(currentNode!=null) {
        //System.out.println("The removed headNode is : "+headNode.getValue());
		headNode = headNode.getNextNode();
		return currentNode;
         }
         else
     		return null;
		
			}
	public Node remove() {
		Node currentNode=headNode;
		//Node previousNode =headNode;
		if(currentNode!=null) {
			headNode=headNode.getNextNode();
			return currentNode;
		}
		else {
			throw new NoSuchElementException();
		}
		
		
	}
	

	public void search(String value) {
		Node currentNode = headNode;
		boolean matchFound = false;

		while (currentNode != null && !matchFound) {
			if (currentNode.getValue().equals(value)) {
				matchFound = true;
				System.out.println("Match found");
			}

			currentNode = currentNode.getNextNode();
		}
		if (!matchFound) {
			System.out.println("Match Not found");
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

		QueueSample qs = new QueueSample();
		qs.add("Villupuram");
		qs.add("Chennai");
		qs.add("Cuddalore");
		qs.add("Tambaram");
		qs.print();
		System.out.println("------------------");
		
		/*
		 * qs.delete(); qs.print(); System.out.println("------------------");
		 * 
		 * qs.search("Tambaram"); qs.search("Villupuram");
		 * System.out.println("------------------");
		 * 
		 * qs.delete(); System.out.println("------------------");
		 * 
		 * qs.delete(); qs.print();
		 */
		//qs.poll();
		//qs.print();
		
		
		QueueSample qs1 = new QueueSample();
		//qs1.add("London");
	    //Node a=qs1.remove();
	    //System.out.println(a.getValue());
		Node b=qs1.poll();
		System.out.println(b);
		System.out.println("------------------");
		
		QueueSample qs4 = new QueueSample();
		qs4.add("Dublin");
		Node c = qs4.poll();
		System.out.println(c.getValue());
		System.out.println("------------------");
		
		QueueSample qs2 = new QueueSample();
		qs2.add("London");
		Node a = qs2.remove();
		System.out.println(a.getValue());
		System.out.println("------------------");
		
		QueueSample qs3 = new QueueSample();
		qs3.remove();
		
	}

}
