package com.scm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        WeatherStation weatherStation = new WeatherStation();
        Observer phoneDisplayObserver = new PhoneDisplayObserver(weatherStation);
        Observer mobileDisplayOberver = new MobileDisplay(weatherStation);
        weatherStation.registerObserver(mobileDisplayOberver);
        weatherStation.updateWeather(10.0,20.0,30.0);
    }
}