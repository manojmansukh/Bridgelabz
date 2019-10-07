package com.Link_list;
import java.util.*;


public class mergelist {
 public static class Node{
	 int data;
	 Node next;
 }
 static Node head=null;
 static void push(int new_data)
 {
 	Node new_node=new Node();
 	new_node.data=new_data;
 	new_node.next=head;
 	head=new_node;
 }

 void printlist() {
		Node ptr=head;
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}head=null;
	}
 void mergelist(Node node1,Node node2) 
 {
	 Node node1next,node2next;
	 Node first=node1;
	 Node sec=node2;
	 while(node1!=null && node2!=null)
	 {
		 node1next=node1.next;
		 node1.next=node2;
		 node1=node1next;
		 
		 node2next=node2.next;
		 node2.next=node1;
		 node2=node2next;
	 }sec=node2;
 }
 public static void main(String args[]) {
	mergelist list1=new mergelist();
	Node head1;
    list1.push(11);
	list1.push(12);
	list1.push(13);
	System.out.println("first link list:");
	list1.printlist();
	mergelist list2=new mergelist();
	list1.push(10);
	list2.push(20);
	list2.push(21);
	list2.push(22);
	System.out.println("\nsec link list:");
	list2.printlist();
		 
	//list1.mergelist(list2);
 }
}
