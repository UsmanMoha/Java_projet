package ensiie.shortestpath;

public class LocationSet {
    /* 
        ** Attributs de la classe LocationSet **
    */

    // Attribut qui stocke un tableau de locations
    private Location[] locations;
    // Attribut qui stocke le nombre de locations contenu dans le tableau
    private int nbLocations;



    /* 
        ** Constructeur LocationSet **
    */

    public LocationSet(){
        this.locations = null;
        this.nbLocations = 0;
    }



    /* 
        ** Méthodes Getter ** 
    */

    // Méthode qui retourne le tableau de locations
    public Location[] getLocations(){
        return this.locations;
    }

    // Méthode qui retourne le nombre de locations stockées dans le tableau
    public int getNbLocations(){
        return this.nbLocations;
    }



    /* 
        ** Méthodes Setter ** 
    */

    // Méthode qui définit le tableau de locations
    public void setLocations(Location[] locations){
        this.locations = locations;
    }

    // Méthode qui définit le nombre de locations stockées dans le tableau
    public void setNbLocations(int nbLocations){
        this.nbLocations = nbLocations;
    }



    
    /* 
        ** Méthodes Propres à la classe ** 
    */

    //  Méthode add() permet d'ajouter un nouvel élèment (location) dans le tableau.
    
    public void add(Location location){
        if (this.locations == null) {

            // Initialise le tableau avec une capacité de 2 éléments
            this.locations = new Location[2];
            // Ajoute la nouvelle location au tableau
            this.locations[0] = location;
            // Incrémente le nombre de locations dans le tableau
            this.nbLocations++;

        } else {
            // Crée un nouveau tableau avec une capacité 2 + 'nbLocations pour stocker la nouvelle location
            Location[] plusLocations = new Location[2 + this.nbLocations];
            // Copie les éléments du tableau précédent dans le nouveau tableau
            for (int i = 0; i < this.nbLocations; i++) {
                plusLocations[i] = this.locations[i];
            }
            // Ajoute la nouvelle location au tableau
            plusLocations[this.nbLocations] = location;
            // Incrémente le nombre de locations dans le tableau
            this.nbLocations++;
            // Définit le nouveau tableau comme tableau de la classe LocationSet
            this.locations = plusLocations;
        }
    }


  
       
    // Méthode removeMin() permet de retirer et renvoyer la ville avec la distance minimale dans le LocationSet.
    
    public Location removeMin(){
        // Si le nombre de villes est égal à 0, la méthode renvoie null.
        if (this.nbLocations == 0) {
           return null;
        }

        // Initialisation de la ville avec la distance minimale à la première ville dans le tableau.
        Location minLocations = this.locations[0];
        int index = 0;

        // Boucle pour trouver la ville avec la distance minimale dans le tableau.
        for (int i = 0; i < this.nbLocations; i++) {
           if (this.locations[i].getDistance() < minLocations.getDistance()) {
              minLocations = this.locations[i];
              index = i;
           }
        }

        // Création d'un nouveau tableau pour stocker toutes les villes sauf la ville avec la distance minimale.
        Location[] moinsLocations = new Location[this.nbLocations - 1];
        for (int i = 0; i < index; i++) {
           moinsLocations[i] = this.locations[i];
        }
        for (int i = index; i < this.nbLocations - 1; i++) {
           moinsLocations[i] = this.locations[i + 1];
        }
        // Décrémentation du nombre de villes et remplacement du tableau d'origine par le nouveau tableau.
        this.nbLocations--;
        // Définit le nouveau tableau comme tableau de la classe LocationSet
        this.locations = moinsLocations;
        return minLocations;
     }
    
    
}
