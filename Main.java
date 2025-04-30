public class Main {
    public static void main(String[] args) {
        Employe employe1 = new Employe("Ibrahima", "DIAO", 300000);
        Employe employe2 = new Employe("Abdoulaye", "DIALLO", 200000);
        Conge congeE = new Conge("10/04/2025","15/05/2025",true);

       Directeur directeur1 = new Directeur("Abdoulaye", "BALDE", 600000, 80, 5000000);
       Conge    congeD=new Conge("12/03/2025","12/05/2025",false);

        Entreprise monEntreprise = new Entreprise();
        monEntreprise.ajouterEmploye(employe1);
        monEntreprise.ajouterEmploye(employe2);
        monEntreprise.ajouterEmploye(directeur1);

        monEntreprise.afficherTousLesEmployes();


       congeD.afficherConge();

        congeE.afficherConge();


    }
}
