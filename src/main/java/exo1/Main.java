package exo1;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new ContactBuilder("Dupont", "0666666666").addPrenom("Paul").build();
        Contact contact2 = new ContactBuilder("Labrak", "0619283045").addPrenom("Sofian").addAdresse("84 rue du CERI").addCivilite("Homme").build();
        System.out.println("Affichage des contactes toString :");
        System.out.println(contact1);
        System.out.println(contact2);
        System.out.println("Affichage ddes contactes format json et xml");
        System.out.println(contact1.getInfoContact("json"));
        System.out.println(contact1.getInfoContact("xml"));

        System.out.println(contact2.getInfoContact("json"));
        System.out.println(contact2.getInfoContact("xml"));
    }
}
