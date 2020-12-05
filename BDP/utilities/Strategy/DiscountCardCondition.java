package BDP.utilities.Strategy;

public class DiscountCardCondition {
    private final DiscountCard discountCard;

    public DiscountCardCondition(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }

    public float setNewPrice(float price) {
        return discountCard.useDiscountCard(price);
    }
}
