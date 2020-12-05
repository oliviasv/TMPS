package BDP.utilities.Builder;

public interface ItemBuilder {
    void create();
    void setName(String name);
    void setType(String type);
    void setDescription(String type);
    void setPrice(float price);
}
