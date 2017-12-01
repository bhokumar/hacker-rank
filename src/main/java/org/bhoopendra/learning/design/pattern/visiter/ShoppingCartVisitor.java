package org.bhoopendra.learning.design.pattern.visiter;

public interface ShoppingCartVisitor {
        int visit(Book book);
        int visit(Fruit fruit);
}
