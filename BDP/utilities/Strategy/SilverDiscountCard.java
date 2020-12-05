package BDP.utilities.Strategy;

public class SilverDiscountCard implements DiscountCard{
    @Override
    public float useDiscountCard(float price) {
        return (float) (price * 0.9);
    }
}
