package org.bhoopendra.learning.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Component {
    private List<Component> childComponents = new ArrayList<>();

    @Override
    public void print() {
        childComponents.stream().forEach(component -> component.print());
    }

    public void addComponent(final Component component){
        childComponents.add(component);
    }

    public void removeComponent(final Component component){
        childComponents.remove(component);
    }
}
