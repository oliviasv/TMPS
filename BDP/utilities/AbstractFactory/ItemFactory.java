package BDP.utilities.AbstractFactory;

import BDP.domain.Item;

public interface ItemFactory {

    Item prepareForSale(String name);

}
