package model;

public class Student extends Person {

    private String course;
    private int year;

    public Student(int id, String name, String course, int year) {
        super(id, name);   
        this.course = course;
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }


    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public void displayDetails() {
        System.out.println("===== Student Details =====");
        System.out.println("ID      : " + getId());
        System.out.println("Name    : " + getName());
        System.out.println("Course  : " + course);
        System.out.println("Year    : " + year);
    }
}