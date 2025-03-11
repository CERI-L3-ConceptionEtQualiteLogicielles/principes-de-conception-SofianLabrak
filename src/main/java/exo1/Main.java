package exo1;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("John", "0666666666");
        System.out.println(contact1.getInfoContact("json"));
        System.out.println(contact1.getInfoContact("xml"));
    }
}
