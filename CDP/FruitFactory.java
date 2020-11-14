package CDP;

import CDP.greengoceries.Item;
import CDP.greengoceries.builders.*;

public class FruitFactory implements AbstractFactory {
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
            AppleBuilder appleBuilder = new AppleBuilder();
            salesman.sellApple(appleBuilder);
            return appleBuilder.getItem();
        }

        else if(name.equalsIgnoreCase("ORANGES")){
            OrangeBuilder orangeBuilder = new OrangeBuilder();
            salesman.sellOrange(orangeBuilder);
            return orangeBuilder.getItem();
        }

        else if(name.equalsIgnoreCase("PEARS")){
            PearBuilder pearBuilder = new PearBuilder();
            salesman.sellPear(pearBuilder);
            return pearBuilder.getItem();
        }

        return null;
    }
}
