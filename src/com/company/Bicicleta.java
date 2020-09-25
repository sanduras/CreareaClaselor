package com.company;

public class Bicicleta {
    private String denumire;
    private int nr_viteze;
    private String culoare;
    private String tip_frina;

    public Bicicleta(String denumire, int nr_viteze, String culoare, String tip_frina) {
        this.denumire = denumire;
        this.nr_viteze = nr_viteze;
        this.culoare = culoare;
        this.tip_frina = tip_frina;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setNr_viteze(int nr_viteze) {
        this.nr_viteze = nr_viteze;
    }

    public String print(){
        return ("Denumire :" + this.denumire +"\n" +
                "Numarul de viteze :" + this.nr_viteze + "\n" +
                "Culoarea :" + this.culoare + "\n" +
                "Tipul frinei :" + this.tip_frina
        );

    }
}
