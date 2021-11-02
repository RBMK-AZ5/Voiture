package com.company;
import java.util.List;

public class Radio {
    Frequence frequenceCourante;
    List<Programme> listePreProgramme;
public Radio(){
    //if(uneRadio=! null)
    System.out.println("radio activer");
}
    public Frequence getFrequenceCourante(){
        return frequenceCourante;
    }
    public void setFrequenceCourante(Frequence frequenceCourante){
         this.frequenceCourante=frequenceCourante;
    }
    public List<Programme> getListePreProgramme(){
        return listePreProgramme;
    }
    public void setListePreProgramme(List<Programme>listePreProgramme){
         this.listePreProgramme=listePreProgramme;
    }
    public void emmetreSon(){
        System.out.println("ezakekaleklazkelza");

    }
    public void afficherFrequence(){
        System.out.println(""+frequenceCourante);
    }
    public void avancerFrequence(float pas){
        float actuel=frequenceCourante.getValeur();
        frequenceCourante.setValeur(actuel+pas);
    }
    public  void reculerFrequence(float pas){
        float actuel=frequenceCourante.getValeur();
        frequenceCourante.setValeur(actuel-pas);
    }
    public void changerType(String type){
        frequenceCourante.setType(type);
    }
    public void changerProgramme(int num){
        Programme programme=listePreProgramme.get(num);
        frequenceCourante=new Frequence(programme.getValeur(),programme.getType());

    }
    public void enregisterProgramme(int num){
        listePreProgramme.remove(num);
        Programme programme=new Programme(num,frequenceCourante.getValeur(),frequenceCourante.getType());
        listePreProgramme.add(num,programme);

    }

}
