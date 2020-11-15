package SDP.Patterns.AbstractFactory;

import SDP.Category.Item;
import SDP.Patterns.Builder.Salesman;
import SDP.Patterns.Builder.VegetableBuilder;

public class VegetableFactory implements ItemFactory {
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
            VegetableBuilder carrotBuilder = new VegetableBuilder();
            salesman.sellCarrot(carrotBuilder);
            return carrotBuilder.getItem();
        }

        else if(name.equalsIgnoreCase("GARLIC")){
            VegetableBuilder garlicBuilder = new VegetableBuilder();
            salesman.sellGarlic(garlicBuilder);
            return garlicBuilder.getItem();
        }

        else if(name.equalsIgnoreCase("ONION")){
            VegetableBuilder onionBuilder = new VegetableBuilder();
            salesman.sellOnion(onionBuilder);
            return onionBuilder.getItem();
        }

        else if(name.equalsIgnoreCase("POTATOES")){
            VegetableBuilder potatoBuilder = new VegetableBuilder();
            salesman.sellPotato(potatoBuilder);
            return potatoBuilder.getItem();
        }
        return null;
    }
}
