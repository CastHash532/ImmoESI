package home.model.Classes;

import java.util.Date;

import com.calendarfx.view.MonthSheetView.SimpleDateCell;

import home.model.Enums.*;
import home.model.Interfaces.*;

/**
 * Bien
 */
public abstract class Bien /* implements Comparable */ {

    protected String titre;
    protected String adresse;
    protected Wilayas wilaya;
    protected double superficie;
    protected Proprietaire proprietaire;
    protected Transaction transaction;
    protected double prix;
    protected Boolean negociable;
    protected String descriptif;
    protected String date; // !
    protected String photos;
    protected double tempPrix;
    protected Wilayas wilayaEch;

    public Bien() {
        super();
    }

    public Bien(String adresse, Wilayas wilaya, double superficie, Proprietaire proprietaire, Transaction transaction,
            double prix, boolean negociable, String descriptif, String date, String photos, Wilayas wilayaEch) {
        this.adresse = new String(adresse);
        this.wilaya = wilaya;
        this.superficie = superficie;
        this.proprietaire = proprietaire;
        this.transaction = transaction;
        this.prix = prix;
        this.negociable = new Boolean(negociable);
        this.descriptif = new String(descriptif);
        this.date = date;
        this.photos = new String(photos);
        this.titre = new String("Titre");
        this.tempPrix = this.CalculerPrix();
    }

    public double CalculerPrix() {
        return transaction.CalculerPrix(this);
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = new String(adresse);
    }

    public Wilayas getWilaya() {
        return this.wilaya;
    }

    public void setWilaya(Wilayas wilaya) {
        this.wilaya = wilaya;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public Proprietaire getProprietaire() {
        return this.proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    public Transaction getTransaction() {
        return this.transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isNegociable() {
        return negociable;
    }

    public boolean getNegociable() {
        return negociable;
    }

    public void setNegociable(boolean negociable) {
        this.negociable = new Boolean(negociable);
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = new String(descriptif);
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = new String(photos);
    }

    public Wilayas getWilayaEch() {
        return this.wilayaEch;
    }

    public void setWilayaEch(Wilayas wilayaEch) {
        this.wilayaEch = wilayaEch;
    }

}
