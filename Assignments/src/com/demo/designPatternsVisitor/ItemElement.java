package com.demo.designPatternsVisitor;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
