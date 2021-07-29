package foot;

import java.util.Random;

class Jeu {
    private Random alea = new Random ();
    private Equipe EquipeA;
    private Equipe EquipeB;

    static Jeu obj = new Jeu();
    public Jeu() {

        Joueur[] listJoueursA = new Joueur[11];
        Joueur[] listJoueursB = new Joueur[11];

    try{

        for (int i = 0; i < listJoueursA.length; i++) {
            String[] nomsA = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
        
                int x = alea.nextInt (11);
                int y = alea.nextInt (100) + 1;
                Joueur JoueurA = new Joueur (nomsA[x], y);

                if((!(x<11))||(!(y<=100))){
                    throw new InvalidNumberException();
                }
             
            listJoueursA[i] = JoueurA;
        }

        for (int i = 0; i < listJoueursB.length; i++) {

            String[] nomsB = {"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V"};

            Joueur JoueurB = new Joueur (nomsB[alea.nextInt (11)], alea.nextInt (100) + 1);
            listJoueursB[i] = JoueurB;
        }

    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception : dépassement des bornes " + e.getMessage());
    } catch(InvalidNumberException e){
        System.out.println(e.getMessage());
    }
        EquipeA = new Equipe (listJoueursA, "EquipeA", 0);
        EquipeB = new Equipe (listJoueursB, "EquipeB", 0);

    }

    public static Jeu retournerInstance(){
        return obj;
    }

    public void lancer() { 

        
        
        while ((EquipeA.retournerPoints ( ) < 3) && (EquipeB.retournerPoints ( ) < 3)) {
            
        
            System.out.println ("Joueur " + EquipeA.retournerJoueurs()[alea.nextInt (10)].retournerNom() + " de l'équipe "
                    + EquipeA.retournerNom() + " a tiré le ballon contre " + EquipeB.retournerNom());

            if (EquipeA.retournerJoueurs()[alea.nextInt (10)].retournerTalents() > EquipeB.retournerJoueurs()[alea.nextInt (10)].retournerTalents()) {
                EquipeA.definirPoints(EquipeA.retournerPoints() + 1);

                System.out.println ("Le gardien de l'équipe " + EquipeB.retournerNom ( ) + "a raté le ballon \n l'équipe "
                        + EquipeA.retournerNom ( ) + " a gagné un point");
                System.out.println (" " + EquipeA.retournerNom() + " " + EquipeA.retournerPoints() + " : " + EquipeB.retournerNom()
                        + " " + EquipeB.retournerPoints());

                if (EquipeA.retournerPoints() == 3) {
                    System.out.println ("Jeu terminé \n l'équipe " + EquipeA.retournerNom() + " a gagné");
                    return;
                }
            } else {
                System.out.println("Le gardien de l'équipe " + EquipeB.retournerNom() + " a le ballon. Le jeu continue...");
            }

            System.out.println ("Joueur " + EquipeB.retournerJoueurs()[alea.nextInt (10)].retournerNom()
                    + " de l'équipe " + EquipeB.retournerNom() + " a tiré le ballon contre l'équipe " + EquipeA.retournerNom());

            if (EquipeB.retournerJoueurs()[alea.nextInt (10)].retournerTalents() > EquipeA.retournerJoueurs()
                    [alea.nextInt (10)].retournerTalents()) {
                EquipeB.definirPoints(EquipeB.retournerPoints() + 1);
                System.out.println ("Le gardien de l'équipe " + EquipeA.retournerNom()
                        + " a raté le ballon \n l'équipe " + EquipeB.retournerNom() + " a le ballon");
                System.out.println (" " + EquipeA.retournerNom() + " " + EquipeA.retournerPoints()
                        + ": " + EquipeB.retournerNom() + " " + EquipeB.retournerPoints());
                if (EquipeB.retournerPoints() == 3) {
                    System.out.println("Jeu terminé \n l'équipe " + EquipeB.retournerNom ( ) + " a gagné");
                    return;
                }

            } else
                System.out.println("Le gardien de l'équipe " + EquipeA.retournerNom ( ) + " a le ballon. Le jeu continue...");
        }
    } 
    
}