package SDP.Patterns;

import SDP.Category.Item;
import SDP.Patterns.Decorator.ItemDecorator;
import SDP.Patterns.Decorator.BonusDecorator;
import SDP.Patterns.AbstractFactory.ItemFactory;

public class ItemFacade {

    private final ItemFactory decoratedItem;

    public ItemFacade (ItemFactory decoratedItem) {

        this.decoratedItem = decoratedItem;
    }

    public Item prepareCustomProduct(String name, String givenBonus, float price) {
        ItemDecorator customizer = new BonusDecorator(decoratedItem, givenBonus);
        Item customItem = customizer.prepareForSale(name);
        customItem.setPrice(price);
        return customItem;
    }
}
