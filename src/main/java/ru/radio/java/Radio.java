package ru.radio.java;

public class Radio {
    private int currentStation;
    private int currentVolume;

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
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
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

        if (currentVolume < 10) {
            currentVolume++;
        }
        else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() { //уменьшение звука (3)


        if (currentVolume > 0) {
            currentVolume--;
        }
        else{
            currentVolume =0;
        }
    }

}

