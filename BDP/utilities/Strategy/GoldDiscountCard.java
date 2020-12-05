package BDP.utilities.Strategy;

public class GoldDiscountCard implements DiscountCard{
    @Override
    public float useDiscountCard(float price) {
        return (float) (price * 0.7);
    }
}
