package org.bhoopendra.learning.design.pattern.visiter;

public interface ItemElement {
    int accept(ShoppingCartVisitor shoppingCartVisitor);
}
