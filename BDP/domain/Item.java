package BDP.domain;

public interface Item {
    void setName(String name);
    void setType(String type);
    void setDescription(String description);
    void setPrice(float price);
    void setXmasBonus(String bonus);
    float getPrice();
}
