package Classes;

import Classes_Exception.NumeroPlaceException;
import Classes_Exception.PlaceLibreException;
import Classes_Exception.PlaceOccupeException;
import Classes_Exception.VehiculeExistException;

public class Test {
    private static Parking p = new Parking("YourParking", 15, 5);
    private static Vehicule v = new Voiture("Meryem", "123-AZE-456", "Audi", "A6");
    private static Vehicule v1 = new Voiture("Lauren", "NUMBER#1", "Range Rover", "Royal");
    private static Vehicule v2 = new Voiture("Adam", "HARDER", "Robot", "Rock");
    private static Vehicule v3 = new Camion("James", "DOH!", "Mercedes", "Truck");
    private static Vehicule v4 = new Camion("Powlo", "FAT-13", "Mercedes", "Truck");

    public static void afficherEtat() {

        p.etatParking();
    }

    public static void testParkVehicules(){
       try {
            p.park(v, 6);
            p.park(v1, 7);
            p.park(v2, 10);
            p.park(v3, 1);
            p.park(v4, 0);
        } catch (PlaceOccupeException |VehiculeExistException |NumeroPlaceException e) {

        }
    }

    public static void testUnparkVehicules() {
        Vehicule vUnpark = null;
        testParkVehicules();
        System.out.println("=== AVANT UNPARK ===");
        afficherEtat();
        System.out.println("");
        try {
            vUnpark = p.unpark(1);
        } catch (PlaceLibreException | NumeroPlaceException e) {

        }

        System.out.println("===> Le véhicule suivant vient de quitter le parking : " + vUnpark.toString());
        System.out.println("");
        System.out.println("=== APRES UNPARK ===");
        afficherEtat();
    }

    public static void testSearchCar(String immat) {
        int num;
        testParkVehicules();
        num = p.getLocation(immat);
        System.out.println("Le véhicule ayant l'immatriculation '" + immat + "' se trouve é la place n." + num + ".");
    }

    public static void testRetirerVehicule(String immat) {
        Vehicule vRetirer = null;
        testParkVehicules();
        System.out.println("=== AVANT RETRAIT ===");
        afficherEtat();
        System.out.println("");
        vRetirer = p.retirerVehicule(immat);
        System.out.println("===> Le véhicule ayant l'immatriculation '" + immat + "' a été retiré du parking. "
                + "Voici ses informations : " + vRetirer.toString());
        System.out.println("=== APRES RETRAIT ===");
        afficherEtat();
    }

    public static void main(String[] args) {
        //tester la fonction park()
        /*testParkVehicules();*/

        //tester la fonction unpark()
        /*testUnparkVehicules();*/

        //tester la fonction getLocation()
        /*testSearchCar("FAT-13");*/

        //tester la fonction retirerVehicule()
        /*testRetirerVehicule("FAT-13");*/
    }
}
