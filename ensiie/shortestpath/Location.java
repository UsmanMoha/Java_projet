package ensiie.shortestpath;

public class Location {

    /* 
        ** Attributs de la classe Location **
    */

    // Attribut qui stocke le nom de la ville
    private String name;
    // Attribut qui stocke la latitude de la ville
    private double latitude;
    // Attribut qui stocke la longitude de la ville
    private double longitude;
    // Attribut qui stocke les villes voisines
    private Location[] neighbors;
    // Attribut qui stocke la distance totale pour atteindre la ville à partir de l'origine
    private double distance;
    // Attribut qui stocke la ville d'où vient la ville actuelle
    private Location from;


    /* 
        ** Constructeur Location **
    */

    public Location(String name, double latitude, double longitude){
        this.name = name;

        // Conversion de la latitude et de la longitude en radians
        this.latitude = (Math.PI * latitude) / 180;
        this.longitude = (Math.PI * longitude) / 180;

        // this.distance = Math.random() * 100; // this.distance demander lors de la question 2.a

        // Définition de la distance à l'infini
        this.distance = Double.POSITIVE_INFINITY;
    }



    /* 
        ** Méthodes Getter **
    */

    // Méthode qui retourne le nom de la ville
    public String getName(){
        return this.name;
    }

    // Méthode qui retourne la latitude de la ville
    public double getLatitude(){
        return this.latitude;
    }

    // Méthode qui retourne la longitude de la ville
    public double getLongitude(){
        return this.longitude;
    }

    // Méthode qui retourne les villes voisines
    public Location[] getNeighbors(){
        return this.neighbors;
    }




    /* 
        ** Méthodes Setter **
    */

    // Méthode qui définit le nom de la ville
    public void setName(String name){
        this.name = name;
    }

    // Méthode qui définit la latitude de la ville
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    // Méthode qui définit la longitude de la ville
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    // Méthode qui définit les villes voisines
    public void setNeighbors(Location... neighbors){
        this.neighbors = neighbors;
    }


    /* 
        ** Méthodes Propres à la classe **
    */

    // Méthode display() permet de retourner les champs name, latitude et longitude
    public String display(){
        return this.name + " (" + this.latitude + ", " + this.longitude + ")";
    }

    // Méthode distanceTo() permet de retourner le calcul de la distance entre les deux villes en kilomètres 
    public double distanceTo(Location to){
        return 6378 * (Math.PI/2 - Math.asin (Math.sin(to.latitude) * Math.sin (this.latitude) + Math.cos(to.longitude - this.longitude) * Math.cos(to.latitude) * Math.cos(this.latitude))); 
    }

    // Méthode getDistance() permet de retourner la distance cumulée pour atteindre une ville à partir de l’origine (c'est un getter mais vu qu'il a été demandé dans le sujet, je l'ai mis ici.)
    public double getDistance(){
        return this.distance;
    }


    // Méthode proceedNode() permet de mettre à jour la distances minimale pour les voisins d'un noeud visité
    public void proceedNode(LocationSet set) {
        // Boucle sur chaque ville voisine de la ville actuelle
        for (Location neighbors : this.neighbors) {

            // Calcule la distance totale pour atteindre la ville voisine à partir de la ville actuelle
            double distance = this.distance + this.distanceTo(neighbors);

            // Si la distance totale est inférieure à la distance actuelle de la ville voisine
            if (distance < neighbors.distance) {
                // Mise à jour de la distance pour la ville voisine
                neighbors.distance = distance;
                // Enregistrement de la ville actuelle comme ville d'origine pour la ville voisine
                neighbors.from = this;
                // Ajout de la ville voisine à l'ensemble `LocationSet`
                set.add(neighbors);
            }
        }
    }


    // Méthode findPathTo() permet afficher le plus court chemin pour aller de this à to
    public void findPathTo(Location to) {

        // Création d'un ensemble `LocationSet` pour stocker les villes à visiter
        LocationSet locationSet = new LocationSet();
        // Ajout de la ville actuelle à l'ensemble `LocationSet`
        locationSet.add(this);
        // Initialisation de la distance de la ville actuelle à 0
        this.distance = 0;

        // Boucle jusqu'à ce que toutes les villes aient été visitées ou qu'il n'y ait plus de ville à visiter ou qu'aucun chemin n'ait été trouvé
        while (locationSet != null) {

            // Récupération de la ville ayant la distance minimale parmi les villes à visiter
            Location cur = locationSet.removeMin();

            // Si aucun chemin n'a été trouvé
            if (cur == null) {
                System.out.println("No trip found from " + this.name + " to " + to.name + ".\n");
                // Réinitialisation des distances et les from
                this.reinit();
                return;
            }
            // Si la ville cible a été trouvée
            else if (cur == to) {
                break;
            }
            // Mise à jour de la distance minimale pour les villes voisines de la ville actuelle
            cur.proceedNode(locationSet);
        }
        // Initialisation de `current` avec la ville cible
        Location current = to;

        // Affichage du chemin le plus court en partant de la ville cible et en remontant jusqu'à la ville d'origine
        System.out.println("Your trip from " + this.name + " to " + to.name + " is: ");
        while (current != null) {
            if (current.distance == 0) {
                break;
            }
            System.out.println(current.name + " at " + current.distance + " km ");
            current = current.from;
        }
        System.out.println("Fin\n");

        // Réinitialisation des distances et les from
        this.reinit();
    }




    // Méthode reinit() permet de réinitialiser les distances et les from
    public void reinit() {
        this.distance = Double.POSITIVE_INFINITY;
        this.from = null;

        // Boucle sur chaque ville voisine de la ville actuelle
        for (Location neighbors : this.neighbors) {
            if (neighbors.distance != Double.POSITIVE_INFINITY){
                neighbors.reinit();
            }
        }

    }
}
