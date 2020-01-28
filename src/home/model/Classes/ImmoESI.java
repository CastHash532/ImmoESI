package home.model.Classes;

import java.util.ArrayList;

import home.model.Interfaces.Filtre;
import home.model.Interfaces.Transaction;

/**
 * ImmoESI
 */
public class ImmoESI {
    public static ArrayList<Bien> lBiens = new ArrayList<Bien>();
    public static ArrayList<Bien> lstudents = new ArrayList<Bien>();

    // add(new Bien(4, "Amos", "Mors"));
    public static ArrayList<Bien> archive = new ArrayList<Bien>();
    public static ArrayList<Transaction> Transactions = new ArrayList<Transaction>();
    public static Recherche recherche = new Recherche();
    public static User admin = new User("admin", "admin");
    public static User user = new User("user", "user");

    public static boolean Archiver(Bien b) {
        lBiens.remove(b);
        return archive.add(b);
    }

    public static boolean Inserer(Bien b) {
        return lBiens.add(b);
    }


    public static boolean Supprimer(Bien b) {
        return lBiens.remove(b);
    }

    // * Unfinished ------------
    // public void Cloturer(Transaction t) {
    // t.CalculerPrix();
    // Transactions.add()
    // }

    public static ArrayList<Bien> Filtrer(Filtre[] F) {
        ArrayList<Bien> resultat = lBiens;
        for (Filtre filtre : F) {
            resultat = filtre.Filtrer(resultat, recherche);
        }
        return resultat;
    }

}