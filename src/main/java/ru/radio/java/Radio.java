package ru.radio.java;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationNumber;

    public Radio() {

    }

    public Radio(int stationNumber) {
        this.stationNumber = stationNumber;
    }


    public int getCurrentStation() {  // геттер

        return currentStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    } // геттер

    public void setCurrentStation(int currentStation) {  // сеттер установки станции вручную
        if (currentStation < 0) {
            return;
        }
        if (currentStation > stationNumber - 1) {
            return;

        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    } // сеттер установки звука вручную (1)

    public void nextStation() { //следующая станция
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() { //предыдущая станция
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }


    public void increaseVolume() { //увеличение звука (2)

        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() { //уменьшение звука (3)

        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

}

