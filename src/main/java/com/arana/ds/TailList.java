package com.arana.ds;

public class TailList extends SList {
	// Head and size inherited from SList
	private SListNode tail;
	
	public TailList() {
		this.tail = null;
	}

	public void insertEnd(Object obj){
		SListNode node = new SListNode(obj);
		// If the List is empty make a new SListNode
		if (head == null) {
			head = node;
			tail = head;			
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}
	
	public void insertFront(Object obj){
		super.insertFront(obj);
		if(size == 1){
			this.tail = head;
		}
	}
}
