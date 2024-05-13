package com.usman.csudh.csc311.adt.impl;
import com.usman.csudh.csc311.adt.Map;

public class HashMap implements Map{
	
	//Intitial bucket size
	private static final int DEFAULT_BUCKET_SIZE = 16;
	
	//default load factor
	private static final double DEFAULT_LOAD_FACTOR = 0.75;
	
	//Buckets
	MapNode buckets[];
	double loadFactor;
	
	
	public HashMap() {
		loadFactor = DEFAULT_LOAD_FACTOR;
		buckets = new MapNode[DEFAULT_BUCKET_SIZE];		
	}
	
	public HashMap(int maxItems) {
		this(maxItems, DEFAULT_LOAD_FACTOR);
	}
	
	public HashMap(int maxItems, double loadFactor) {
		buckets = new MapNode[(int)((double)maxItems/loadFactor)];
	}
	
	
	
	private int computeBucket(String key) {
		int hash = key.hashCode();
		
		//evaluate a value between 0 and 15
		int index = hash % buckets.length;
		return index;
	}
	
	private void rehash() {
		
		if (size() < buckets.length * loadFactor) {
			return;
		}
  
		
		
		//TODO: Implement rehashing
	}
	
	
	
	public void put(String key, String value) {
		rehash();
		MapNode newNode = new MapNode(key, value);
		
		int bucket= computeBucket(key);
		MapNode head = buckets[bucket];
		
		
		if (head == null) {
			head = newNode;
			buckets[bucket] = head;
			return;
		}
		
		MapNode current = head;
		
		while (current.next != null) {
			current = current.next;
		
			//Ensure there is no duplicate key
			if (current.key.equals(key)) {
				current.value = value;
				return;
			}
		}	
		current.next = newNode;
	}

	@Override
	public String get(String key) {
		int bucket= computeBucket(key);
		MapNode head = buckets[bucket];
		//return null if the map is empty
		if (head == null) {
			return null;
		}
		
		//if map is not empty then start from head
		// and keep moving to the next node until the key is found
		MapNode current = head;
		
		while (current != null) {
			if (current.key.equals(key)) {
				return current.value;
			}
			current = current.next;
		}
		return null;
	}
	
	public String toString() {
		String result = "{";
//		MapNode current = head;
//		while (current != null) {
//			result += current.key + " : " + current.value + "\n";
//			current = current.next;
//		}
		return result+="}";
	}

	@Override
	public String remove(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsKey(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		//Iterate through the buckets and count the number of nodes
		int count = 0;
		for (int i = 0; i < buckets.length; i++) {
			MapNode current = buckets[i];
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

	@Override
	public String[] keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] values() {
		// TODO Auto-generated method stub
		return null;
	}

}
