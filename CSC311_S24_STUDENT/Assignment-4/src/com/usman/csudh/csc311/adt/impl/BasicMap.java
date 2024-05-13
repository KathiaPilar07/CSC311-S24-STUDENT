package com.usman.csudh.csc311.adt.impl;
import com.usman.csudh.csc311.adt.Map;

public class BasicMap implements com.usman.csudh.csc311.adt.Map{
	
	MapNode head;
	
	public void put(String key, String value) {
		MapNode newNode = new MapNode(key, value);
		
		if (head == null) {
			head = newNode;
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
	
		//return null if the map is empty
		if (head == null) {
			return null;
		}
		
		//if map is not emptu then start from head
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
		MapNode current = head;
		while (current != null) {
			result += current.key + " : " + current.value + "\n";
			current = current.next;
		}
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
		// TODO Auto-generated method stub
		return 0;
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
