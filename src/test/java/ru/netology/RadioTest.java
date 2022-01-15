package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        int expected = 1;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

        radio.increaseVolume();
        actual = radio.getCurrentVolume();
        assertEquals(2, actual);

        radio.increaseVolume();

        radio.increaseVolume();

        radio.increaseVolume();

        radio.increaseVolume();

        radio.increaseVolume();

        radio.increaseVolume();

        radio.increaseVolume();

        radio.increaseVolume();
        actual = radio.getCurrentVolume();
        assertEquals(10, actual);

        radio.increaseVolume();
        actual = radio.getCurrentVolume();
        assertEquals(10, actual);
    }


    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(0, actual);

        radio.increaseVolume();
        radio.increaseVolume();
        radio.decreaseVolume();
        actual = radio.getCurrentVolume();
        assertEquals(1, actual);
    }

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(1, actual);

        radio.setCurrentStation(8);
        radio.nextStation();
        actual = radio.getCurrentStation();
        assertEquals(9, actual);

        radio.setCurrentStation(9);
        radio.nextStation();
        actual = radio.getCurrentStation();
        assertEquals(0, actual);

    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(9, actual);

        radio.prevStation();
        actual = radio.getCurrentStation();
        assertEquals(8, actual);

        radio.setCurrentStation(1);
        radio.prevStation();
        actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }

    @Test
    void setStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        assertEquals(5, actual);

        radio.setCurrentStation(15);
        actual = radio.getCurrentStation();
        assertEquals(5, actual);

        radio.setCurrentStation(-1);
        actual = radio.getCurrentStation();
        assertEquals(5, actual);

    }

}
