package Classes;

public class CreerPlaceParticuliere implements PlaceCreation{
    public Place creerPlace(int numeroPlace) {
        return new PlaceVehicule(numeroPlace, null);
    }
}
