package BDP.utilities.AbstractFactory;

import BDP.domain.Item;
import BDP.utilities.Builder.FruitBuilder;
import BDP.utilities.Builder.Salesman;

public class FruitFactory implements ItemFactory {
    private static FruitFactory fruitFactory;
    private final Salesman salesman = new Salesman();

    public static FruitFactory getFruitFactory() {
        if(fruitFactory == null)
            fruitFactory = new FruitFactory();
        return fruitFactory;
    }

    private FruitFactory() {}

    @Override
    public Item prepareForSale(String name) {
        if(name == null){
            return null;
        }

        if(name.equalsIgnoreCase("APPLES")){
            FruitBuilder appleBuilder = new FruitBuilder();
            salesman.sellApple(appleBuilder);
            return appleBuilder.getItem();
        }

        else if(name.equalsIgnoreCase("ORANGES")){
            FruitBuilder orangeBuilder = new FruitBuilder();
            salesman.sellOrange(orangeBuilder);
            return orangeBuilder.getItem();
        }

        else if(name.equalsIgnoreCase("PEARS")){
            FruitBuilder pearBuilder = new FruitBuilder();
            salesman.sellPear(pearBuilder);
            return pearBuilder.getItem();
        }

        return null;
    }
}
