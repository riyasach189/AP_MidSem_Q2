package org.example;
import java.util.Objects;

public class Student extends Person{

    private double cgpa;
    private int start_year;
    private String residential_status;
    private double distance;

    //constructor
    public Student(String firstname, String lastname, int id, Address address, String residential_status, double cgpa) {
        super(firstname, lastname, id, address);
        this.residential_status = residential_status;
        this.cgpa = cgpa;
        this.distance = Math.abs(110020 - this.getAddress().getPincode());
    }

    //methods
    @Override
    public void goToWork() {
        if (Objects.equals(residential_status, "onCampus"))
        {
            System.out.println("Go to work by walk.");
        }

        else
        {
            System.out.println("Go to work by vehicle.");
        }
    }

    @Override
    public String toString() {
        return (getFirstname() + " " + getLastname());
    }

    //getters
    public double getCgpa() {
        return cgpa;
    }

    public int getStart_year() {
        return start_year;
    }

    public String getResidential_status() {
        return residential_status;
    }

    public double getDistance() {
        return distance;
    }

    //setters
    public void setResidential_status(String residential_status) {
        this.residential_status = residential_status;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setStart_year(int start_year) {
        this.start_year = start_year;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
