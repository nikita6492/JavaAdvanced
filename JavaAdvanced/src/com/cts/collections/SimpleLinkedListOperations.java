package com.cts.collections;

public class SimpleLinkedListOperations {
	
	Node head=null;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
		
		
	}
	
	
	public void addNode(int data) {
		Node newNode=new Node(data);
		System.out.println("NewNode::"+newNode.toString());
		
		if(head == null) {
			head =newNode;
			System.out.println("Head after assigning new node::"+head.toString());
			
		}
		else {
			Node last = head;
			System.out.println("Last after head assign::"+last.toString());
			while(last.next!=null) {
				last =last.next;
				System.out.println("LAst in loop::"+last.toString());
			}
			last.next=newNode;
			System.out.println("Last after loop::"+last.toString());
		}
	}
	
	public void printNode() {
		Node current =head;
		if(head == null) {
			System.out.println("List is empty");
		}
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	public static void main(String[] args) {
		SimpleLinkedListOperations sl=new SimpleLinkedListOperations();
		sl.addNode(1);
		sl.addNode(2);
		sl.addNode(3);
		sl.addNode(4);

		sl.printNode();
	}

}
