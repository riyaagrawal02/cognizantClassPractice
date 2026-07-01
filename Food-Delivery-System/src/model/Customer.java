package model;

public class Customer extends User {
    private String email;
    public Customer(int userId, String name, String phoneNumber, String address, String email) {
        super(userId, name, phoneNumber, address);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void displayDetails() {

        System.out.println("===== Customer Details =====");
        System.out.println("Customer ID : " + getUserId());
        System.out.println("Name        : " + getName());
        System.out.println("Phone       : " + getPhoneNumber());
        System.out.println("Address     : " + getAddress());
        System.out.println("Email       : " + email);
        System.out.println();
    }
}