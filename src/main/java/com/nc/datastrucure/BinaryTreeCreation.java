package com.nc.datastrucure;

public class BinaryTreeCreation {
	public static void main(String[] args) {
		Node node = new Node(20);
		node.insert(10);
		node.insert(8);
		node.insert(5);
		node.insert(15);

		// node.printTree();
		System.out.println(node.contains(0));
	}
}

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
	}

	public Node() {
	}

	public void insert(int val) {
		if (val <= data) {
			if (left == null) {
				left = new Node(val);
			} else {
				left.insert(val);
			}
		} else {
			if (right == null) {
				right = new Node(val);
			} else {
				right.insert(val);
			}
		}
	}

	public boolean contains(int val) {
		if (val == data) {
			return true;
		}

		if (val <= data) {
			if (left == null) {
				return false;
			} else {
				return left.contains(val);
			}
		} else {
			if (right == null) {
				return false;
			} else {
				return right.contains(val);
			}
		}
	}

	public void printTree() {
		if (left != null) {
			left.printTree();
		}

		System.out.println(data);

		if (right != null) {
			right.printTree();
		}

	}
}
