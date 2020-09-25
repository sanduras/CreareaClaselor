package com.company;

public class Carte {

    String autor;
    String titlu;
    int nrPagini;

    Carte(String autor, String titlu, int nrPagini){
        this.autor = autor;
        this.titlu = titlu;
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return "Carte{}";
    }
}
