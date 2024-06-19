package com.scm;

public class MobileDisplay implements Observer{
    WeatherStation weatherStation;
    MobileDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Temperature "+temperature+"Humidity "+humidity+" Pressure"+pressure);
    }
}
