package com.usman.csudh.csc311.adt.impl;
import com.usman.csudh.csc311.adt.List;
import com.usman.csudh.csc311.adt.ListInvalidIndexException;
import com.usman.csudh.csc311.adt.Queue;
import com.usman.csudh.csc311.adt.QueueEmptyException;

/**
 * A linked list implementation of a queue. This implementation uses forward linking nodes
 * to provide the queue functionality.
 */
public class LinkedQueue implements Queue{
	
	Node head;

	
	
	public LinkedQueue() {
		head = null;
	}
	
	
	@Override
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node tail = findTail();
			tail.next = newNode;
		}

	}

	@Override
	public int remove() throws QueueEmptyException {
		if (head == null) {
			throwQueueEmptyException();
		}
		
		Node itemNode=head;		
		head=head.next;
		return itemNode.data;
		
	}

	@Override
	public int peek() throws QueueEmptyException {
		
		if (head == null) {
			throwQueueEmptyException();
		}
        return head.data;
	}

	@Override
	public int size() {
		
		Node current = head;
		int count = 0;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head==null;
	}

	@Override
	public void clear() {
		head=null;
		
	}
	
	// Returns the tail of the list
	private Node findTail() {
		if (head == null) {
			return null;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		return current;
	}

	
	private void throwQueueEmptyException() throws QueueEmptyException {
		throw new QueueEmptyException("Queue is empty");
	}
	

}
