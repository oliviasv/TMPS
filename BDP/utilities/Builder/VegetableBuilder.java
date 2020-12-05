package BDP.utilities.Builder;

import BDP.domain.Vegetable;

public class VegetableBuilder implements ItemBuilder {
    private Vegetable vegetable;

    public VegetableBuilder() {
        this.create();
    }

    @Override
    public void create() {
        this.vegetable = new Vegetable();
    }

    @Override
    public void setName(String name) {
        this.vegetable.setName(name);
    }

    @Override
    public void setType(String type) {
        this.vegetable.setType(type);
    }

    @Override
    public void setDescription(String description) {
        this.vegetable.setDescription(description);
    }

    @Override
    public void setPrice(float price) {
        this.vegetable.setPrice(price);
    }

    public Vegetable getItem() {
        Vegetable item = this.vegetable;
        this.create();
        return item;
    }
}
