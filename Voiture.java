import java.io.Serializable;

public class Voiture extends Vehicule implements Decapotable, Motorisation, Serializable {

    private static int nbMaxVoiture = 10;
    private static double capacite = 30;
    private Carburant typeCarburant;
    private int periodiciteVidange;
    private boolean toitReplit;
    private static int nbVoitures = 0;


    // Constructors
    private Voiture(int model, Carburant carburant) {
        super(model);
        this.typeCarburant = carburant;
        nbVoitures++;
    }

    // Methods
    public static Voiture creeVoiture(int model, Carburant carburant) {
        if(nbVoitures < nbMaxVoiture) {
            return new Voiture(model, carburant);
        }
        else {
            return null;
        }
    }

    public void addCarburant (double quantite) {
        if(getCarburant() + quantite < capacite ) {
            setCarburant(getCarburant() + quantite);
        }
    }

    public void periodiciteVidange() {
        switch(typeCarburant) {
            case Diesel:
                periodiciteVidange = 10;
                break;
            case Essance:
                periodiciteVidange = 12;
                break;
            case Gaz:
                periodiciteVidange = 18;
                break;
            default:
                periodiciteVidange = 12;
                break;
        }
    }
    @Override
    public void replieLeToit() {
        this.toitReplit = true;
    }

    public Carburant typeCarburant() {
        return null;
    }

    // Getters and Setters
    public static int getNbMaxVoiture() {
        return nbMaxVoiture;
    }

    public static void setNbMaxVoiture(int nbMaxVoiture) {
        Voiture.nbMaxVoiture = nbMaxVoiture;
    }

    public static double getCapacite() {
        return capacite;
    }

    public static void setCapacite(int capacite) {
        Voiture.capacite = capacite;
    }

    public Carburant getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(Carburant typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    public int getperiodiciteVidange() {
        return periodiciteVidange;
    }

    public void setperiodiciteVidange(int periodiciteVidange) {
        this.periodiciteVidange = periodiciteVidange;
    }

    public boolean istoitReplit() {
        return toitReplit;
    }

    public void settoitReplit(boolean toitReplit) {
        this.toitReplit = toitReplit;
    }

    public static int getNbVoitures() {
        return nbVoitures;
    }

    public static void setNbVoitures(int nbVoitures) {
        Voiture.nbVoitures = nbVoitures;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "typeCarburant=" + typeCarburant +
                ", periodiciteVidange=" + periodiciteVidange +
                ", toitReplit=" + toitReplit +
                "} " + super.toString();
    }

}