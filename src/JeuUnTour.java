public class JeuUnTour {

    private Joueur joueur1;
    private Joueur joueur2;

    public JeuUnTour(String joueuNom, String joueur2Nom) {
        joueur1 = new Joueur(joueuNom);
        joueur2 = new Joueur(joueur2Nom);
        jouer();
    }

    public void jouer() {
        tour();
        joueur1.ecrireScore();
        joueur2.ecrireScore();
        conclure();
    }

    public void tour() {
        Choix choix1 = joueur1.choisir();
        Choix choix2 = joueur2.choisir();

        if (choix1 == Choix.CISEAU) {
            if (choix2 == Choix.PAPIER) {
                joueur1.crediter();
            } else if (choix2 == Choix.CAILLOU) {
                joueur2.crediter();
            } else if (choix2 == Choix.CISEAU) {
                System.out.println("");
            }
        } else if (choix1 == Choix.PAPIER) {
            if (choix2 == Choix.CAILLOU) {
                joueur1.crediter();
            } else if (choix2 == Choix.CISEAU) {
                joueur2.crediter();
            } else if (choix2 == Choix.PAPIER) {
                System.out.println("");
            }
        } else if (choix1 == Choix.CAILLOU) {
            if (choix2 == Choix.CISEAU) {
                joueur1.crediter();
            }
        } else if (choix2 == Choix.PAPIER) {
            joueur2.crediter();
        } else if (choix2 == Choix.CAILLOU) {
            System.out.println("");
        }
    }

    public void conclure() {
        if (joueur1.getScore() == joueur2.getScore()) {
            System.out.println(joueur1.getNom() + " et " + joueur2.getNom() + " ont fait match nul!\n");
        } else if (joueur1.getScore() > joueur2.getScore()) {
            System.out.println(joueur1.getNom() + " a remporter la manche.\n");
        } else if (joueur1.getScore() < joueur2.getScore()) {
            System.out.println(joueur2.getNom() + " a remporter la manche.\n");
        }
    }

    public void jeu(int ptsMax) {
        boolean fini = false;

        while (!fini) {
            jouer();
            if (joueur1.getScore() == ptsMax) {
                System.out.println(joueur1.getNom() + " a remporter la partie.\n");
                fini = true;
                break;
            }
            else if (joueur2.getScore() == ptsMax) {
                System.out.println(joueur2.getNom() + " a remporter la partie.\n");
                fini = true;
                break;
            }
        }
        
        joueur1.kill();
        joueur2.kill();
    }
}
