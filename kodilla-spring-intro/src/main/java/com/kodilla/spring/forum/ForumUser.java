package com.kodilla.spring.forum;

//Celem zadania jest stworzenie w kontenerze beana klasy ForumUser i jego sprawdzenie w teście. Aby zrealizować zadanie:
//

//Napisz klasę ForumUser w pakiecie com.kodilla.spring.forum. Klasa powinna mieć pole username typu String inicjowane w konstruktorze wartością "John Smith" (nie przekazuj tego jako parametr – wpisz to w konstruktorze "na sztywno"). Oznacz klasę jako
// .
//W katalogu src/test/java stwórz pakiet com.kodilla.spring.forum, a w nim zestaw testów ForumUserTestSuite.
//Napisz test testGetUsername() pobierający z kontekstu aplikacji uchwyt do beana klasy ForumUser. Test powinien pobierać username i sprawdzać przy pomocy asercji czy zwróconą wartością jest "John Smith".
//Gotowy kod prześlij do repozytorium.

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private final String username;

    public String getUsername() {
        return username;
    }

    public ForumUser(  ) {
        this.username = "John Smith";

    }
}
