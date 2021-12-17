package Classes_Exception;

public class PlaceDisponiblexception extends Exception {
    public PlaceDisponiblexception(int numeroPlace) {
        System.out.println("====> ERREUR : Le numéro de place " + numeroPlace + " est incorrect.");
    }
}
