package ensiie.shortestpath;

public class Main{
    public static void main(String[] args){

        // On appel l'instance de la classe Location et on lui attribut une référence comme evry ou paris et on initialise.

        Location evry = new Location("Evry", 48.629828, 2.4417819999999892);
        Location paris = new Location("Paris", 48.85661400000001, 2.3522219000000177);

        // On appel les méthodes propres contenue dans la classe Location
        System.out.println(evry.display());
        System.out.println(paris.display());
        System.out.println("Distance from " + evry.getName() + " to " + paris.getName() + " : " + evry.distanceTo(paris) + " Km.\n");

        // Autres instance dont on leur attribue une référence et on les initiliase.
        
        Location lemans = new Location("LeMans",48.00611000000001,0.1995560000000296);
        Location orleans = new Location("Orleans",47.902964,1.9092510000000402);
        Location angers = new Location("Angers",47.478419,-0.5631660000000238);
        Location tours = new Location("Tours",47.39414399999999,0.6848400000000083);
        Location bourges = new Location("Bourges",47.081012,2.398781999999983);
        Location poitiers = new Location("Poitiers",46.58022400000001,0.34037499999999454);
        Location limoges = new Location("Limoges",45.83361900000001,1.2611050000000432);
        Location angouleme = new Location("Angouleme",45.648377,0.15623690000006718);
        Location bordeaux = new Location("Bordeaux",44.837789,-0.5791799999999512);
        Location agen = new Location("Agen",44.203142,0.6163629999999785);
        Location toulouse = new Location("Toulouse",43.604652,1.4442090000000007);
        Location bayonne = new Location("Bayonne",43.492949,-1.4748409999999694);
        Location pau = new Location("Pau",43.2951,-0.3707970000000387);
        Location sansebestian = new Location("SanSebastian",43.318334,-1.9812312999999904);
        Location pampelune = new Location("Pampelune",42.812526,-1.645774500000016);
        Location bilbao = new Location("Bilbao",43.2630126,-2.9349852000000283);



        // On appel la méthode displayNeighbors pour afficher les voisins de chaque ville.

        evry.setNeighbors(paris) ;
        paris.setNeighbors(evry,lemans,orleans);
        lemans.setNeighbors(orleans,tours,angers);
        orleans.setNeighbors(lemans,paris,bourges,tours);
        angers.setNeighbors(lemans,tours,poitiers);
        tours.setNeighbors(angers,lemans,orleans,bourges,poitiers);
        bourges.setNeighbors(limoges,tours,orleans);
        poitiers.setNeighbors(limoges,angouleme);
        limoges.setNeighbors(agen,angouleme,poitiers);
        angouleme.setNeighbors(poitiers,limoges,agen,bordeaux);
        bordeaux.setNeighbors(angouleme,agen,bayonne);
        agen.setNeighbors(toulouse,pau,bordeaux,angouleme,limoges);
        toulouse.setNeighbors(agen,pau);
        bayonne.setNeighbors(bordeaux,pau,sansebestian);
        pau.setNeighbors(pampelune,bayonne,agen,toulouse);
        sansebestian.setNeighbors(bayonne,pampelune,bilbao);
        pampelune.setNeighbors(bilbao,sansebestian,pau);
        bilbao.setNeighbors(sansebestian,pampelune);

        /* ** Ceci répond à la question 2.d mais la question 2.e nous oblige à le supprimer, je le laisse en commentaire pour vous montrer comment j'ai procédé. **

        // On appel d'abord la distance de chaque ville pour comparer ensuite à la méthode removeMin() pour voir si la méthode fonctionne.

        System.out.println(evry.getName() + " : " + evry.getDistance());
        System.out.println(paris.getName() + " : " + paris.getDistance());
        System.out.println(orleans.getName() + " : " + orleans.getDistance() + "\n");


        // On crée un objet de type LocationSet et on lui ajoute les villes qu'on veut comparer.

        LocationSet test = new LocationSet();

        test.add(evry);
        test.add(paris);
        test.add(orleans);

        // On affiche les villes avec leur distance par ordre croissant.

        for(Location cur =test.removeMin(); cur!=null; cur=test.removeMin()){
            cur.display();
            System.out.println(cur.getName() + " = distance: " + cur.getDistance());
        }
        */

        // On appel la méthode findPathTo pour trouver le chemin le plus court entre deux villes.
        evry.findPathTo(bilbao);
        bilbao.findPathTo(evry);
        angers.findPathTo(toulouse);

    }
}