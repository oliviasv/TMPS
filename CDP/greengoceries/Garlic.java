package CDP.greengoceries;

public class Garlic implements Item {
    private String name;
    private String type;
    private float price;

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String displayInfo() {
        return "Garlic";
    }

    @Override
    public String toString() {
        return "*" + name + "*" + "\n" + displayInfo() + "\n" + "Price: " + price + ", " + "Type: " + type + "\n";
    }
}
