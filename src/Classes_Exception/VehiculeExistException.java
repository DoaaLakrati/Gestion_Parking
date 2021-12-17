package Classes_Exception;

public class VehiculeExistException extends Exception{
    public VehiculeExistException() {
        System.out.println("====> ERREUR : Le véhicule est déjà présent.");
    }
}
