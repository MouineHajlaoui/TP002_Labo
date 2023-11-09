public class Adresse {
    public String Gouve;
    public String Ville;
    public int codePostale;

    public Adresse(String Gouve, String Ville, int codePostale) {
        this.codePostale = codePostale;
        this.Gouve = Gouve;
        this.Ville = Ville;
    }

    public Adresse() {
        this.codePostale = 0;
        this.Gouve = "";
        this.Ville = "";
    }

    public void afficherAdresse() {
        System.out.println("la ville est :" + this.Ville);
        System.out.println("le code postal est :" + this.codePostale);
        System.out.println("la gouvernorat est :" + this.Gouve);
    }
}
