package model;

public class Librarian extends Person {

    private String employeeId;
    private String shift;

    public Librarian(int id, String name, String employeeId, String shift) {
        super(id, name);
        this.employeeId = employeeId;
        this.shift = shift;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getShift() {
        return shift;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public void displayDetails() {
        System.out.println("===== Librarian Details =====");
        System.out.println("ID          : " + getId());
        System.out.println("Name        : " + getName());
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Shift       : " + shift);
    }
}