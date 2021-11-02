package com.company;

public class Roue {
    String pneu;
    String jante;
    double pression;
    int taille;
    public Roue(String pneu,String jante,double pression,int taille){
        this.pneu=pneu;
        this.jante=jante;
        this.pression=pression;
        this.taille=taille;
    }

    public String getPneu(){
        return pneu;
    }
    public String setPneu( String pneu){
        return this.pneu=pneu;
    }
    public String getJante(){
        return jante;
    }
    public void setJante(String jante){
         this.jante=jante;
    }

    public double getPression() {
        return pression;
    }

    public void setPression(double pression) {
        this.pression = pression;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
    @Override
    public String toString(){
        return (" "+pneu+" "+jante+" "+pression+" "+taille);
    }
}

