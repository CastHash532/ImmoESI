package home.model.Classes.Transactions;

import home.model.Classes.Bien;
import home.model.Interfaces.Transaction;

/**
 * Echange
 */
public class Echange implements Transaction {

    public Echange() {
        super();
    }

    @Override
    public double CalculerPrix(Bien b) {
        double prix = 0;
        if (b.getWilaya() == b.getWilayaEch()) { // Si la wilaya d'échange est la même que la wilaya d'origine, on
                                                 // exécute le
            // même code que Vente
            if (b.getPrix() < 5000000) {
                if (b.getWilaya().getPrix() < 50000) {
                    prix = b.getPrix() * 1.03;
                } else
                    prix = b.getPrix() * 1.035;
            }

            if (b.getPrix() > 500000 && b.getPrix() < 15000000) {
                if (b.getWilaya().getPrix() < 50000) {
                    prix = b.getPrix() + 0.02 * b.getPrix();
                } else
                    prix = b.getPrix() + 0.025 * b.getPrix();
            }

            if (b.getPrix() > 15000000) {
                if (b.getWilaya().getPrix() < 70000) {
                    prix = b.getPrix() * 1.01;
                } else
                    prix = b.getPrix() * 1.02;

            }
        } else {
            prix = b.getPrix() * 1.0025;
        } // Sinon on ajoute des frais supp.

        return prix;
    }

}