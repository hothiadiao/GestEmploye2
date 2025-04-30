public class Directeur extends Employe{
    private  int nbreEmploye;
    private double budget;

    public Directeur(String prenom, String nom,double salaire, int nbreEmploye,double budget) {
        super(prenom, nom,salaire);
        this.nbreEmploye = nbreEmploye;
        this.budget = budget;
    }

    public int getNbreEmploye() {
        return nbreEmploye;
    }

    public void setNbreEmploye(int nbreEmploye) {
        this.nbreEmploye = nbreEmploye;
    }

    @Override
    public String toString() {
        return "Directeur{" +
                "nbreEmploye=" + nbreEmploye +
                '}';
    }
    /*
    public void validerConge(Conge conge, Employe employe){
        System.out.println("Le directeur valide les congés de "+employe);
    }
    */

    /*
    @Override
    public void poserConge(String dateDebut, String dateFin){
        System.out.println("Le directeur "+ nom+" "+prenom +" pose des congés de "+
                dateDebut+" à "+dateFin);
        System.out.println("les congés sont automatiquement validés");
    }
*/

    @Override
    public void jouerRole() {
        System.out.println("Je suis un directeur.");
    }

    @Override
    public double calculerPrime() {
        return budget * 0.1; // 10% du budget
    }


}
