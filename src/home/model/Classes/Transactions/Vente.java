package home.model.Classes.Transactions;

import home.model.Classes.*;
import home.model.Interfaces.Transaction;

/* Vente*/
public class Vente implements Transaction {

    public Vente() {
        super();
    }

    @Override
    public double CalculerPrix(Bien b) {
        double prix = 0;
        if (b.getPrix() < 5000000) {
            if (b.getWilaya().getPrix() < 50000) {
                prix = b.getPrix() * 1.03;
            } else
                prix = b.getPrix() * 1.035;
        }

        if (b.getPrix() > 500000 & b.getPrix() < 15000000) {
            if (b.getWilaya().getPrix() < 50000) {
                prix = b.getPrix() * 1.02;
            } else
                prix = b.getPrix() * 1.025;
        }

        if (b.getPrix() > 15000000)
            if (b.getWilaya().getPrix() < 70000) {
                prix = b.getPrix() * 1.01;
            } else
                prix = b.getPrix() * 1.02;

        if (b.getClass() == (new Maison()).getClass()) {
            Maison m = (Maison) b;
            if (m.getGarage() == true || m.getPiscine() == true || m.getJardin() == true) {
                prix = prix * 1.005;
            }
        }

        if (b.getClass() == (new Appartement()).getClass()) {
            Appartement a = (Appartement) b;
            if (a.getEtage() < 3) {
                prix += 50000;
            }

            if (b.getClass() == (new Terrain()).getClass()) {
                Terrain t = (Terrain) b;
                if (t.getNbFacades() > 1) {
                    prix += (0.5 * prix) * t.getNbFacades();
                }

            }

        }
        return prix;
    }
}
