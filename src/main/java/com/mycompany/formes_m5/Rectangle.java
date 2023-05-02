package com.mycompany.formes_m5;

public class Rectangle {

    private double longitud;
    private double amplada;

    public Rectangle(double longitud, double amplada) {
        this.longitud = longitud;
        this.amplada = amplada;
    }

    public double getArea() {
        return longitud * amplada;
    }
  
}
