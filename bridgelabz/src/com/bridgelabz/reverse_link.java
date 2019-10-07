package com.bridgelabz;
import java.util.*;
public class reverse_link {
 public	static class Node 
	{  
	    int data;  
	    Node next;  
	} 
	static Node head = null; 
public static void main(String args[])
{
	push(5);
	push(4);
	push(3);
	push(2);
	push(1);
	System.out.println("\nbefore reverse:");
	printlist();
	head=reverselist(head);
	System.out.println("\nafter reverse:");
	printlist();
	
}
static void printlist() {
	Node ptr=head;
	while(ptr!=null) {
		System.out.print(ptr.data+" ");
		ptr=ptr.next;
	}
}
static void push(int new_data)
{
	Node new_node=new Node();
	new_node.data=new_data;
	new_node.next=head;
	head=new_node;
}
static Node reverselist(Node head) {
Stack<Node> stk=new Stack<Node>();
Node ptr=head;
while(ptr.next!=null) {
	stk.push(ptr);
	ptr=ptr.next;
	}
head=ptr;
while(!stk.isEmpty())
{
	ptr.next=stk.peek();
	ptr=ptr.next;
	stk.pop();
}ptr.next=null;
	return head;
	
}
}
