package exo1;

public class GestionnaireDeContacts {
        private static GestionnaireDeContacts instance;
        private Annuaire annuaire;

        private GestionnaireDeContacts() {
            annuaire = new Annuaire();
        }

        public static GestionnaireDeContacts getInstance() {
            if (instance == null) {
                instance = new GestionnaireDeContacts();
            }
            return instance;
        }

        public Annuaire getAnnuaire() {
            return annuaire;
        }
}
