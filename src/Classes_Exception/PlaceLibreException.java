package Classes_Exception;

public class PlaceLibreException extends  Exception{
    public PlaceLibreException(int numeroPlace) {
        System.out.println("====> ERREUR : La place " + numeroPlace + " est déjà libre.");
    }
}
