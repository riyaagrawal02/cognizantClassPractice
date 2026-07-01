package model;
import java.util.ArrayList;

public class Order {

    private int orderId;
    private Customer customer;
    private ArrayList<FoodItem> foodItems;
    private double totalAmount;
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.foodItems = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addFoodItem(FoodItem item) {
        foodItems.add(item);
        totalAmount += item.getPrice();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<FoodItem> getFoodItems() {
        return foodItems;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void displayOrder() {

        System.out.println("\n========= ORDER DETAILS =========");
        System.out.println("Order ID : " + orderId);
        System.out.println("Customer : " + customer.getName());

        System.out.println("\nOrdered Items:");

        for (FoodItem item : foodItems) {
            System.out.println("- " + item.getItemName() +
                    " (₹" + item.getPrice() + ")");
        }

        System.out.println("--------------------------------");
        System.out.println("Total Bill : ₹" + totalAmount);
    }
}