package CDP.greengoceries.builders;

import CDP.greengoceries.Apple;

public class AppleBuilder implements ItemBuilder {

    private Apple apple;

    public AppleBuilder() {
        this.create();
    }

    @Override
    public void create() {
        this.apple = new Apple();
    }

    @Override
    public void setType(String type) {
        this.apple.setType(type);
    }

    @Override
    public void setName(String name) {
        this.apple.setName(name);
    }

    @Override
    public void setPrice(float price) {
        this.apple.setPrice(price);
    }

    public Apple getItem() {
        Apple item = this.apple;
        this.create();
        return item;
    }
}
