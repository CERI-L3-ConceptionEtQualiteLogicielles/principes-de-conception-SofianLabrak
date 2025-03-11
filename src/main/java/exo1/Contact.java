package exo1;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String nom;
    private String numero;

    public Contact(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public String getInfoContact(String format) {
        switch (format.toLowerCase()) {
            case "json":
                return String.format("{\"nom\": \"%s\", \"numero\": \"%s\"}", nom, numero);
            case "xml":
                return String.format("<contact><nom>%s</nom><numero>%s</numero></contact>", nom, numero);
            default:
                return String.format("%s %s", nom, numero);
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
        return "Nom: " + getNom() + ", Numéro: " + getNumero();
    }
}

