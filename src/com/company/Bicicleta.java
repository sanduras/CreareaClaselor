package com.company;

public class Bicicleta {
    private String denumire;
    private int nrViteze;
    private String culoare;
    private String tipFrina;

    public Bicicleta(String denumire, int nrViteze, String culoare, String tipFrina) {
        this.denumire = denumire;
        this.nrViteze = nrViteze;
        this.culoare = culoare;
        this.tipFrina = tipFrina;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setNr_viteze(int nrViteze) {
        this.nrViteze = nrViteze;
    }

    public String print(){
        return ("Denumire :" + this.denumire +"\n" +
                "Numarul de viteze :" + this.nrViteze + "\n" +
                "Culoarea :" + this.culoare + "\n" +
                "Tipul frinei :" + this.tipFrina
        );

    }
}
