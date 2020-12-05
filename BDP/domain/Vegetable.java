package BDP.domain;

public class Vegetable implements Item {
    private String name;
    private String type;
    private String description;
    private float price;
    private String bonus = "No";

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setXmasBonus(String bonus) {
        this.bonus = bonus;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "*" + name + "*" + "\n" + description + "\n" + "Price: " + price + ", " +
                "Category: " + type + ", " + "XmasBonus: " + bonus + "." + "\n";
    }
}
