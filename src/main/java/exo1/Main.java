package exo1;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new ContactBuilder("Dupont", "0666666666").addPrenom("Paul").build();
        System.out.println(contact1);
        System.out.println(contact1.getInfoContact("json"));
        System.out.println(contact1.getInfoContact("xml"));
    }
}
