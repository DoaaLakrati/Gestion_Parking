package Classes_Exception;

public class PlaceOccupeException extends Exception{
    public PlaceOccupeException(int numeroPlace) {
        System.out.println("====> ERREUR : La place " + numeroPlace + " est déjà occupée ou elle ne correspond pas au type de vehicule.");
    }
}
