import java.util.ArrayList;
import java.util.List;

public class Entreprise {
    private List<Employe> employes;

    public Entreprise() {
        employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e) {
        employes.add(e);
        System.out.println("Employé ajouté : " + e.nom + " " + e.prenom);
    }

    public void afficherTousLesEmployes() {
        System.out.println("\nListe des employés :");
        for (Employe e : employes) {
            e.afficherInfos();
            e.jouerRole();;
            System.out.println("Prime : " + e.calculerPrime() + " FCFA\n");
        }
    }
}
