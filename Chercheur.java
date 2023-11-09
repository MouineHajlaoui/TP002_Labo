//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)

public class Chercheur {
    public int numOrdinateur;
    public String nomChercheur;
    public String postChercheur;
    public static int ChercheurCpt = 0;

    public Chercheur(String nomChercheur, int numOrdinateur, String postChercheur) {
        this.nomChercheur = nomChercheur;
        this.postChercheur = postChercheur;
        this.numOrdinateur = numOrdinateur;
        ++ChercheurCpt;
    }

    public Chercheur() {
        this.nomChercheur = "";
        this.postChercheur = "";
        this.numOrdinateur = 0;
        ++ChercheurCpt;
    }

    public void afficherChercheur() {
        System.out.println("le nom de chercheur est :" + this.nomChercheur);
        System.out.println("le num de ordinateur est :" + this.numOrdinateur);
        System.out.println("le poste de chercheur est :" + this.postChercheur);
    }

    public int getChercheur() {
        return ChercheurCpt;
    }

    public boolean comparer(Chercheur ch) {
        return this.nomChercheur.equals(ch.nomChercheur) && this.postChercheur.equals(ch.postChercheur) && this.numOrdinateur == ch.numOrdinateur;
    }
}
