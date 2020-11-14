package CDP;

import CDP.greengoceries.Item;
import CDP.greengoceries.builders.*;

public class VegetableFactory implements AbstractFactory {
    private static VegetableFactory vegetableFactory;
    private final Salesman salesman = new Salesman();

    public static VegetableFactory getVegetableFactory() {
        if(vegetableFactory == null)
            vegetableFactory = new VegetableFactory();
        return vegetableFactory;
    }

    private VegetableFactory() {}

    @Override
    public Item prepareForSale(String name) {

        if(name == null){
            return null;
        }

        if(name.equalsIgnoreCase("CARROTS")){
            CarrotBuilder carrotBuilder = new CarrotBuilder();
            salesman.sellCarrot(carrotBuilder);
            return carrotBuilder.getItem();
        }

        else if(name.equalsIgnoreCase("GARLIC")){
            GarlicBuilder garlicBuilder = new GarlicBuilder();
            salesman.sellGarlic(garlicBuilder);
            return garlicBuilder.getItem();
        }

        else if(name.equalsIgnoreCase("ONION")){
            OnionBuilder onionBuilder = new OnionBuilder();
            salesman.sellOnion(onionBuilder);
            return onionBuilder.getItem();
        }

        else if(name.equalsIgnoreCase("POTATOES")){
            PotatoBuilder potatoBuilder = new PotatoBuilder();
            salesman.sellPotato(potatoBuilder);
            return potatoBuilder.getItem();
        }
        return null;
    }
}
