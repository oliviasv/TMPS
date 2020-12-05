package BDP.utilities.Facade;

import BDP.domain.Item;
import BDP.utilities.AbstractFactory.ItemFactory;
import BDP.utilities.Decorator.BonusDecorator;
import BDP.utilities.Decorator.ItemDecorator;

public class ItemFacade {

    private final ItemFactory decoratedItem;

    public ItemFacade(ItemFactory decoratedItem) {

        this.decoratedItem = decoratedItem;
    }

    public Item prepareCustomProduct(String name, String givenBonus, float price) {
        ItemDecorator customizer = new BonusDecorator(decoratedItem, givenBonus);
        Item customItem = customizer.prepareForSale(name);
        customItem.setPrice(price);
        return customItem;
    }
}
