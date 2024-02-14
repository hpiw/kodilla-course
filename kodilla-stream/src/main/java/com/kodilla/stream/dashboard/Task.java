package com.kodilla.stream.dashboard;

import java.time.LocalDate;

/*

7. Stream, czyli funkcyjna iteracja po kolekcjach (Moduł)
7.6. Wykorzystanie Stream na różnych kolekcjach
Zadanie: średnia liczba dni realizacji zadania
Celem zadania jest obliczenie średniej liczby dni, jaka upłynęła od zlecenia
wykonania zadania do dnia bieżącego. Uwzględniamy te zadania, które są aktualnie w trakcie realizacji.
 W tej sytuacji możemy użyć dwóch strumieni – jednego, aby obliczyć sumę, a drugiego, by obliczyć liczbę elementów.
  W wersji trudniejszej trzeba wykorzystać kolektor skalarny average().

Aby zrealizować zadanie:

Stwórz nowy przypadek testowy testAddTaskListAverageWorkingOnTask().
Utwórz wymagane zmienne pomocnicze, a następnie uruchom strumień na kolekcji getTaskLists klasy Board.
Napisz sekwencję funkcji obliczającą średni czas wykonywania zadania z listy "In Progress".
Napisz asercje sprawdzające otrzymany wynik.
Prześlij kod do repozytorium GitHub.
Link do repozytorium wklej poniżej i wyślij do Mentora.
 */
public class Task {
    private final String title;
    private final String description;
    private final User assignedUser;
    private final User creator;
    private final LocalDate created;
    private final LocalDate deadline;

    public Task(final String title, final String description,
                final User assignedUser, final User creator,
                final LocalDate created, final LocalDate deadline) {
        this.title = title;
        this.description = description;
        this.assignedUser = assignedUser;
        this.creator = creator;
        this.created = created;
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public User getCreator() {
        return creator;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assignedUser=" + assignedUser +
                ", creator=" + creator +
                ", created=" + created +
                ", deadline=" + deadline +
                '}' + "\n";
    }

}
