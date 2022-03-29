package com.epam.training.student_Arpine_Ordyan.classes.main_task;


public class Customer {
    private int id=1;
    private static int castomerId;
    private String name;
    private String lastName;
    private String middleName;
    private String address;
    private long ceditCardNumber;
    private String bancAccauntNumber;

    protected Customer(String name, String lastName, String middleName,
             String address, long ceditCardNumber, String bancAccauntNumber) {
        this.id = castomerId++;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.address = address;
        this.ceditCardNumber = ceditCardNumber;
        this.bancAccauntNumber = bancAccauntNumber;
    }

    public int getCastomerId() {
        return castomerId;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public long getCeditCardNumber() {
        return ceditCardNumber;
    }

    public String getBancAccauntNumber() {
        return bancAccauntNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", ceditCardNumber=" + ceditCardNumber +
                ", bancAccauntNumber=" + bancAccauntNumber +
                '}';
    }

}




