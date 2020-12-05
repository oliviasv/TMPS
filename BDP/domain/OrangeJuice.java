package BDP.domain;

public class OrangeJuice implements FreshJuice {
    private String name = "Orange Juice";
    private float price = 35;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "*" + name + "*" + " \n" + "Price: " + price + "." + "\n";
    }
}
