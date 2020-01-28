package home.model.Classes;

import home.model.Enums.*;
import home.model.Interfaces.*;

public abstract class BienHabitable extends Bien {

    protected int pieces;
    protected boolean meuble;

    public BienHabitable() {
        super();
    }

    public BienHabitable(String adresse, Wilayas wilaya, double superficie, Proprietaire proprietaire,
            Transaction Transaction, double prix, boolean negociable, String descriptif, String date, String photos,
            Wilayas wilayaEch, int pieces, boolean meuble) {
        super(adresse, wilaya, superficie, proprietaire, Transaction, prix, negociable, descriptif, date, photos,
                wilayaEch);
        this.pieces = pieces;
        this.meuble = meuble;
    }

    public int getPieces() {
        return this.pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public boolean isMeuble() {
        return this.meuble;
    }

    public void setMeuble(boolean meuble) {
        this.meuble = meuble;
    }

}