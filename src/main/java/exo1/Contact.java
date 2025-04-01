package exo1;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    // Obligatoire
    private final String nom;
    private final String numero;
    // Non Obligatoire
    private final String prenom;
    private final String civilite;
    private final String adresse;
    private final String mail;
    private final String dateNaissance;
    private final String lieuTravail;
    private final String ville;

    private Contact(Builder builder) {
        this.nom = builder.nom;
        this.numero = builder.numero;
        this.prenom = builder.prenom;
        this.civilite = builder.civilite;
        this.adresse = builder.adresse;
        this.mail = builder.mail;
        this.dateNaissance = builder.dateNaissance;
        this.lieuTravail = builder.lieuTravail;
        this.ville = builder.ville;
    }

    // Classe Builder statique interne
    public static class Builder {
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

        public Builder(String nom, String numero) {
            this.nom = nom;
            this.numero = numero;
        }

        public Builder prenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public Builder civilite(String civilite) {
            this.civilite = civilite;
            return this;
        }

        public Builder adresse(String adresse) {
            this.adresse = adresse;
            return this;
        }

        public Builder mail(String mail) {
            this.mail = mail;
            return this;
        }

        public Builder dateNaissance(String dateNaissance) {
            this.dateNaissance = dateNaissance;
            return this;
        }

        public Builder lieuTravail(String lieuTravail) {
            this.lieuTravail = lieuTravail;
            return this;
        }

        public Builder ville(String ville) {
            this.ville = ville;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public String getPrenom() {return prenom;}
    public String getCivilite() {return civilite;}
    public String getAdresse() {return adresse;}
    public String getMail() {return mail;}
    public String getDateNaissance() {return dateNaissance;}
    public String getLieuTravail() {return lieuTravail;}
    public String getVille() {return ville;}

    public String getInfoContact(String format) {
        switch (format.toLowerCase()) {
            case "json":
                return String.format("{\"nom\": \"%s\", \"numero\": \"%s\", \"prenom\": \"%s\", \"civilite\": \"%s\", \"adresse\": \"%s\", \"mail\": \"%s\", \"dateNaissance\": \"%s\", \"lieuTravail\": \"%s\", \"ville\": \"%s\"}", nom, numero, prenom, civilite, adresse, mail, dateNaissance, lieuTravail, ville);
            case "xml":
                return String.format("<contact><nom>%s</nom><numero>%s</numero><prenom>%s</prenom><civilite>%s</civilite><adresse>%s</adresse><mail>%s</mail><dateNaissane>%s</dateNaissance><lieuTravail>%s</lieuTravail><ville>%s</ville></contact>", nom, numero, prenom, civilite, adresse, mail, dateNaissance, lieuTravail, ville);
            default:
                return String.format("%s %s %s %s %s %s %s %s %s", nom, numero, prenom, civilite, adresse, mail, dateNaissance, lieuTravail, ville);
        }
    }

    public void envoyerSMS(String message) {
        System.out.println("SMS: " + message + ", Destinataire: " + getNumero());
    }

    public void envoiEmail(Contact contact, String message) {
        // Logique pour envoyer un email
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nom='" + nom + '\'' +
                ", numero='" + numero + '\'' +
                ", prenom='" + prenom + '\'' +
                ", civilite='" + civilite + '\'' +
                ", adresse='" + adresse + '\'' +
                ", mail='" + mail + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", lieuTravail='" + lieuTravail + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}