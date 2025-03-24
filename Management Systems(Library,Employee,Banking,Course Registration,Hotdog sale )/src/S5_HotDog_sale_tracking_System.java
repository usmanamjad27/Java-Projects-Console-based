public class S5_HotDog_sale_tracking_System {
    public static void main(String[] args) {
        // Create three hot dog stands
        S5_HotDogStand stand1 = new S5_HotDogStand("Stand-101");
        S5_HotDogStand stand2 = new S5_HotDogStand("Stand-102");
        S5_HotDogStand stand3 = new S5_HotDogStand("Stand-103");

        // Simulate sales
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();// Stand-101 sells 7 hot dogs

        stand2.justSold();
        stand2.justSold(); // Stand-102 sells 2 hot dogs

        stand3.justSold();
        stand3.justSold();
        stand3.justSold();
        stand3.justSold(); // Stand-103 sells 4 hot dogs

        // Display total hot dogs sold for each stand
        System.out.println("Daily Sales Report:");
        stand1.displaySales();
        stand2.displaySales();
        stand3.displaySales();
    }
}
