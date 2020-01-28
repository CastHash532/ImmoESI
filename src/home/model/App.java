//package app;

//import java.util.ArrayList;

//import app.Classes.*;
//import app.Classes.Filtres.FiltreParProp;
//import app.Classes.Transactions.*;
//import app.Enums.*;
//import app.Interfaces.*;

////*  Grandes étapes:
////*  1- Implementations des methodes 
////*  2- Gestion des exceptions
////*  3- Validation des inputs
////*  4- Design d'interface graphique
////*  5- Implementation d'interface graphique
////*  6- Tests de bugs et de performances

////todo: Creer les constructeurs exaustifs des classes
////todo: Implementation des Méthodes de ImmoEsi 
////todo: Méthode CalculerPrix() de chaque Transaction
////todo: RechercheFiltré() + filtres: Transaction, Bien, Wilaya, prix...

//public class App {
        //public static void main(String[] args) throws Exception {
                //// *Variables
                //String[] empty = new String[3];
                //ArrayList<Bien> resultat = new ArrayList<Bien>();
                //Filtre[] filtres = new Filtre[1];
                //// filtres[0] = new FiltreParWilaya();
                //// filtres[0] = new FiltreParType();
                //// filtres[0] = new FiltreParTransaction();
                //// filtres[0] = new FiltreParProp();
                //// filtres[0] = new FiltreParPrix();

                //// *Authenthification Administrateur
                //// Scanner scan = new Scanner(System.in);
                //// String User = scan.nextLine();
                //// String Pass = scan.nextLine();
                //// if (User == "amine" & Pass == "amine") {
                //ImmoESI Application = new ImmoESI();

                //// *Creation Propriétaires
                //Proprietaire Prop1 = new Proprietaire();
                //Proprietaire Prop2 = new Proprietaire();
                //Proprietaire Prop3 = new Proprietaire();
                //Proprietaire Prop4 = new Proprietaire();

                //// *Creation Biens
                //Appartement b1 = new Appartement("", Wilaya.Blida, 120.00, Prop2, new Vente(), 4000000.00, true, "N/A",
                                //"N/A", empty, Wilaya.Alger, 4, false, 0, Plex.Simplex, false);

                //Maison b2 = new Maison("", Wilaya.Oran, 120.00, Prop1, new Vente(), 10000000.00, true, "N/A", "N/A",
                                //empty, Wilaya.Alger, 0, false, 0, false, false, true, 200);

                //Terrain b3 = new Terrain("", Wilaya.Blida, 120.00, Prop1, new Vente(), 20000000.00, true, "N/A", "N/A",
                                //empty, Wilaya.Alger, StatusJuridique.Acte_notarié, 3);

                //Appartement b4 = new Appartement("", Wilaya.Oran, 100.00, Prop2, new Location(), 400000.00, true, "N/A",
                                //"N/A", empty, Wilaya.Alger, 3, false, 1, Plex.Simplex, false);

                //Maison b5 = new Maison("", Wilaya.Blida, 160.00, Prop3, new Location(), 150000.00, true, "N/A", "N/A",
                                //empty, Wilaya.Alger, 0, false, 0, false, true, false, 160);

                //Appartement b6 = new Appartement("", Wilaya.Oran, 50.00, Prop2, new Location(), 60000.00, true, "N/A",
                                //"N/A", empty, Wilaya.Alger, 1, false, 6, Plex.Simplex, false);

                //Terrain b7 = new Terrain("", Wilaya.Alger, 650.00, Prop1, new Echange(), 18000000.00, true, "N/A",
                                //"N/A", empty, Wilaya.Alger, StatusJuridique.Acte_notarié, 1);

                //Maison b8 = new Maison("", Wilaya.Blida, 200.00, Prop2, new Vente(), 14000000.00, true, "N/A", "N/A",
                                //empty, Wilaya.Alger, 0, false, 0, true, false, true, 200);
                //// * ...

                //// * DB Initiale
                //Application.Inserer(b1);
                //Application.Inserer(b2);
                //Application.Inserer(b3);
                //Application.Inserer(b4);
                //Application.Inserer(b5);
                //Application.Inserer(b6);
                //Application.Inserer(b7);
                //Application.Inserer(b8);

                //// * Affichage de la liste
                //Application.Afficher();

                ////// ? Propriétaire
                //// Application.args[3] = Prop4;
                //// resultat = Application.Filtrer(filtres);
                //// for (Bien bien : resultat) {
                //// bien.afficher();
                //// }

                //// * Insertion
                //// Appartement i = new Appartement("", Wilaya.Blida, 120.00, Prop2,
                //// Transaction.Vente, 4000000.00,
                //// true, "N/A", "N/A", empty, 4, false, 0, Plex.Simplex, false);

                //// Maison i = new Maison("", Wilaya.Oran, 120.00, Prop1, (Transaction) new
                //// Vente(), 10000000.00, true,
                //// "N/A", "N/A", empty, 0, false, 0, false, false, true, 200);

                //// Terrain i = new Terrain("", Wilaya.Blida, 120.00, Prop1, (Transaction)
                //// new
                //// Vente(), 4000000.00, true,
                //// "N/A", "N/A", empty, StatusJuridique.Acte_notarié, 3);

                //// Application.Inserer(i);
                //// Application.Afficher();

                //// System.out.println("Insertion terminée");

                ////// * Suppression
                //// if (!Application.Supprimer(b1))
                //// System.out.println("Bien non existant!");
                //// Application.Afficher();

                //// System.out.println(
                //// "Suppression
                //// terminée----------------------------------------------------------------------------------------------------------------------------------");

                ////// * Archivage
                //// Application.Archiver(b2);
                //// if (!Application.Archiver(b2))
                //// System.out.println("Bien non existant!");
                //// Application.Afficher();

                //// System.out.println(
                //// "Archivage
                //// terminée------------------------------------------------------------------------------------------------");

                //// * Affichage Bien
                //// b2.afficher();

                //// System.out.println(
                //// "Affichage
                //// terminée-----------------------------------------------------------------------------------------------------------------");

                //// * Operation de recherche

                //// ? Filtre Wilaya
                //// Application.args[0]=Wilaya.Blida;
                //// resultat = Application.Filtrer(filtres);
                //// for (Bien bien : resultat) {
                //// bien.afficher();
                //// }

                //// ? Filtre Type
                //// Application.args[1] = (new Appartement().getClass());
                //// resultat = Application.Filtrer(filtres);
                //// for (Bien bien : resultat) {
                //// bien.afficher();
                //// }

                //// ? Filtre Transaction
                //// Application.args[2] = (new Vente());
                //// resultat = Application.Filtrer(filtres);
                //// for (Bien bien : resultat) {
                //// bien.afficher();
                //// }

                //// ? Filtre Prix
                //// Application.args[4] = 0.00;
                //// Application.args[5] = 5000000.00;
                //// resultat = Application.Filtrer(filtres);
                //// for (Bien bien : resultat) {
                //// bien.afficher();
                //// }

                //// System.out.println(
                //// "Filtrage
                //// Terminé-------------------------------------------------------------------------------");

        //}
//}
