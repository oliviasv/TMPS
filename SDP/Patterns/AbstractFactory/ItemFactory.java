package SDP.Patterns.AbstractFactory;

import SDP.Category.Item;

public interface ItemFactory {

    Item prepareForSale(String name);

}
