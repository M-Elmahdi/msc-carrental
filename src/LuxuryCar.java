public class LuxuryCar implements Car {
    private PriceStrategy priceStrategy;

    @Override
    public String getDescription() {
        return "Luxury Car";
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
