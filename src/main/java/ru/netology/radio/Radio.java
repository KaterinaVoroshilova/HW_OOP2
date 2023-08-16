package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int quantityRadioStation = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = quantityRadioStation - 1;
    private int currentRadioStation = minRadioStation;

    public void next() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public Radio() {

    }

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
        this.maxRadioStation = quantityRadioStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}
