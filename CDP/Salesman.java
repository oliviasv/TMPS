package CDP;

import CDP.greengoceries.builders.*;


public class Salesman {
    public void sellApple(AppleBuilder builder) {
        builder.create();
        builder.setName("Apples");
        builder.setType("Fruit");
        builder.setPrice(10);
    }

    public void sellCarrot(CarrotBuilder builder) {
        builder.create();
        builder.setName("Carrots");
        builder.setType("Vegetables");
        builder.setPrice(12);
    }

    public void sellGarlic(GarlicBuilder builder) {
        builder.create();
        builder.setName("Garlic");
        builder.setType("Vegetables");
        builder.setPrice(15);
    }

    public void sellOnion(OnionBuilder builder) {
        builder.create();
        builder.setName("Onion");
        builder.setType("Vegetables");
        builder.setPrice(5);
    }

    public void sellOrange(OrangeBuilder builder) {
        builder.create();
        builder.setName("Oranges");
        builder.setType("Fruit");
        builder.setPrice(20);
    }

    public void sellPear(PearBuilder builder) {
        builder.create();
        builder.setName("Pears");
        builder.setType("Fruit");
        builder.setPrice(25);
    }

    public void sellPotato(PotatoBuilder builder) {
        builder.create();
        builder.setName("Potatoes");
        builder.setType("Vegetables");
        builder.setPrice(8);
    }
}
