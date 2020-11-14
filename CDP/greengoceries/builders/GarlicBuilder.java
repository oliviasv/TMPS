package CDP.greengoceries.builders;

import CDP.greengoceries.Garlic;

public class GarlicBuilder implements ItemBuilder {
    private Garlic garlic;

    public GarlicBuilder() {

        this.create();
    }

    @Override
    public void create() {
        this.garlic = new Garlic();
    }

    @Override
    public void setType(String type) {
        this.garlic.setType(type);
    }

    @Override
    public void setName(String name) {
        this.garlic.setName(name);
    }

    @Override
    public void setPrice(float price) {
        this.garlic.setPrice(price);
    }

    public Garlic getItem() {
        Garlic item = this.garlic;
        this.create();
        return item;
    }
}
