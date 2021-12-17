package Classes;

public class Camion extends Vehicule{
    private String type;

    /**
     * Constructeur de la classe "Camion".
     *
     * @param proprietaire
     *            Le propriétaire du camion.
     *
     * @param num_immat
     *            Le numéro d'immatriculation du camion.
     *
     * @param marque
     *            La marque du camion.
     *
     * @param modele
     *            Le modèle du camion.
     *
     */
    public Camion(String proprietaire, String num_immat, String marque, String modele) {
        super(proprietaire, num_immat, marque, modele);
        type = "camion";
    }

    /**
     * Récupérer le type d'un camion.
     *
     * @return Le type de véhicule (ici "camion").
     */
    public String getType() {
        return type;
    }

    /**
     * Récupérer les informations d'un camion.
     *
     * @return Une chaîne de caractères contenant les infos d'un camion.
     */
    public String toString() {
        return "\n Type de vehicule : " + type + "\n Proprietaire : " + proprietaire + "\n Immatriculation : " + num_immat + "\n "
                + "Marque : " + marque + "\n Modele : " + modele + "\n";
    }
}
