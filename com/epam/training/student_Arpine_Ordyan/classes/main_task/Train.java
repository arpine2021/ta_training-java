package com.epam.training.student_Arpine_Ordyan.classes.main_task;

public class Train {
    private static int trainId;
    private int id;
    private String destinationPoint;
    private int trainNumber;
    private double departureTime;
    private  int numberOfCommonSeat;
    private  int numberOfCoupeSeat;
    private  int numberOfReservedSeat;
    private  int numberOfSuiteSeat;

    public Train(int id, String destinationPoint, int trainNumber, double departureTime, int numberOfCommonSeat,
                 int numberOfCoupeSeat, int numberOfReservedSeat, int numberOfSuiteSeat) {
        this.id = id;
        this.destinationPoint = destinationPoint;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.numberOfCommonSeat = numberOfCommonSeat;
        this.numberOfCoupeSeat = numberOfCoupeSeat;
        this.numberOfReservedSeat = numberOfReservedSeat;
        this.numberOfSuiteSeat = numberOfSuiteSeat;
    }


    public int getId() {
        return id;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public int getNumberOfCommonSeat() {
        return numberOfCommonSeat;
    }

    public int getNumberOfCoupeSeat() {
        return numberOfCoupeSeat;
    }

    public int getNumberOfReservedSeat() {
        return numberOfReservedSeat;
    }

    public int getNumberOfSuiteSeat() {
        return numberOfSuiteSeat;
    }
}
