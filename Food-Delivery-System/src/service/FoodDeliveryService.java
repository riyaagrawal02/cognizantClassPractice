package service;
import java.util.ArrayList;
import model.*;

public class FoodDeliveryService {
    private ArrayList<FoodItem> menu;
    public FoodDeliveryService() {
        menu = new ArrayList<>();
    }

    public void addFoodItem(FoodItem item) {
        menu.add(item);
        System.out.println(item.getItemName() + " added to menu.");
    }

    public void displayMenu() {

        System.out.println("\n========== FOOD MENU ==========");

        if (menu.isEmpty()) {
            System.out.println("Menu is empty.");
            return;
        }

        for (FoodItem item : menu) {
            item.displayItem();
        }
    }


    public void placeOrder(Order order) {

        System.out.println("\nOrder placed successfully.");
        order.displayOrder();
    }

    public void assignDeliveryPartner(DeliveryPartner partner) {

        System.out.println("\n===== DELIVERY PARTNER =====");
        System.out.println("Assigned To : " + partner.getName());
        System.out.println("Vehicle No. : " + partner.getVehicleNumber());
        System.out.println("Rating      : " + partner.getRating());
    }

    public void processPayment(Payment payment, Order order) {

        payment.makePayment(order.getTotalAmount());
    }
}