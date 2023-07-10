public class Main {
    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();

        PriceStrategy economyStrategy = new StandardPriceStrategy();
        PriceStrategy luxuryStrategy = new PremiumPriceStrategy();

        Car economyCar = carRentalService.rentCar("Economy", 3, true, true, economyStrategy);
        Car luxuryCar = carRentalService.rentCar("Luxury", 5, true, false, luxuryStrategy);
    }
}