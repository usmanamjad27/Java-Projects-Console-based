public class S5_HotDogStand {
    private String standId;
    private int hotDogsSold;

    // Constructor to initialize stand ID
    public S5_HotDogStand(String standId) {
        this.standId = standId;
        this.hotDogsSold = 0; // Initially, no hot dogs are sold
    }

    // Method to increment the number of hot dogs sold
    public void justSold() {
        hotDogsSold++;
    }

    // Getter method to retrieve the number of hot dogs sold
    public int getHotDogsSold() {
        return hotDogsSold;
    }

    // Method to display sales data
    public void displaySales() {
        System.out.println("Stand ID: " + standId + " | Hot Dogs Sold: " + hotDogsSold);
    }
}