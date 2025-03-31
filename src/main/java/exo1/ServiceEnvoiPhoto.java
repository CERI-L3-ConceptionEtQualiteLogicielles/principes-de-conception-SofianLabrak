package exo1;

import java.awt.*;

public class ServiceEnvoiPhoto {
    public String envoiePhoto(Contact c, Image image) {
        return "Photo " + image + " Envoyer au contacte : " + c + ".";
    }
}
