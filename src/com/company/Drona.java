package com.company;

public class Drona {
    private String controler;
    private int razaActiune;
    private int rezolutieCamera;
    private int capacitate;


    public Drona (String controler, int razaActiune, int rezolutieCamera, int capacitate) {
        this.controler = controler;
        this.razaActiune = razaActiune;
        this.rezolutieCamera = rezolutieCamera;
        this.capacitate = capacitate;
    }

    public void setRazaActiune(int razaActiune) {
        this.razaActiune = razaActiune;
    }

    public void setRezolutie_cam(int rezolutie_cam) {
        this.rezolutieCamera = rezolutie_cam;
    }

    public String getControler(){
        return controler;
    }

    public String print() {
        return ("Tipul controler :" + controler + "\n" +
                "Raza de actiune :" + razaActiune + "\n" +
                "Rezolutia camerei :" + rezolutieCamera + "\n" +
                "Capacitatea :" + capacitate );

    }

}
