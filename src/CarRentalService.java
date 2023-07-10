public class CarRentalService {

    public Car rentCar(String carType, int days, boolean hasGPS, boolean hasChildSeat, PriceStrategy priceStrategy) {
        Car car;
        if (carType.equals("Economy")) {
            car = new EconomyCar();
        } else {
            car = new LuxuryCar();
        }

        car.setPriceStrategy(priceStrategy);

        if (hasGPS) {
            System.out.println("Adding GPS to the car.");
        }

        if (hasChildSeat) {
            System.out.println("Adding child seat to the car.");
        }

        System.out.println("You have rented a " + car.getDescription() + " for " + days + " days.");
        System.out.println("Total price: $" + car.calculatePrice(days));

        return car;
    }
}
