package model;

public class DeliveryPartner extends User {

    private String vehicleNumber;
    private double rating;

    public DeliveryPartner(int userId, String name, String phoneNumber, String address, String vehicleNumber, double rating) {
        super(userId, name, phoneNumber, address);
        this.vehicleNumber = vehicleNumber;
        this.rating = rating;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getRating() {
        return rating;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public void displayDetails() {

        System.out.println("===== Delivery Partner Details =====");
        System.out.println("Partner ID     : " + getUserId());
        System.out.println("Name           : " + getName());
        System.out.println("Phone          : " + getPhoneNumber());
        System.out.println("Address        : " + getAddress());
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Rating         : " + rating);
        System.out.println();
    }
}