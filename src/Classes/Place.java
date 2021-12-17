package Classes;
import java.sql.Time;

/**
 * Place est une classe abstraite, mère de la  classe "PlaceParticulier" .
 *
 */

public abstract class Place {

        protected int numeroPlace;
        protected boolean reservation;
        protected Time debutStationnement;
        protected Vehicule vehicule;


        public Place(int numeroPlace, Vehicule vehicule) {
            this.numeroPlace = numeroPlace;
            this.vehicule = vehicule;
        }

        /**
         * Récupérer l'heure à laquelle le véhicule est arrivé.
         *
         * @return L'heure d'arrivée du véhicule.
         */
        public Time getDebutStationnement(){
            return debutStationnement;
        }

        /**
         * Récupérer le numéro de la place de parking.
         *
         * @return Le numéro de la place de parking.
         */
        public int getNum() {
            return this.numeroPlace;
        }

        /**
         * Récupérer le type de la place de parking .
         *
         * @return Le type de la place de parking.
         */
        abstract String getType();

        /**
         * Récupérer le véhicule associé à la place .
         *
         * @return Le véhicule associé à la place.
         */
        abstract Vehicule getVehicule();

        /**
         * Vérifier si la place est libre .
         *
         * @return "true" si aucun véhicule ne se trouve sur la place.
         */
        abstract boolean estLibre();

        /**
         * Vérifier si la place est réservée .
         *
         * @return la valeur du booléen "reserve" (true ou fasle).
         */
        abstract boolean estReservee();

        /**
         * Modifier l'état de réservation de la place .
         *
         * @param reservation
         *            L'état de réservation (true ou false).
         */
        abstract void setReservation(boolean reservation);

        /**
         * Attribuer un véhicule à une place .
         *
         * @param vehicule
         *            Le véhicule a attribuer.
         */
        abstract void attribuerVehicule(Vehicule vehicule);

        /**
         * Libérer une place de parking .
         *
         * @param cout
         *            Le coût à la minute du véhicule.
         */
        abstract void libererPlace(int cout);
}
