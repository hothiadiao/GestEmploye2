import java.util.ArrayList;
import java.util.List;

public class Entreprise {
    /*
    private List<Employe> employes;

    public Entreprise() {
        employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e) {
        employes.add(e);
        System.out.println("Employe ajoute : " + e.prenom + " " + e.nom);
    }

    public void afficherTousLesEmployes() {
        System.out.println("\nListe des employes :");
        for (Employe e : employes) {
            e.afficherInfos();
            e.jouerRole();
            System.out.println("Prime : " + e.calculerPrime() + " FCFA\n");
        }
    }

     */
    private List<Departement> departements;

    public Entreprise() {
        departements = new ArrayList<>();
    }

    public void ajouterDepartement(Departement d) {
        if (d != null) {
            departements.add(d);
            System.out.println("Département ajouté : " + d.getNom());
        }
    }

    public void afficherTousLesEmployes() {
        System.out.println("\nListe de tous les employés par département :");
        for (Departement d : departements) {
            d.afficherEmployes();
        }
    }
}
