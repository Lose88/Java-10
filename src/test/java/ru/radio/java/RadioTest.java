package ru.radio.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void setToNextStation() {  //следующая станция (2)
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 6;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setToNextStationAboveMax() {  //следующая станция больше максимальной
        Radio radio = new Radio();
        radio.currentStation = 10;
        int expected = 0;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setToNextStationIfStationBelowZero() {  //следующая станция меньше минимальной
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setToPrevStation() { //предыдущая станция (3)
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 8;
        int actual = radio.prevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setToPrevStationBelowMin() { //предыдущая станция меньше минимальной
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 9;
        int actual = radio.prevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setToPrevStationIfStationAboveMax() { //предыдущая станция больше максимальной
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualSetStation() {  //установка станции вручную(4)
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualSetStationBelowMin() {  //установка станции вручную меньше минимальной
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualSetStationAboveMax() {  //установка станции вручную больше максимальной
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualSetVolume() {  //установка звука вручную(1)
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        int expected = 7;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualSetVolumeBelowMin() {  //установка звука меньше минимального
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualSetVolumeAboveMax() {  //установка звука больше максимального
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSound() {  //увеличение звука (2)
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        int expected = 8;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundAboveMax() {  //увеличение звука больше максимального
        Radio radio = new Radio();
        radio.currentVolume = 11;
        int expected = 10;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundIfSoundBelowZero() {  //увеличение звука меньше минимального
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 1;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSound() {  //уменьшение звука (3)
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        int expected = 5;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundIfSoundZero() {  //уменьшение звука меньше минимального
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundIfSoundAboveMax() {  //уменьшение звука если звук больше максимального
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundIfSoundBelowMin() {  //уменьшение звука если звук меньше минимального
        Radio radio = new Radio();
        radio.currentVolume = -1;
        int expected = 0;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundIfSoundMax() {  //уменьшение звука если звук максимальный
        Radio radio = new Radio();
        radio.currentVolume = (10);
        int expected = 9;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
}