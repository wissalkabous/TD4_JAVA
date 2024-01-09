public class Camion extends Vehicule {
    private static int nbMaxCamion = 10;
        private static double capacite = 30;
        private Carburant typeCarburant;
        private int periodiciteVidange;
        private boolean toitReplit;
        private static int nbCamions = 0;

          // Constructors
          private Camion(int model, Carburant carburant) {
            super(model);
            this.typeCarburant = carburant;
            nbCamions++;
        }

        // Methods
        public static Camion creeCamion(int model, Carburant carburant) {
            if(nbCamions < nbMaxCamion) {
                return new Camion(model, carburant);
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

        public void replieLeToit() {
            this.toitReplit = true;
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


        // Getters and Setters
        public static int getNbMaxCamion() {
            return nbMaxCamion;
        }

        public static void setNbMaxCamion(int nbMaxCamion) {
            Camion.nbMaxCamion = nbMaxCamion;
        }

        public static double getCapacite() {
            return capacite;
        }

        public static void setCapacite(int capacite) {
            Camion.capacite = capacite;
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

        public static int getNbCamions() {
            return nbCamions;
        }

        public static void setNbCamions(int nbCamions) {
            Camion.nbCamions = nbCamions;
        }

        @Override
        public String toString() {
            return "Camion{" +"typeCarburant=" + typeCarburant +", periodiciteVidange=" + periodiciteVidange +", toitReplit=" + toitReplit +"} " + super.toString();
        }

        @Override
        public Carburant typeCarburant() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'typeCarburant'");
        }
}
