package com.hackbulgaria.task2.servicenotavailable;

public class RunService {

    public void execute() {

        Service service = new Service();
        try {
            service.useService();

        } catch (ServiceNotAvailableAtTheMoment e) {
            e.printStackTrace();
        } finally {
            System.out.println("in finally block: do something");
        }

    }
}
