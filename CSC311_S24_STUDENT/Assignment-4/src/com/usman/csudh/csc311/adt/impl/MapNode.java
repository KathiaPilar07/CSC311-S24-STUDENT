package com.usman.csudh.csc311.adt.impl;

public class MapNode {
	String key;
	String value;
	MapNode next;
	
	public MapNode(String key, String value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}

}
