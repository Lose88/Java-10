package ru.radio.java;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {  // геттер

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {  // сеттер установки станции вручную
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation(int nextStation) { //следующая станция
        currentStation = nextStation;

        if (currentStation >= 0 && currentStation <= 9) {
            nextStation = currentStation + 1;
        }
        if (nextStation > 9) {
            nextStation = 0;
        }
        currentStation = nextStation;
    }

    public void prevStation(int prevStation) { //предыдущая станция
        currentStation = prevStation;
        if (currentStation > 0 && currentStation <= 9) {
            prevStation = currentStation - 1;
        }
        if (prevStation == 0) {
            prevStation = 9;
        }
        currentStation = prevStation;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    } // геттер

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    } // сеттер установки звука вручную (1)


    public void increaseVolume(int increaseVolume) { //увеличение звука (2)
        currentVolume = increaseVolume;

        if (currentVolume >= 0 && currentVolume <= 10) {
            increaseVolume = currentVolume + 1;
        }
        if (increaseVolume > 10) {
            increaseVolume = 10;
        }
        currentVolume = increaseVolume;
    }

    public void decreaseVolume(int decreaseVolume) { //уменьшение звука (3)
        currentVolume = decreaseVolume;

        if (currentVolume >= 0 && currentVolume <= 10) {
            decreaseVolume = currentVolume - 1;
        }
        if (decreaseVolume < 0) {
            decreaseVolume = 0;
        }
        currentVolume = decreaseVolume;
    }

}

