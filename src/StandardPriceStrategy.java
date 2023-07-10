public class StandardPriceStrategy implements PriceStrategy {
    @Override
    public double calculatePrice(int days) {
        return days * 20.0;
    }
}
