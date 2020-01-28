package home.model.Classes;

import home.model.Enums.Wilayas;
import home.model.Interfaces.Transaction;

/**
 * Recherche
 */
public class Recherche {

    public Wilayas wilaya;
    public Transaction transaction;
    public String type;
    public double prixmin;
    public double prixmax;

    public Recherche() {
    }

    public Recherche(Wilayas wilaya, Transaction transaction, String type, double prixmin, double prixmax) {
        this.wilaya = wilaya;
        this.transaction = transaction;
        this.type = type;
        this.prixmin = prixmin;
        this.prixmax = prixmax;
    }
}
