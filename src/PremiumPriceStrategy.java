public class PremiumPriceStrategy implements PriceStrategy {
    @Override
    public double calculatePrice(int days) {
        return days * 50.0;
    }
}
