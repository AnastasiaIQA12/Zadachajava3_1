package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    public void shouldGetAndSet() {
        String expected = "Кондишн";
        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void shouldIncreaseTemperatureOnOneDegree() {
        int currentTemperature = 27;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(28, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseTemperatureOnOneDegree1() {
        int currentTemperature = 31;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseTemperatureOnOneDegree() {
        int currentTemperature = 21;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseTemperatureOnOneDegree1() {
        int currentTemperature = 17;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(18, conditioner.getCurrentTemperature());
    }
}