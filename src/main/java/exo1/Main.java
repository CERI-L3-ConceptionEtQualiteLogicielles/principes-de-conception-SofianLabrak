package exo1;

public class Main {
    public static void main(String[] args) {
        GestionnaireDeContacts gestionnaire = GestionnaireDeContacts.getInstance();

        Contact contact1 = new Contact.Builder("Labrak", "0666666666").prenom("Sofian").mail("sofian.labrak@gmail.com").build();

        Contact contact2 = new Contact.Builder("Eric", "0649876528").prenom("Dupont Moretti").ville("Paris").civilite("Homme").build();

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
