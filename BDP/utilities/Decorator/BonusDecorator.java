package BDP.utilities.Decorator;

import BDP.domain.Item;
import BDP.utilities.AbstractFactory.ItemFactory;

public class BonusDecorator extends ItemDecorator {
    private final String givenBonus;

    public BonusDecorator(ItemFactory decoratedItem, String givenBonus) {
        super(decoratedItem);
        this.givenBonus = givenBonus;
    }

    @Override
    public Item prepareForSale(String name) {
        Item item = super.prepareForSale(name);
        item.setXmasBonus(this.givenBonus);
        return item;
    }
}
