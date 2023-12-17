package org.example;

public abstract class Person {
    private String firstname;
    private String lastname;
    private int id;
    private Address address;

    //constructor
    public Person(String firstname, String lastname, int id, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.address = address;
    }

    //getters
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    //methods
    public abstract void goToWork();

    //setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
