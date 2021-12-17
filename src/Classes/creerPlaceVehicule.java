package Classes;

public class creerPlaceVehicule implements PlaceCreation{
    public Place creerPlace(int numeroPlace) {
        return new PlaceVehicule(numeroPlace, null);
    }
}
