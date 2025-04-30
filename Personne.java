public abstract class Personne {
    protected String nom;
    protected String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void afficherInfos() {
        System.out.println("Nom : " + nom + " " + prenom);
    }

    public abstract void jouerRole(); //Methode abstract


}