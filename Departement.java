import java.util.ArrayList;
import java.util.List;

public class Departement {
    private String nom;
    private List<Employe> employes;

    public Departement(String nom) {
        this.nom = nom;
        this.employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e) {
        if (e != null) {
            employes.add(e);
            System.out.println("Employé ajouté au département " + nom + " : " + e.getPrenom() + " " + e.getNom());
        }
    }

    public void afficherEmployes() {
        System.out.println("Département : " + nom);
        for (Employe e : employes) {
            e.afficherInfos();
            e.jouerRole();
            System.out.println("Prime : " + e.calculerPrime() + " FCFA\n");
        }
    }

    public String getNom() {
        return nom;
    }

/*
    private String nom;
    private List<Employe> employes;

    public Departement(String nom) {
        this.nom = nom;
        this.employes = new ArrayList<>();
    }

    public void creerEtAjouterEmploye(String nom, String prenom) {
        Employe e = new Employe(nom, prenom);
        employes.add(e);
        System.out.println("Employé créé et ajouté au département " + this.nom + " : " + prenom + " " + nom);
    }

    public void afficherEmployes() {
        System.out.println("Département : " + nom);
        for (Employe e : employes) {
            e.afficherInfos();
            e.jouerRole();
            System.out.println("Prime : " + e.calculerPrime() + " FCFA\n");
        }
    }

    public String getNom() {
        return nom;
    }*/

}
