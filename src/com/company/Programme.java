package com.company;

public class Programme extends Frequence {
    private int numero;
    public Programme(int numero,float valeur,String type){
        super (valeur,type);
        this.numero=numero;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }

}
