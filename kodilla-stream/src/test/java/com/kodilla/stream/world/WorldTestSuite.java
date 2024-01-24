package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent();
        Continent asia = new Continent();

        europe.addCountry(new Country(new BigDecimal("38000000"))); // PL
        europe.addCountry(new Country(new BigDecimal("83000000"))); // DE
        asia.addCountry(new Country(new BigDecimal("143000000"))); // RU

        world.addContinent(europe);
        world.addContinent(asia);

        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("264000000");
        assertEquals(expectedPopulation, totalPopulation);
    }
}
