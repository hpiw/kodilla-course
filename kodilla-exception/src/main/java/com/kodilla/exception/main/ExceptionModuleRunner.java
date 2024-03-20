package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.RouteNotFoundException;

import java.io.IOException;

public class ExceptionModuleRunner {

    public static void main(String[] args) throws IOException, RouteNotFoundException {
//        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
//        fileReader.readFile();
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlight(new Flight("Warsaw","Pekin"));

    }
}