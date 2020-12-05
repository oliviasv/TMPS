package BDP.utilities.Decorator;

import BDP.domain.Item;
import BDP.utilities.AbstractFactory.ItemFactory;

public class ItemDecorator implements ItemFactory {

    protected ItemFactory decoratedItem;

    public ItemDecorator(ItemFactory decoratedItem) {
        this.decoratedItem = decoratedItem;
    }

    public Item prepareForSale(String name) {
        return decoratedItem.prepareForSale(name);
    }
}
