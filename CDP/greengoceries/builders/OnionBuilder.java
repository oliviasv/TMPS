package CDP.greengoceries.builders;

import CDP.greengoceries.Onion;

public class OnionBuilder implements ItemBuilder {
    private Onion onion;

    public OnionBuilder() {

        this.create();
    }

    @Override
    public void create() {
        this.onion = new Onion();
    }

    @Override
    public void setType(String type) {
        this.onion.setType(type);
    }

    @Override
    public void setName(String name) {
        this.onion.setName(name);
    }

    @Override
    public void setPrice(float price) {
        this.onion.setPrice(price);
    }

    public Onion getItem() {
        Onion item = this.onion;
        this.create();
        return item;
    }
}
