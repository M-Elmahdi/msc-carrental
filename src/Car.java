interface Car {
    String getDescription();
    double calculatePrice(int days);
    void setPriceStrategy(PriceStrategy strategy);
}
