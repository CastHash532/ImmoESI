package home.model.Classes.Transactions;

import home.model.Classes.*;
import home.model.Interfaces.Transaction;

/**
 * Location
 */
public class Location implements Transaction {

    public Location() {
        super();
    }

    @Override
    public double CalculerPrix(Bien b) {
        double prix = 0;
        if (b.getSuperficie() < 60) {
            if (b.getWilaya().getPrix() < 50000) {
                prix = b.getPrix() * 1.01;
            } else
                prix = b.getPrix() * 1.015;
        }

        if (b.getSuperficie() > 60 && b.getSuperficie() < 150) {
            if (b.getWilaya().getPrix() < 50000) {
                prix = b.getPrix() * 1.02;
            } else
                prix = b.getPrix() * 1.025;
        }

        if (b.getSuperficie() > 150)
            if (b.getWilaya().getPrix() < 50000) {
                prix = b.getPrix() * 1.03;
            } else
                prix = b.getPrix() * 1.035;

        if (b.getClass() == (new Maison()).getClass()) {
            Maison m = (Maison) b;
            if (m.getPiscine() == true) {
                prix = prix + 50000;
            }
        }

        if (b.getClass() == (new Appartement()).getClass()) {
            Appartement a = (Appartement) b;
            if (a.getEtage() < 3) {
                prix += 5000;

            }
        }

        if (b.getClass() == (new Terrain()).getClass()) {
            Terrain t = (Terrain) b;
            if (t.getNbFacades() > 1) {
                prix += (0.5 * prix) * t.getNbFacades();
            }
        }

        return prix;
    }

}