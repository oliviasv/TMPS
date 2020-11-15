package SDP.Patterns.Builder;

import SDP.Category.Fruit;

public class FruitBuilder implements ItemBuilder{
    private Fruit fruit;

    public FruitBuilder() {
        this.create();
    }

    @Override
    public void create() {
        this.fruit = new Fruit();
    }

    @Override
    public void setName(String name) {
        this.fruit.setName(name);
    }

    @Override
    public void setType(String type) {
        this.fruit.setType(type);
    }

    @Override
    public void setDescription(String description) {
        this.fruit.setDescription(description);
    }

    @Override
    public void setPrice(float price) {
        this.fruit.setPrice(price);
    }

    public Fruit getItem() {
        Fruit item = this.fruit;
        this.create();
        return item;
    }
}
