public abstract class Personne {
    protected String nom;
    protected String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void afficherInfos() {
        System.out.println("Prenom : " + prenom + " "+ "Nom:" + nom);
    }

    public abstract void jouerRole(); //Methode abstract


    public abstract double calculerPrime();
}
