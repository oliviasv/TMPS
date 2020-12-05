package BDP.utilities.Adapter;

import BDP.domain.FreshJuice;
import BDP.domain.Item;

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
    public void setName(String name) {

    }

    @Override
    public void setType(String type) {

    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public void setPrice(float price) {

    }

    @Override
    public void setXmasBonus(String bonus) {

    }

    @Override
    public float getPrice() {
        return 0;
    }

}
