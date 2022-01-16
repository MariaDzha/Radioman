package ru.netology;

public class Radio {
    private int currentVolume = 0;
    private int currentStation = 0;
    private int stationCount;
    private int maxStation;


    public Radio(int stationCount) {
        this.stationCount = stationCount;
        this.maxStation = stationCount - 1;
    }

    public Radio() {
        stationCount = 10;
        maxStation = 9;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        }
        currentVolume = currentVolume + 1;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

        if (currentVolume == 0) {
            return;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (0 <= currentStation && currentStation <= maxStation) {
            this.currentStation = currentStation;
        }
    }
}
