package foot;

class Equipe {

    private Joueur[] joueurs;
    private String nom;
    private int points;
    private String entraineur;

    public Equipe(Joueur[] joueurs, String nom, int points) {
        this.joueurs = joueurs;
        this.nom = nom;
        this.points = points;
    }
    public Equipe (Equipe copie){
        this(copie.retournerJoueurs(),copie.retournerNom(),copyie.retournerPoints());
    }
    

    Joueur[] retournerJoueurs() {
        return joueurs;
    }


    String retournerNom() {
        return nom;
    }
    

    int retournerPoints() {
        return points;
    }

    void definirPoints(int points) {
        this.points = points;
    }

}
