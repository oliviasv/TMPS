package CDP.greengoceries.builders;

import CDP.greengoceries.Pear;

public class PearBuilder implements ItemBuilder {
    private Pear pear;

    public PearBuilder() {

        this.create();
    }

    @Override
    public void create() {
        this.pear = new Pear();
    }

    @Override
    public void setType(String type) {
        this.pear.setType(type);
    }

    @Override
    public void setName(String name) {
        this.pear.setName(name);
    }

    @Override
    public void setPrice(float price) {
        this.pear.setPrice(price);
    }

    public Pear getItem() {
        Pear item = this.pear;
        this.create();
        return item;
    }
}
