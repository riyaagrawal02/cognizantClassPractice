import model.*;
import service.FoodDeliveryService;

public class Main {
    public static void main(String[] args) {

        FoodDeliveryService service = new FoodDeliveryService();
        Customer customer = new Customer(
                101,
                "Riya Agrawal",
                "9876543210",
                "Delhi",
                "riya@gmail.com"
        );
        DeliveryPartner partner = new DeliveryPartner(
                201,
                "Amit Kumar",
                "9876501234",
                "Delhi",
                "DL01AB1234",
                4.8
        );

        customer.displayDetails();
        partner.displayDetails();

        FoodItem pizza = new FoodItem(1, "Veg Pizza", 299);
        FoodItem burger = new FoodItem(2, "Cheese Burger", 149);
        FoodItem coke = new FoodItem(3, "Coca Cola", 60);

        service.addFoodItem(pizza);
        service.addFoodItem(burger);
        service.addFoodItem(coke);

        service.displayMenu();

        Order order = new Order(5001, customer);

        order.addFoodItem(pizza);
        order.addFoodItem(coke);

        service.placeOrder(order);

        service.assignDeliveryPartner(partner);
        Payment payment = new UpiPayment(
                "PAY101",
                "riya@oksbi"
        );
        service.processPayment(payment, order);

        System.out.println("\nOrder Delivered Successfully.");
    }
}