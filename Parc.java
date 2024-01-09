import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Parc {
    public static void main(String[] args) throws IOException{

    Voiture V1= Voiture.creeVoiture(2019,Carburant.Essance);
    Voiture V2= Voiture.creeVoiture(2020, Carburant.Diesel);
    Voiture V3= Voiture.creeVoiture(2022, Carburant.Gaz);
    V1.replieLeToit();

    // affichge des matricules des voitures:
        System.out.println("Matricule de la voiture V1:"+ V1.getMaricule());
        System.out.println("Matricule de la voiture V2:"+ V2.getMaricule());
        System.out.println("Matricule de la voiture V3:"+ V3.getMaricule());

        //Affichage des voitures:
        System.out.println("Voiture V1:"+V1.toString());
        System.out.println("Voiture V2:"+V2.toString());
        System.out.println("Voiture V3:"+V3.toString());

        //ajout des carburant:
        V1.addCarburant(22);
        V2.addCarburant(33);
        V3.addCarburant(44);

        //affichage des carburant des voiture apres l'ajout:
        System.out.println("Carburant V1:"+V1.getCarburant());
        System.out.println("Carburant V2:"+V2.getCarburant());
        System.out.println("Carburant V3:"+V3.getCarburant());


        //Initialisation des camions:
        Camion C1= Camion.creeCamion(2018, Carburant.Diesel);
        Camion C2= Camion.creeCamion(2021, Carburant.Essance);
        Camion C3= Camion.creeCamion(2023, Carburant.Gaz);
        C2.replieLeToit();


        //affichage des camion:
        System.out.println("\n\n");
        System.out.println("Camion C1:"+C1.toString());
        System.out.println("Camion C2:"+C2.toString());
        System.out.println("Camion C3:"+C3.toString());

        FileOutputStream F1 =new FileOutputStream("GARAGE");
        ObjectOutputStream O1 = new ObjectOutputStream(F1);

        O1.writeObject(V1);
        O1.writeObject(V2);
        O1.writeObject(V3);

        O1.close();
        F1.close();
    }

    

}