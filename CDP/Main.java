package CDP;

import CDP.AbstractFactory;
import CDP.FruitFactory;

public class Main {

    public static void main(String[] args)  {
        AbstractFactory vegetableFactory = VegetableFactory.getVegetableFactory();
        System.out.println(vegetableFactory.prepareForSale("CARROTS").toString());
        System.out.println(vegetableFactory.prepareForSale("GARLIC").toString());
        System.out.println(vegetableFactory.prepareForSale("ONION").toString());
        System.out.println(vegetableFactory.prepareForSale("POTATOES").toString());

        AbstractFactory fruitFactoty = FruitFactory.getFruitFactory();
        System.out.println(fruitFactoty.prepareForSale("APPLES"));
        System.out.println(fruitFactoty.prepareForSale("ORANGES"));
        System.out.println(fruitFactoty.prepareForSale("PEARS"));
    }



}
