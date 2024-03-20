package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) throws RouteNotFoundException {
//        SecondChallenge secondChallenge = new SecondChallenge();
//
//        try {
//            String result = secondChallenge.probablyIWillThrowException(1.5, 2);
//            System.out.println(result);
//        } catch (Exception e) {
//            System.out.println("Exception found: " + e.getMessage());
//        } finally {
//            System.out.println("That's all folks!");
//        }
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlight(new Flight("Warsaw","Pekin"));
 }
}
