package home.model.Classes.Filtres;

import java.util.ArrayList;

import home.model.Classes.Recherche;
import home.model.Classes.Bien;
import home.model.Interfaces.Filtre;

/**
 * FiltreParType
 */
public class FiltreParType implements Filtre {

    public ArrayList<Bien> Filtrer(ArrayList<Bien> l, Recherche recherche) {
        ArrayList<Bien> resultat = new ArrayList<Bien>();
        for (Bien b : l) {
            // !
            if (b.getClass().toString() == recherche.type) {
                resultat.add(b);
            }

        }
        return resultat;
    }
}
