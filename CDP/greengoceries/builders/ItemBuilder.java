package CDP.greengoceries.builders;

public interface ItemBuilder {
    void create();
    void setType(String type);
    void setName(String name);
    void setPrice(float price);
}
