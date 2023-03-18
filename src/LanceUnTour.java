public class LanceUnTour {
    public static void main(String[] args) {
        JeuUnTour tour = new JeuUnTour(args[0], args[1]);
        int maxPts = 3;
        tour.jeu(maxPts);
    }
}