package com.hackbulgaria.exception;

import org.junit.Test;

import com.hackbulgaria.task2.servicenotavailable.RunService;

public class ServiceNotAvailableTest {

    @Test
    public void test() {

        RunService runService = new RunService();

        runService.execute();

    }

}
