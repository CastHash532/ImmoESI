package home.model.Classes;

/*    Proprietaire    */

public class Proprietaire {

    private String nom;
    private String prenom;
    private String mail;
    private String telephone;
    private String adresse;

    public Proprietaire() {
        super();
    }
    public Proprietaire(String nom, String prenom, String mail, String telephone, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    public void SetNom(String nom) {
        this.nom = nom;
    }

    public void SetPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void SetMail(String mail) {
        this.mail = mail;
    }

    public void SetTel(String telephone) {
        this.telephone = telephone;
    }

    public void Adresse(String adresse) {
        this.adresse = adresse;
    }

    public void afficher() {
        System.out.println("Nom:" + nom);
        System.out.println("Prenom:" + prenom);
        System.out.println("@mail:" + mail);
        System.out.println("N° de telephone:" + telephone);
        System.out.println("Adresse :" + adresse);
    }

}