package CDP.greengoceries.builders;

import CDP.greengoceries.Potato;

public class PotatoBuilder implements ItemBuilder {
    private Potato potato;

    public PotatoBuilder() {

        this.create();
    }

    @Override
    public void create() {
        this.potato = new Potato();
    }

    @Override
    public void setType(String type) {
        this.potato.setType(type);
    }

    @Override
    public void setName(String name) {
        this.potato.setName(name);
    }

    @Override
    public void setPrice(float price) {
        this.potato.setPrice(price);
    }

    public Potato getItem() {
        Potato item = this.potato;
        this.create();
        return item;
    }
}
