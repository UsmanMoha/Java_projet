public class Joueur {
    
    private String nom;
    private int score = 0;
    private IHMSaisie saisie;

    public String getNom() {
        return this.nom;
    }

    Joueur(String nom) {
        this.nom = nom;
        saisie = new IHMSaisie(nom);
    }

    public int getScore() {
        return score;
    }

    public void crediter() {
        score++;
    }

    public Choix choisir() {
        return saisie.proposerChoix();
    }

    public void kill() {
        saisie.getDialogue().dispose();
    }

    public void ecrireScore() {
        System.out.println("Le score de " + nom + " est " + score);
    }
}
