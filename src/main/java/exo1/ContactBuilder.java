package exo1;

public class ContactBuilder {
    // Obligatoire
    private final String nom;
    private final String numero;
    // Non Obligatoire
    private String prenom = "";
    private String civilite = "";
    private String adresse = "";
    private String mail = "";
    private String dateNaissance = "";
    private String lieuTravail = "";
    private String ville = "";

    public ContactBuilder(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public ContactBuilder addPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public ContactBuilder addCivilite(String civilite) {
        this.civilite = civilite;
        return this;
    }

    public ContactBuilder addAdresse(String adresse) {
        this.adresse = adresse;
        return this;
    }

    public ContactBuilder addMail(String mail) {
        this.mail = mail;
        return this;
    }

    public ContactBuilder addDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
        return this;
    }

    public ContactBuilder addLieuTravail(String lieuTravail) {
        this.lieuTravail = lieuTravail;
        return this;
    }

    public ContactBuilder addVille(String ville) {
        this.ville = ville;
        return this;
    }

    public Contact build() {
        return new Contact(this);
    }

    public String getNom() { return nom; }
    public String getNumero() { return numero; }
    public String getPrenom() { return prenom; }
    public String getCivilite() { return civilite; }
    public String getAdressePostale() { return adresse; }
    public String getEmail() { return mail; }
    public String getDateAnniversaire() { return dateNaissance; }
    public String getLieuTravail() { return lieuTravail; }
    public String getVille() { return ville; }
}
