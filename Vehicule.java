import java.io.Serializable;

public abstract class Vehicule implements Motorisation,Serializable {
    private static int maricule=0;
    private double prix;
    private int model;
    private double carburant;
    private int capacite =30;

    //Constructeurs
    public Vehicule(){

    }

    public Vehicule(int model){
        this.model=model;
        maricule++;
    }

    //Getters & Setters
    public static int getMaricule() {
        return maricule;
    }

    public static void setMaricule(int maricule) {
        Vehicule.maricule = maricule;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getModele() {
        return model;
    }

    public void setModele(int model) {
        this.model = model;
    }

    public double getCarburant() {
        return carburant;
    }

    public void setCarburant(double carburant) {
        this.carburant = carburant;
    }

    public void addCarburant(double carburant){
        if(getCarburant()+ carburant<=capacite ){
            addCarburant(getCarburant()+carburant);
        }
        else{
            double max_c_ajout=getCarburant()-carburant;
            this.addCarburant(capacite);
        }
    }


    public String toString() {
        return "Vehicule{"
         +"Maricule=" + maricule +", Prix=" + prix +", Model=" + model +", Carburant=" + carburant
          +"}\n";
    }

}
