package com.demo.sample;

public class SinglyLinkedList {

	public static void main(String[] args) {
		
		Node headNode = new Node();
		headNode.setValue("Villupuram");
		
		Node cuddalore = new Node();
		cuddalore.setValue("Cuddalore");
		headNode.setNextNode(cuddalore);
		
		Node chennai = new Node();
		chennai.setValue("Chennai");
		cuddalore.setNextNode(chennai);
		
		Node trichy = new Node();
		trichy.setValue("Trichy");
		chennai.setNextNode(trichy);
		
		Node nodeObj = headNode;
		
		while(nodeObj != null) {
			System.out.println(nodeObj.getValue());
			nodeObj = nodeObj.getNextNode();
		}
		
		Node madurai = new Node();
		madurai.setValue("Madurai");
		madurai.setNextNode(trichy);
		}
	}

