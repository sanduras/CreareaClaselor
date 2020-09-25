package com.company;

public class Drona {
    private String controler;
    private int raza_actiune;
    private int rezolutie_cam;
    private int capacitate;

    public Drona (String controler, int raza_actiune, int rezolutie_cam, int capacitate) {
        this.controler = controler;
        this.raza_actiune = raza_actiune;
        this.rezolutie_cam = rezolutie_cam;
        this.capacitate = capacitate;
    }

    public void setRaza_actiune(int raza_actiune) {
        this.raza_actiune = raza_actiune;
    }

    public void setRezolutie_cam(int rezolutie_cam) {
        this.rezolutie_cam = rezolutie_cam;
    }

    public String print() {
        return ("Tipul controler :" + controler + "\n" +
                "Raza de actiune :" + raza_actiune + "\n" +
                "Rezolutia camerei :" + rezolutie_cam + "\n" +
                "Capacitatea :" + capacitate );

    }

}
