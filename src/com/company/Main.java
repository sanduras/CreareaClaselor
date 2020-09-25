package com.company;

public class Main {

    public static void main(String[] args) {

        Carte carte1 = new Carte("Ion Cranga","Amintiri din colpilarie",120);


        Bicicleta aist = new Bicicleta("aist",4,"verde","disc");

        aist.setCuloare("Galben");
        aist.setNr_viteze(6);

        System.out.println(aist.print());

        System.out.println("-----------------");

        Drona dji = new Drona("dji",80 ,24,3880) ;

        dji.setRazaActiune(90);
        dji.setRezolutie_cam(26);

        System.out.println(dji.print());
        System.out.println(dji.getControler());
    }
}
