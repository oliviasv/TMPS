package SDP.Patterns;

import SDP.Category.Item;
import SDP.Category.FreshJuice;

public class FreshJuiceAdapter implements Item {
    private final FreshJuice orangeJuice;

    public FreshJuiceAdapter(FreshJuice orangeJuice){
        this.orangeJuice = orangeJuice;
    }

    @Override
    public String toString() {
        return orangeJuice.toString();
    }

    @Override
    public void setName(String name) {}

    @Override
    public void setType(String type) {}

    @Override
    public void setDescription(String description) {}

    @Override
    public void setPrice(float price) {}

    @Override
    public void setXmasBonus(String bonus) {}

}
