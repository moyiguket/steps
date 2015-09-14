package com.moyiguket.tree.avl;

public class AvlNode<AnyType> {
	
	AnyType element;

	AvlNode<AnyType> left;
	
	AvlNode<AnyType> right;
	
	int height;

	public AvlNode(AnyType element, AvlNode<AnyType> left,
			AvlNode<AnyType> right) {
		super();
		this.element = element;
		this.left = left;
		this.right = right;
	}

	public AvlNode(AnyType element) {
		this(element,null,null);
	}
	
	
	
}
