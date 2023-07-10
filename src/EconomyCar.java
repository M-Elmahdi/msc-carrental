public class EconomyCar implements Car {
    private PriceStrategy priceStrategy;

    @Override
    public String getDescription() {
        return "Economy Car";
    }

    @Override
    public double calculatePrice(int days) {
        return priceStrategy.calculatePrice(days);
    }

    @Override
    public void setPriceStrategy(PriceStrategy strategy) {
        this.priceStrategy = strategy;
    }
}
