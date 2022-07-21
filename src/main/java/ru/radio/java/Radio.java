package ru.radio.java;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {  // геттер

        return currentStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    } // геттер

    public void setCurrentStation(int newCurrentStation) {  // сеттер установки станции вручную
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    } // сеттер установки звука вручную (1)

    public int nextStation() { //следующая станция

        if (currentStation >= 0 && currentStation <= 9) {
            return currentStation + 1;
        }
        if (currentStation > 9) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int prevStation() { //предыдущая станция

        if (currentStation > 0 && currentStation <= 9) {
            return currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
        return currentStation;
    }

    public int increaseVolume() { //увеличение звука (2)

        if (currentVolume >= 0 && currentVolume <= 10) {
            return currentVolume + 1;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        return currentVolume;
    }

    public int decreaseVolume() { //уменьшение звука (3)


        if (currentVolume > 0 && currentVolume <= 10) {
            return currentVolume - 1;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        return currentVolume;
    }

}

