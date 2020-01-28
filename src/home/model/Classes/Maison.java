package home.model.Classes;

import home.model.Enums.*;
import home.model.Interfaces.Transaction;

/**
 * Maison
 */
public class Maison extends BienHabitable {

    private int nbEtages;
    private boolean garage;
    private boolean piscine;
    private boolean jardin;
    private double surfaceHabitable;

    public Maison() {
        super();
    }

    public Maison(String adresse, Wilayas wilaya, double superficie, Proprietaire proprietaire, Transaction Transaction,
            double prix, boolean negociable, String descriptif, String date, String photos, Wilayas wilayaEch,
            int pieces, boolean meuble, int nbEtages, boolean garage, boolean piscine, boolean jardin,
            double surfaceHabitable) {

        super(adresse, wilaya, superficie, proprietaire, Transaction, prix, negociable, descriptif, date, photos,
                wilayaEch, pieces, meuble);

        this.nbEtages = nbEtages;
        this.garage = garage;
        this.piscine = piscine;
        this.jardin = jardin;
        this.surfaceHabitable = surfaceHabitable;
        this.titre = new String("Maison à " + pieces + " pièces avec " + nbEtages + " etages.");
    }

    public int getNbEtages() {
        return this.nbEtages;
    }

    public void setNbEtages(int nbEtages) {
        this.nbEtages = nbEtages;
    }

    public boolean isGarage() {
        return this.garage;
    }

    public boolean getGarage() {
        return this.garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public boolean isPiscine() {
        return this.piscine;
    }

    public boolean getPiscine() {
        return this.piscine;
    }

    public void setPiscine(boolean piscine) {
        this.piscine = piscine;
    }

    public boolean isJardin() {
        return this.jardin;
    }

    public boolean getJardin() {
        return this.jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public double getSurfaceHabitable() {
        return this.surfaceHabitable;
    }

    public void setSurfaceHabitable(double surfaceHabitable) {
        this.surfaceHabitable = surfaceHabitable;
    }

}