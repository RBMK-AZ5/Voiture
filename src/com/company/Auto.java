package com.company;

import java.util.List;
import java.util.Objects;

public class Auto {
    public String getCouleur()
    {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Integer getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(Integer nbPortes) {
        this.nbPortes = nbPortes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNbVitesse() {
        return nbVitesse;
    }

    public void setNbVitesse(Integer nbVitesse) {
        this.nbVitesse = nbVitesse;
    }

    public Radio getAutoradio() {
        return autoradio;
    }

    public void setAutoradio(Radio autoradio) {
        this.autoradio = autoradio;
    }

    public List<Roue> getRoues() {
        return roues;
    }

    public void setRoues(List<Roue> roues) {
        this.roues = roues;
    }

    String couleur;
    int nbPortes;
    String type;
    int nbVitesse;
    Radio autoradio;
    List <Roue> roues;

    private static String[] typelist = {"sport", "familiale", "classique", "4*4"};
    private static String[] couleurlist = {"bleu", "rouge", "vert", "noir", "jaune"};
    public Auto(int couleur,int nbPortes,int type,int nbVitesse,List <Roue>roues){


        this.couleur=couleurlist[couleur];
        this.nbPortes=nbPortes;
        this.type=typelist[type];
        this.nbVitesse=nbVitesse;
        // this.autoradio=autoradio;
        this.roues=roues;
    }
    @Override
    public String toString(){
        if(autoradio==null){
            // return("Auto{ Couleur: "+couleur+" nbrPortes: "+nbPortes+" type: "+type+" nbVitesse: "+nbVitesse+" sans autoRadio: "+autoradio+" roues: "+roues);
            return("Auto{ Couleur: "+couleur+" nbrPortes: "+nbPortes+" type: "+type+" nbVitesse: "+nbVitesse+" sans autoRadio  roues: "+roues);
        }
        else {
           return ("Auto{ Couleur: " + couleur + " nbrPortes: " + nbPortes + " type: " + type + " nbVitesse: " + nbVitesse + " avec autoRadio: " + autoradio + " roues: " + roues); //retourne que l'adresse de autoradio
            //return ("Auto{ Couleur: " + couleur + " nbrPortes: " + nbPortes + " type: " + type + " nbVitesse: " + nbVitesse + " avec autoRadio " + " roues: " + roues);
        }
    }
}

