package home.model.Enums;

public enum Wilayas {
    Alger(100000), Blida(60000), Oran(30000);

    private final double prix;

    Wilayas(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

}
