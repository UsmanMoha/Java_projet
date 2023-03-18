Class Location : 

    La classe Location représente une ville ou un emplacement dans un système de navigation. Elle comporte plusieurs attributs pour stocker les informations sur la ville, telles que son nom, sa latitude, sa longitude, les villes voisines, la distance totale pour atteindre cette ville à partir de l'origine et la ville d'où vient la ville actuelle.

    La classe comporte également plusieurs méthodes qui effectuent différentes opérations sur les informations stockées. Les méthodes incluent :

        - display() : retourne les champs name, latitude et longitude sous forme de chaîne de caractères.

        - distanceTo(Location to) : retourne le calcul de la distance en kilomètres entre la ville actuelle et la ville donnée en entrée.

        - getDistance() : retourne la distance cumulée pour atteindre la ville à partir de l’origine.

        - proceedNode(LocationSet set) : met à jour la distance minimale pour les voisins d'un noeud visité.

        - findPathTo(Location to) : affiche le plus court chemin pour aller de la ville actuelle à la ville donnée en entrée.

        - reinit() : réinitialise les distances et les chemins pour toutes les villes.

    En utilisant ces méthodes, la classe Location peut être utilisée pour trouver le plus court chemin entre deux villes.

    Cela est dû aussi en parti grâce à La méthode findPathTo(Location to) qui utilise une approche de recherche de plus court chemin pour trouver le chemin le plus court entre la ville actuelle et la ville donnée en entrée.

    La méthode utilise une approche de recherche en largeur en utilisant un ensemble LocationSet pour stocker les villes à visiter. Elle définit la distance totale pour atteindre la ville actuelle à 0 et ajoute la ville actuelle à l'ensemble LocationSet.

    Ensuite, elle boucle jusqu'à ce que l'ensemble LocationSet soit vide. À chaque itération, elle retire la ville avec la distance minimale de l'ensemble LocationSet et la traite en appelant la méthode proceedNode(LocationSet set). Si la ville retirée est la ville de destination, le chemin est trouvé et la boucle est interrompue. Si la ville retirée est nulle, cela signifie qu'il n'y a pas de chemin entre les deux villes et la méthode retourne un message disant qu'il n'y a pas de chemin possible.

    Puis, une fois que le chemin est trouvé, la méthode affiche le chemin en suivant les références de la ville from de chaque ville jusqu'à ce qu'elle arrive à la ville d'origine.

    En effet elle utilise l'algorithme de Dijkstra pour trouver le plus court chemin entre deux villes.

    L'algorithme de Dijkstra est un algorithme de recherche de plus court chemin qui utilise une approche de recherche en largeur pour trouver le plus court chemin entre un point de départ et un point d'arrivée dans un graphe pondéré. Il maintient une file d'attente des nœuds à visiter en ordre croissant de leur distance à partir du point de départ, et il met à jour les distances des nœuds voisins lorsqu'ils sont visités.

    Dans ce cas, chaque ville est considérée comme un nœud dans un graphe pondéré, et la distance entre les villes est déterminée en utilisant la méthode distanceTo(Location to). L'algorithme de Dijkstra est utilisé pour trouver le plus court chemin entre la ville actuelle et la ville donnée en entrée en examinant les distances pour chaque ville et en mettant à jour les distances pour les villes voisines lorsqu'elles sont visitées.

    En utilisant l'algorithme de Dijkstra, la méthode findPathTo(Location to) peut trouver le plus court chemin entre deux villes de manière efficace et garantir que le plus court chemin sera trouvé.


Classe LocationSet : 

    La classe LocationSet est une classe qui définit un ensemble de villes (objets de type Location). Elle a plusieurs attributs :

        - locations qui est un tableau d'objets de type Location qui stocke les villes dans l'ensemble.

        - nbLocations qui est un entier qui stocke le nombre de villes dans l'ensemble.

    La classe définit également plusieurs méthodes :

        - add(Location location) qui permet d'ajouter une ville (objet de type Location) dans l'ensemble.

        - removeMin() qui permet de retirer et renvoyer la ville avec la distance minimale (calculée par l'algorithme de Dijkstra) dans l'ensemble.

        - Les méthodes getLocations(), getNbLocations(), setLocations(Location[] locations), setNbLocations(int nbLocations) qui sont des getters et setters pour les attributs de la classe.

    L'objectif principal de cette classe est d'être utilisée pour implémenter l'algorithme de Dijkstra pour trouver le plus court chemin entre deux villes. Elle maintient une liste de toutes les villes qui n'ont pas encore été visitées et permet de trouver rapidement la ville avec la distance minimale pour la visiter ensuite.

Classe Main : 

    La classe Main est là pour tester les mèthodes de la classe Location et LocationSet.