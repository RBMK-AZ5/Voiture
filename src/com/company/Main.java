package com.company;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class Main {
    private static String carFileName = "cars.txt";

    public static void verifFileCar() {
        try {
            File myObj = new File(carFileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
                FileWriter myWriter = new FileWriter(carFileName);
                myWriter.write("");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static String generateCar(int n) {
        String result = "";
        Random rdm = new Random();

        for (int i = 0; i < n; i++) {
            result = result + new Auto(rdm.nextInt(4), rdm.nextInt(5), rdm.nextInt(4), rdm.nextInt(5), new ArrayList<>()) + "\n";
        }

        return result.substring(0, result.length() - 1);
    }

    public static void writeFileCar(String s) {
        try {
            FileWriter myWriter = new FileWriter(carFileName, true);

            myWriter.write(s + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        verifFileCar();
        long startTime = System.currentTimeMillis();

        writeFileCar(generateCar(10));

        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);
        /* String[] type = {"sport", "familiale", "classique", "4*4"};
        String[] couleur = {"bleu", "rouge", "vert", "noir", "jaune"};
        int nbr;
        int portes;
        int vitesse;
        Random tp = new Random();
        nbr = tp.nextInt(4);
        String valeur = type[nbr];
        Random tp1 = new Random();
        int nbr1;
        nbr1 = tp.nextInt(5);
        String valeur1 = couleur[nbr1];
        Random tp2 = new Random();
        boolean avoirAutoRadio = tp2.nextBoolean();
        if (avoirAutoRadio == true) {
            if (valeur == "sport") {
                vitesse = 6;
                portes = 3;
                Radio uneRadio = new Radio();
                Roue modele = new Roue("Course", "alu", 2.15, 15);
                List<Roue> modeleRoue = new ArrayList<>();
                modeleRoue.add(modele);
                Auto v1 = new Auto(valeur1, portes, valeur, vitesse, uneRadio, modeleRoue);
                System.out.println(" " + v1);
            } else if (valeur == "familiale") {
                portes = 5;
                vitesse = 5;
                Radio uneRadio;
                Roue modele = new Roue("Course", "alu", 2.15, 15);
                List<Roue> modeleRoue = new ArrayList<>();
                modeleRoue.add(modele);
                Auto v1 = new Auto(valeur1, portes, valeur, vitesse, uneRadio = new Radio(), modeleRoue);
                System.out.println(" " + v1);
            } else {
                portes = 4;
                vitesse = 5;
                Radio uneRadio;
                Roue modele = new Roue("Course", "alu", 2.15, 15);
                List<Roue> modeleRoue = new ArrayList();
                modeleRoue.add(modele);
                Auto v1 = new Auto(valeur1, portes, valeur, vitesse, uneRadio = new Radio(), modeleRoue);
                System.out.println(" " + v1);

            }
        } else {
            Radio uneRadio = new Radio();
            uneRadio = null;
            if (valeur == "sport") {
                vitesse = 6;
                portes = 3;
                Roue modele = new Roue("Course", "alu", 2.15, 15);
                List<Roue> modeleRoue = new ArrayList<>();
                modeleRoue.add(modele);
                Auto v1 = new Auto(valeur1, portes, valeur, vitesse, uneRadio, modeleRoue);
                System.out.println(v1);
            } else if (valeur == "familiale") {
                portes = 5;
                vitesse = 5;
                Roue modele = new Roue("4 saison", "classique", 2.5, 14);
                List<Roue> modeleRoue = new ArrayList<>();
                modeleRoue.add(modele);
                Auto v1 = new Auto(valeur1, portes, valeur, vitesse, uneRadio, modeleRoue);
                System.out.println(" " + v1);
            } else {
                Roue modele = new Roue("4 saison", "classique", 2.5, 14);
                portes = 4;
                vitesse = 5;
                List<Roue> modeleRoue = new ArrayList<>();
                modeleRoue.add(modele);
                Auto v1 = new Auto(valeur1, portes, valeur, vitesse, uneRadio, modeleRoue);
                System.out.println(" " + v1);

            }
        }*/
    }
}


