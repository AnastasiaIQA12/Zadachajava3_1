package ru.netology;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Conditioner {
    private String name;
    private int maxTemperature = 30;
    private int minTemperature = 18;
    private int currentTemperature;
    private boolean on;

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            this.currentTemperature = maxTemperature;
            return;
        }
        if (currentTemperature < minTemperature) {
            this.currentTemperature = minTemperature;
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        int currentTemperature=this.getCurrentTemperature();
        if (currentTemperature >= maxTemperature) {
            return;
        }
        this.currentTemperature++;
    }

    public void decreaseCurrentTemperature() {
        int currentTemperature=this.getCurrentTemperature();
        if (currentTemperature <= minTemperature) {
            return;
        }
        this.currentTemperature--;

    }
}



