package exo1;

public class Main {
    public static void main(String[] args) {
        GestionnaireDeContacts gestionnaire = GestionnaireDeContacts.getInstance();

        Contact contact1 = new Contact.ContactBuilder("Labrak", "0666666666").addPrenom("Sofian").addMail("sofian.labrak@gmail.com").build();

        Contact contact2 = new Contact.ContactBuilder("Eric", "0649876528").addPrenom("Dupont Moretti").addVille("Paris").addCivilite("Homme").build();

        Annuaire annuaire = gestionnaire.getAnnuaire();
        annuaire.ajouteContact(contact1);
        annuaire.ajouteContact(contact2);

        System.out.println("Liste des contacts :");
        annuaire.afficheContacts();

        annuaire.supprimeContact(contact1);
        System.out.println("Après la suppression d'un contact :");
        annuaire.afficheContacts();

        System.out.println("Affichage en JSON du contact : " + contact2.getInfoContact("json"));
        System.out.println("Affichage en XML du contact : " + contact2.getInfoContact("xml"));
        System.out.println("Affichage en DEFAULT du contact : " + contact2.getInfoContact("default"));
    }
}
