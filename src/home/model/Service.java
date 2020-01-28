package home.model;

import home.model.Classes.*;
import home.model.Classes.Transactions.*;
import home.model.Enums.Plex;
import home.model.Enums.StatusJuridique;
import home.model.Enums.Wilayas;

/**
 * Service
 */
public class Service {

    public Service() {

                // *Creation Biens
                Appartement b1 = new Appartement("Alger Centre", Wilayas.Blida, 120.00, new Proprietaire("Sahraoui","Amine","gm_sahraoui@esi.dz","0780377405","Heuraoua Alger"), new Vente(), 4000000.00, true, "N/A",
                                "N/A", "", Wilayas.Alger, 4, false, 0, Plex.Simplex, false);

                Maison b2 = new Maison("Oran Centre", Wilayas.Oran, 120.00, new Proprietaire(), new Vente(), 10000000.00, true, "N/A", "N/A",
                                "", Wilayas.Alger, 0, false, 0, false, false, true, 200);

                Terrain b3 = new Terrain("Rue Nationale n34", Wilayas.Blida, 120.00, new Proprietaire(), new Vente(), 20000000.00, true, "N/A", "N/A",
                                "", Wilayas.Alger, StatusJuridique.Acte_notarié, 3);

                Appartement b4 = new Appartement("Cité des Martyrs", Wilayas.Oran, 100.00, new Proprietaire(), new Location(), 400000.00, true, "N/A",
                                "N/A", "", Wilayas.Alger, 3, false, 1, Plex.Simplex, false);

                Maison b5 = new Maison("Cité Oued smare", Wilayas.Blida, 160.00, new Proprietaire(), new Location(), 150000.00, true, "N/A", "N/A",
                                "", Wilayas.Alger, 0, false, 0, false, true, false, 160);

                Appartement b6 = new Appartement("Blvd Hassiba ben Bouali", Wilayas.Oran, 50.00, new Proprietaire(), new Location(), 60000.00, true, "N/A",
                                "N/A", "", Wilayas.Alger, 1, false, 6, Plex.Simplex, false);

                Terrain b7 = new Terrain("Rue n37", Wilayas.Alger, 650.00, new Proprietaire(), new Echange(), 18000000.00, true, "N/A",
                                "N/A", "", Wilayas.Alger, StatusJuridique.Acte_notarié, 1);

                Maison b8 = new Maison("Cité Police", Wilayas.Blida, 200.00, new Proprietaire(), new Vente(), 14000000.00, true, "N/A", "N/A",
                                "", Wilayas.Alger, 0, false, 0, true, false, true, 200);


                // * DB Initiale
                ImmoESI.Inserer(b1);
                ImmoESI.Inserer(b2);
                ImmoESI.Inserer(b3);
                ImmoESI.Inserer(b4);
                ImmoESI.Inserer(b5);
                ImmoESI.Inserer(b6);
                ImmoESI.Inserer(b7);
                ImmoESI.Inserer(b8);
                // * ...
    }
}