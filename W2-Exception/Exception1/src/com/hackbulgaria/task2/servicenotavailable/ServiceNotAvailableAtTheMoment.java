package com.hackbulgaria.task2.servicenotavailable;

public class ServiceNotAvailableAtTheMoment extends Exception {

    ServiceNotAvailableAtTheMoment() {
        super();
    }

    ServiceNotAvailableAtTheMoment(String message) {
        super(message);
    }
}
