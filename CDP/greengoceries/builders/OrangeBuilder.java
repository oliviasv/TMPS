package CDP.greengoceries.builders;

import CDP.greengoceries.Orange;

public class OrangeBuilder implements ItemBuilder {
    private Orange orange;

    public OrangeBuilder() {

        this.create();
    }

    @Override
    public void create() {
        this.orange = new Orange();
    }

    @Override
    public void setType(String type) {
        this.orange.setType(type);
    }

    @Override
    public void setName(String name) {
        this.orange.setName(name);
    }

    @Override
    public void setPrice(float price) {
        this.orange.setPrice(price);
    }

    public Orange getItem() {
        Orange item = this.orange;
        this.create();
        return item;
    }
}
