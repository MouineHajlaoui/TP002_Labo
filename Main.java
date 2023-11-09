//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Adresse adresLabo = new Adresse();
        adresLabo.codePostale = 100;
        adresLabo.Ville = "Tunis";
        adresLabo.Gouve = "Bizerte";
        adresLabo.afficherAdresse();
        adresLabo.codePostale = 250;
        adresLabo.afficherAdresse();
        Adresse autreadresLabo = new Adresse("Nabeul", "Nabeul", 1920);
        autreadresLabo.Ville = "SidBouzid";
        autreadresLabo.afficherAdresse();
        Chercheur chercheur = new Chercheur("Mouine", 7, "Testeur");
        Chercheur autrechercheur = new Chercheur();
        autrechercheur.numOrdinateur = 2;
        autrechercheur.nomChercheur = "Anas";
        autrechercheur.postChercheur = "Developeur";
        autrechercheur.afficherChercheur();
        System.out.println("le nombre de chercheurs cree est: " + autrechercheur.getChercheur());
        System.out.println("est il chercheur1 == chercheur2 ? " + autrechercheur.comparer(chercheur));
        chercheur.numOrdinateur = 19;
        Chercheur chercheur3 = new Chercheur();
        chercheur3.numOrdinateur = 14;
        chercheur3.postChercheur = "data_scientist";
        chercheur3.nomChercheur = "Ahmed";
        new Bureau();
        new Bureau();
        Labo laboratoire1 = new Labo();
        laboratoire1.afficherLabo();
    }
}
