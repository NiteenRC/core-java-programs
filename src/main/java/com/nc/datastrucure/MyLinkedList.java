package com.nc.datastrucure;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedNode linkedNode = null;
		LinkedList list = new LinkedList();
		linkedNode = list.add(1, linkedNode);
		linkedNode = list.add(2, linkedNode);
		linkedNode = list.add(3, linkedNode);
		linkedNode = list.add(4, linkedNode);

		list.printLinkedListByRecursively(linkedNode);
		System.out.println();

		linkedNode = list.addAtFront(10, linkedNode);
		list.printLinkedListByWhileLoop(linkedNode);
	}
}

class LinkedNode {
	int data;
	LinkedNode next;
}

class LinkedList {
	public LinkedNode add(int value, LinkedNode node) {
		if (node == null) {
			return insertNewNode(value, node);
		} else {
			node.next = add(value, node.next);
		}
		return node;
	}

	public LinkedNode addAtFront(int value, LinkedNode node) {
		LinkedNode linkedNode = insertNewNode(value, node);
		linkedNode.next = node;
		return linkedNode;

	}

	private LinkedNode insertNewNode(int value, LinkedNode node) {
		LinkedNode linkedNode = new LinkedNode();
		linkedNode.data = value;
		linkedNode.next = null;
		return linkedNode;
	}

	public void printLinkedListByRecursively(LinkedNode linkedNode) {
		if (linkedNode == null) {
			return;
		}

		System.out.print(linkedNode.data + " ");
		printLinkedListByRecursively(linkedNode.next);
	}

	public void printLinkedListByWhileLoop(LinkedNode linkedNode) {
		while (linkedNode != null) {
			System.out.print(linkedNode.data + " ");
			linkedNode = linkedNode.next;
		}
	}
}
