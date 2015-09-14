package com.moyiguket.tree.avl;

public class AvlTree<AnyType> {
	
	AvlNode<AnyType> t;
	
	private int height(AvlNode<AnyType> t){
		return t == null ? -1 : t.height;
	}
	
	
}
