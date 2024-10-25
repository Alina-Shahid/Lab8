package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;

    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);


    }
    @BeforeEach
    public void setup() {
        list = MockCityList();
    }

    /**
     * Test for hasCity functionality
     */
    @Test
    public void testHasCity() {
        City city = new City("Vancouver", "BC");
        list.addCity(city);

        // Assert the city exists
        assertTrue(list.hasCity(city));

        // Assert a city not in the list returns false
        City anotherCity = new City("Toronto", "ON");
        assertFalse(list.hasCity(anotherCity));
    }


}
