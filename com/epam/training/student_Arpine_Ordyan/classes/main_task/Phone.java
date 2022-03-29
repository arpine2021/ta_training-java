package com.epam.training.student_Arpine_Ordyan.classes.main_task;

public class Phone {
    public static int subscriberId=1;
    public int id;
    private String lastName;
    private String name;
    private String middleName;
    private String address;
    private long numberOfCreditCard;
    private double debit;
    private double credit;
    private int timeOfUrbanCall;
    private int timeOfIntercityCall;

    public Phone(String lastName, String name, String middleName, String address, long numberOfCreditCard, double debit,
                 double credit, int timeOfUrbanCall, int timeOfIntercityCall) {
        id=subscriberId++;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.numberOfCreditCard = numberOfCreditCard;
        this.debit = debit;
        this.credit = credit;
        this.timeOfUrbanCall = timeOfUrbanCall;
        this.timeOfIntercityCall = timeOfIntercityCall;
    }

        public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public long getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public double getDebit() {
        return debit;
    }

    public double getCredit() {
        return credit;
    }

    public int getTimeOfUrbanCall() {
        return timeOfUrbanCall;
    }

    public int getTimeOfIntercityCall() {
        return timeOfIntercityCall;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", numberOfCreditCard=" + numberOfCreditCard +
                ", debit=" + debit +
                ", credit=" + credit +
                ", timeOfUrbanCall=" + timeOfUrbanCall +
                ", timeOfIntercityCall=" + timeOfIntercityCall +
                '}';
    }

}
