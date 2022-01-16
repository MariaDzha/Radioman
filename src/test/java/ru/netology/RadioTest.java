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
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(1, actual);

        radio.increaseVolume();
        actual = radio.getCurrentVolume();
        assertEquals(2, actual);

        for (int i = 0; i < 98; i++) {
            radio.increaseVolume();
        }
        actual = radio.getCurrentVolume();
        assertEquals(100, actual);

        radio.increaseVolume();
        actual = radio.getCurrentVolume();
        assertEquals(100, actual);
    }


    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
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
    void nextStationWithParam() {
        int stationCount = 20;
        Radio radio = new Radio(stationCount);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(1, actual);

        radio.setCurrentStation(stationCount - 1);
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
    }

    @Test
    void prevStationWithParam() {
        int stationCount = 20;
        Radio radio = new Radio(stationCount);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(stationCount - 1, actual);
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
