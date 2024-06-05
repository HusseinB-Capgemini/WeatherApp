package com.example.weatherApp.Model;

public class weather {
    private String city;
    private double temp;

    public weather(String city, double temp) {
        this.city = city;
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
