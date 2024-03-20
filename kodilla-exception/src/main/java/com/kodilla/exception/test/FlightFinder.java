package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

/*Zadanie sprawdzi całą Twoją wiedzę o wyjątkach! Zaczynamy!

Wszystkie klasy twórz wewnątrz pakietucom.kodilla.exception.test:

Stwórz swój własny Exception o nazwie RouteNotFoundException.
Stwórz klasę Flight zawierającą konstruktor, pole: String departureAirport, String arrivalAirport i gettery.
Stwórz klasę zawierającą logikę imitującą wyszukiwanie lotów:
metoda findFilght(Flight flight),
wewnątrz metody zaimplementuj mapę typu HashMap, której kluczem będzie String przechowujący nazwę lotniska, a wartością Boolean informujący o tym, czy można na dane lotnisko polecieć. Przykład: Map<String, Boolean>.
logika powinna wyszukiwać loty w mapie. Jeżeli dane lotnisko nie będzie istnieć w mapie, należy rzucić wyjątkiem RouteNotFoundException.
Program uruchom wewnątrz metody main, a następnie obsłuż możliwe pojawienie się wyjątku.
 */
public class FlightFinder {
   public boolean findFlight (Flight flight) throws RouteNotFoundException {
      Map<String,Boolean> flights = new HashMap<>();
      flights.put("Moscow",false);
      flights.put("Berlin",true);
      Boolean isAvailable = flights.get(flight.getArrivalAirport());
      if (isAvailable==null){
         throw new RouteNotFoundException("Airport not found"+ flight.getArrivalAirport());
      }
      return isAvailable;
   }


}
