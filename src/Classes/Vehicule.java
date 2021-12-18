package Classes;
    public abstract class Vehicule {

        protected String proprietaire, num_immat, marque, modele;
        /**
         * Constructeur de la classe "Vehicule".
         *
         * @param proprietaire
         *            Le propriétaire du véhicule.
         *
         * @param num_immat
         *            Le numéro d'immatriculation du véhicule.
         *
         * @param marque
         *            La marque du véhicule.
         *
         * @param modele
         *            Le modèle du véhicule.
         *
         */
        public Vehicule(String proprietaire, String num_immat, String marque, String modele) {
            this.proprietaire = proprietaire;
            this.num_immat = num_immat;
            this.marque = marque;
            this.modele = modele;

        }

        /**
         * Récupérer le numéro d'immatriculation de véhicule (camion ou voiture ou moto).
         *
         * @return Le numéro d'immatriculation du véhicule.
         */
        public String getNum_immat() {

            return this.num_immat;
        }
        public void setNum_immat(String num_immat) {

            this.num_immat = num_immat;
        }

        /**
         * Récupérer le propriétaire d'un véhicule (camion ou voiture).
         *
         * @return Le propriétaire du véhicule.
         */
        public String getProprietaire() {

            return this.proprietaire;
        }
        public void setProprietaire(String proprietaire) {

            this.proprietaire = proprietaire;
        }

        public String getModele() {

            return modele;
        }

        public void setModele(String modele) {

            this.modele = modele;
        }
        public String getMarque() {

            return marque;
        }

        public void setMarque(String marque) {

            this.marque = marque;
        }
       /* @return Le type de véhicule.
       */
         abstract String getType();

    }


