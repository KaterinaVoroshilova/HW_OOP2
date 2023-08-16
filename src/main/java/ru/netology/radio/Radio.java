package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Radio {

    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
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


    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
        this.maxRadioStation = quantityRadioStation - 1;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

}
