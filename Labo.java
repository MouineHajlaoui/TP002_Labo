//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Labo {
    public String nomLabo;
    public String Specialite;
    public int nbreBureaux;
    public Adresse adreslabo;
    public Bureau[] Bureau = new Bureau[2];

    public Labo(String nomLabo, String Specialite, int nombreBureaux, Bureau[] Bureaux) {
        this.nomLabo = nomLabo;
        this.Specialite = Specialite;
        this.nbreBureaux = nombreBureaux;
        this.Bureau = this.Bureau;
    }

    public Labo() {
        this.nomLabo = "";
        this.Specialite = "";
        this.nbreBureaux = 0;
        this.Bureau = this.Bureau;
    }

    public void afficherLabo() {
        System.out.println("le nom de labo est: " + this.nomLabo);
        System.out.println("la Specialitee est: " + this.Specialite);
        System.out.println("le nombre de bureaux est: " + this.nbreBureaux);

        for(int i = 0; i < this.Bureau.length; ++i) {
            System.out.println(this.Bureau[i]);
        }

    }
}
