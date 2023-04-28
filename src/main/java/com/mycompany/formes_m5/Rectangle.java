package com.mycompany.formes_m5;

public class Rectangle {
    private double longitud;
    private double amplada;

    public Rectangle(double longitud, double amplada) {
        this.longitud = longitud;
        this.amplada = amplada;
    }
    
    /*
    Responsable = Joan
    public double getArea() {
    }

    Responsable = Edgar
    public double getPerimeter() {
    }
    */
    
    public boolean esQuadrat() {
        return this.longitud == this.amplada;
    }
    
}

