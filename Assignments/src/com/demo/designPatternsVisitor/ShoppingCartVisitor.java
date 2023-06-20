package com.demo.designPatternsVisitor;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
