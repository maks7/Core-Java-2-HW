package com.hackbulgaria.task2.servicenotavailable;

public class Service {

    public void useService() throws ServiceNotAvailableAtTheMoment {
        
        System.out.println("In body: useService method");
        
        int exception = 1;
        if(exception == 1) {
            throw new ServiceNotAvailableAtTheMoment("Service is not available. Network connection go down");
        } else if (exception == 2) {
            throw new ServiceNotAvailableAtTheMoment("Service is not available. Cannot access remote resourse A");
        } else if (exception == 3) {
            throw new ServiceNotAvailableAtTheMoment("Service is not available at the moment. The session is timed out.");
        }
        
    }
}
