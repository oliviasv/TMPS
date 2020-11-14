package CDP.greengoceries.builders;

import CDP.greengoceries.Carrot;

public class CarrotBuilder implements ItemBuilder {
    private Carrot carrot;

    public CarrotBuilder() {
        this.create();
    }

    @Override
    public void create() {
        this.carrot = new Carrot();
    }

    @Override
    public void setType(String type) {
        this.carrot.setType(type);
    }

    @Override
    public void setName(String name) {
        this.carrot.setName(name);
    }

    @Override
    public void setPrice(float price) {
        this.carrot.setPrice(price);
    }

    public Carrot getItem() {
        Carrot item = this.carrot;
        this.create();
        return item;
    }
}
