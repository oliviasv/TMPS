package SDP.Patterns.Decorator;

import SDP.Category.Item;
import SDP.Patterns.AbstractFactory.ItemFactory;

public class ItemDecorator implements ItemFactory {

    protected ItemFactory decoratedItem;

    public ItemDecorator(ItemFactory decoratedItem) {
        this.decoratedItem = decoratedItem;
    }

    public Item prepareForSale(String name) {
        return decoratedItem.prepareForSale(name);
    }
}
