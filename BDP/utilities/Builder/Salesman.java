package BDP.utilities.Builder;

public class Salesman {
    public ItemBuilder sellApple(FruitBuilder builder) {
        builder.create();
        builder.setName("Apples");
        builder.setType("Fruit");
        builder.setPrice(10);
        builder.setDescription("Red sweet apples.");
        return builder;
    }

    public ItemBuilder sellCarrot(VegetableBuilder builder) {
        builder.create();
        builder.setName("Carrots");
        builder.setType("Vegetables");
        builder.setPrice(12);
        builder.setDescription("Tiny fresh carrots.");
        return builder;
    }

    public ItemBuilder sellGarlic(VegetableBuilder builder) {
        builder.create();
        builder.setName("Garlic");
        builder.setType("Vegetables");
        builder.setPrice(15);
        builder.setDescription("Tiny fresh carrots.");
        return builder;
    }

    public ItemBuilder sellOnion(VegetableBuilder builder) {
        builder.create();
        builder.setName("Onion");
        builder.setType("Vegetables");
        builder.setPrice(5);
        builder.setDescription("Red onion.");
        return builder;
    }

    public ItemBuilder sellOrange(FruitBuilder builder) {
        builder.create();
        builder.setName("Oranges");
        builder.setType("Fruit");
        builder.setPrice(20);
        builder.setDescription("Fresh, succulent oranges.");
        return builder;
    }

    public ItemBuilder sellPear(FruitBuilder builder) {
        builder.create();
        builder.setName("Pears");
        builder.setType("Fruit");
        builder.setPrice(25);
        builder.setDescription("Fresh, sweet pears.");
        return builder;
    }

    public ItemBuilder sellPotato(VegetableBuilder builder) {
        builder.create();
        builder.setName("Potatoes");
        builder.setType("Vegetables");
        builder.setPrice(8);
        builder.setDescription("Purple Potatoes.");
        return builder;
    }
}
