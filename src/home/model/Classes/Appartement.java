package home.model.Classes;

import home.model.Enums.Plex;
import home.model.Interfaces.Transaction;
import home.model.Enums.*;

/**
 * Appartement
 */
public class Appartement extends BienHabitable {

    private int etage;
    private Plex plex;
    private boolean ascenseur;

    public Appartement() {
        super();
    }

    public Appartement(String adresse, Wilayas wilaya, double superficie, Proprietaire proprietaire,
            Transaction Transaction, double prix, boolean negociable, String descriptif, String date, String photos,
            Wilayas wilayaEch, int pieces, boolean meuble, int etage, Plex plex, boolean ascenseur) {

        super(adresse, wilaya, superficie, proprietaire, Transaction, prix, negociable, descriptif, date, photos,
                wilayaEch, pieces, meuble);

        this.etage = etage;
        this.plex = plex;
        this.ascenseur = ascenseur;
        this.titre = new String("Appartement au " + etage + "' étage constitué de " + pieces + " pièces.");
    }

    public int getEtage() {
        return this.etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public Plex getPlex() {
        return this.plex;
    }

    public void setPlex(Plex plex) {
        this.plex = plex;
    }

    public boolean isAscenseur() {
        return this.ascenseur;
    }

    public boolean getAscenseur() {
        return this.ascenseur;
    }

    public void setAscenseur(boolean ascenseur) {
        this.ascenseur = ascenseur;
    }

}