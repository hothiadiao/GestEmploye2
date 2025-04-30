public class Employe extends Personne implements  Prime{
    protected double salaire;

    public Employe(String prenom, String nom, double salaire) {
        super(nom,prenom);
        this.salaire = salaire;
    }

    /*public abstract void poserConge(String dateDebut, String dateFin);*/

    /*
        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }
    */
    @Override
    public void jouerRole(){
        System.out.println("Je suis un employe");
    }



    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
/*
    public void poserConge(String dateDebut, String dateFin){
        System.out.println("L'employé "+ nom+" "+prenom+" pose des congés de "+
                dateDebut+" à "+dateFin);
        System.out.println("il attend la validation du directeur");
    }
    public void poserConge(Conge conge){
        System.out.println("L'employé "+ nom+" "+prenom+" pose des congés de "+
                conge.getDateDebut()+" à "+conge.getDateFin());
        System.out.println("il attend la validation du directeur");
    }
*/
    @Override
    public double calculerPrime() {
        return salaire*0.05;
    }


}
