package ru.netology;

public class Radio {
    private int currentVolume = 0;
    private int currentStation = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 10) {
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
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (0 <= currentStation && currentStation <= 9) {
            this.currentStation = currentStation;
        }
    }
}
