package me.dingko.designpatterns._02_structure_patterns._02_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Bag 은 Composite 타입이다. Composite 타입은 Leaf(Item) 가 아니라, Component(Component) 를 참조(써야)해야 한다.
 */
public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
