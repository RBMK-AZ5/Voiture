package com.company;

public class Frequence {
    protected float valeur;
    protected String type;
    public Frequence(float valeur,String type){
        this.valeur=valeur;
        this.type=type;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
