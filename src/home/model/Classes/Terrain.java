package home.model.Classes;

import home.model.Interfaces.Transaction;
import home.model.Enums.*;

/**
 * Terrain
 */
public class Terrain extends Bien {

    private StatusJuridique status;
    private int nbFacades;

    public Terrain() {
        super();
    }

    public Terrain(String adresse, Wilayas wilaya, double superficie, Proprietaire proprietaire,
            Transaction Transaction, double prix, boolean negociable, String descriptif, String date, String photos,
            Wilayas wilayaEch, StatusJuridique status, int nbFacades) {
        super(adresse, wilaya, superficie, proprietaire, Transaction, prix, negociable, descriptif, date, photos,
                wilayaEch);
        this.status = status;
        this.nbFacades = nbFacades;
        this.titre = new String("Terrain de " + superficie + " mètres avec " + nbFacades + " façades.");
    }

    public StatusJuridique getStatus() {
        return this.status;
    }

    public void setStatus(StatusJuridique status) {
        this.status = status;
    }

    public int getNbFacades() {
        return this.nbFacades;
    }

    public void setNbFacades(int nbFacades) {
        this.nbFacades = nbFacades;
    }

}