package home.model.Interfaces;

import java.util.ArrayList;
import java.util.ArrayList;

import home.model.Classes.Bien;
import home.model.Classes.Recherche;

/**
 * Critere
 */
public interface Filtre {

    public ArrayList<Bien> Filtrer(ArrayList<Bien> l, Recherche recherche);
}