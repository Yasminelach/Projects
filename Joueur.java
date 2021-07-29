package foot;

public class Joueur implements Humain {

    private String nom;
    private int talents;

    public Joueur(String nom, int talents) {

        this.nom = nom;
        this.talents = talents;
    }
    public Joueur (Joueur copie){
        this(copie.retournerTalents(),copie.retournerNom());
    }

    public boolean estunJoueur(){ return true;}
    public boolean estunEntraineur(){ return false;}
    public boolean estunSupporteur(){return false;}
    public int retournerTalents() {return talents; }
    public String retournerNom() {return nom;}
}
