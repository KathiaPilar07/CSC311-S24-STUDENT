package com.usman.csudh.csc311.adt.impl;
import com.usman.csudh.csc311.adt.Set;
import com.usman.csudh.csc311.adt.SetItemNotFoundException;

public class HashSet implements Set{

	//Lab assignment create a new array of Buckets twice , the orig size
	private static final int DEFAULT_SET_SIZE = 16;
	private static final double DEFAULT_LOAD_FACTOR = 0.75;
	
	Node[] hashBuckets=new Node[16];
	
	public HashSet() {
		hashBuckets = new Node[(int)((double)DEFAULT_SET_SIZE/DEFAULT_LOAD_FACTOR)];
		
		
		

	}
	
	
	public HashSet(int size) {
		hashBuckets = new Node[(int)((double)size/DEFAULT_LOAD_FACTOR)];
	}
	
	public HashSet(int size, double loadFactor) {
		hashBuckets = new Node[(int) ((double) size / loadFactor)];
	}
	
	
	@Override
	public void add(int item) {
		rehash();
		//Create new node
		Node newNode = new Node(item);
		//Compute bucket (0 to length-1 of buckets array)
		int bucket = computeBucket(item);
		
		//if the position is empty then add the new node
		Node head = hashBuckets[bucket];
		if (head == null) {
			hashBuckets[bucket] = newNode;
			return;
		} 
		//traverse the list and add the new node at the end
	    Node current=head;
	    
		while (current != null) {
			//check for duplicates
			System.out.println("Current: "+current.data);
			if (current.data == item) {
				return;
			}
			current = current.next;
		}
		current.next = newNode;
		
		
	}
	
	private void rehash() {
		if (size() < hashBuckets.length * DEFAULT_LOAD_FACTOR) {
			return;
		}
		
		//TODO: Implement rehashing
		
		//Create a new array of buckets, twice the original size
		//Iterate over the old buckets and (computeBucket) method
		//Add the items to the new array
		
	}
	
	private int computeBucket(Integer item) {
		int hash = item.hashCode();
		int index = hash % hashBuckets.length;
		return index;
	}

	
	
	@Override
	public int remove(int item) throws SetItemNotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(int item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		
		int count = 0;
		for (int i = 0; i < hashBuckets.length; i++) {
			Node current = hashBuckets[i];
			while (current != null) {
				count++;
				current = current.next;
			}
		}
		return count;
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		String result = "{";
		for (int i = 0; i < hashBuckets.length; i++) {
			Node current = hashBuckets[i];
			while (current != null) {
				result += current.data + " ";
				current = current.next;
			}
		}
		return result += "}";
	}

}
