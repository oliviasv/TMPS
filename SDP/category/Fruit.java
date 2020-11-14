package SDP.category;

public class Fruit implements Item {
    private String name;
    private String type;
    private String description;
    private float price;


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


    @Override
    public String toString() {
        return "*" + name + "*" + "\n" + description + "\n" + "Price: " + price + ", " +
                "Category: " + type + "." + "\n";
    }
}
