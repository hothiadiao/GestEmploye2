public class Main {
    public static void main(String[] args) {
        Employe employe1 = new Employe("Mohamed", "Hassan", 600000);
        Conge congeE = new Conge("10/04/2025","15/05/2025",true);

       Directeur directeur1 = new Directeur("David", "Koné", 40, 800000, 5000000);
       Conge    congeD=new Conge("12/03/2025","12/05/2025",false);

        Entreprise monEntreprise = new Entreprise();
        monEntreprise.ajouterEmploye(employe1);
        monEntreprise.ajouterEmploye(directeur1);

        monEntreprise.afficherTousLesEmployes();

       /*
        employe1.poserConge("15/05/2025", "15/06/2025");
        directeur1.poserConge("01/05/2025", "10/07/2025");*/
        directeur1.afficherInfos();
        directeur1.jouerRole();
        System.out.println("Prime : " + directeur1.calculerPrime() + " FCFA");
      /* directeur1.poserConge("15/04/2003","30/05/2025");*/
        congeD.afficherConge();
       employe1.afficherInfos();
        employe1.jouerRole();
        System.out.println("Prime : " + employe1.calculerPrime() + " FCFA");
        /*employe1.poserConge("10/03/2025","20/05/2025");*/
        congeE.afficherConge();


    }
}
