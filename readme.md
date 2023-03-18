# Author : Usman Mohammad

# DM2 - Usman Mohammad 

Ce DM présente l'implémentation d'un ensemble de classes Java pour gérer des expressions arithmétiques et logiques en utilisant un arbre de syntaxe abstrait. Le fichier DM2_mohammad_usman.tar.gz contient l'ensemble des fichiers source, des classes et une interface, ainsi qu'un fichier Makefile pour faciliter la compilation et l'exécution du programme.

## Contenu DM2_usman_mohammad

Le dossier DM2_usman_mohammad contient les éléments suivants :

    Un dossier src/ensiie/ast qui contient les fichiers .java des classes et interface.
    Un dossier build qui contient les fichiers .class.
    Un fichier Makefile pour faciliter la compilation et l'exécution du programme.
    Deux fichier README.

## Classes Java

Voici la liste des classes Java contenues dans le dossier DM2_usman_mohammad :

    Main.java
    Scalar.java
    Node.java
    Add.java
    Operation.java
    Set.java
    Variable.java
    While.java
    Neg.java
    Lt.java
    If.java
    Echo.java
    Begin.java

## Décompresser le dossier DM2_usman_mohammad.tar.gz

Pour décompresser le dossier DM2_usman_mohammad.tar.gz, exécutez la commande suivante dans le terminal :

tar -xzf DM2_mohammad_usman.tar.gz

Cette commande extraira les fichiers et dossiers contenus dans le dossier DM2_usman_mohammad.tar.gz.

## Se déplacer dans le répertoire extrait

Pour vous déplacer dans le répertoire extrait, utilisez la commande cd :

cd (chemin)/DM2_mohammad_usman

## Utilisation du Makefile

Le fichier Makefile fourni avec le DM permet de faciliter la compilation et l'exécution du programme. Voici les commandes disponibles :

    make compile: Compile les fichiers source et génère les fichiers .class dans le dossier build.
    make run: Exécute le programme compilé.
    make javadoc: Génère la documentation des classes et de l'interface Java.
    make clean: Supprime les fichiers .class générés lors de la compilation et la documentation.

Exemple d'utilisation du Makefile pour compiler, exécuter, générer la documentation et nettoyer le projet :

make compile
make run
make javadoc
make clean

## Documentation des classes

Le répertoire src/ensiie contient un fichier README pour chaque classe et interface du projet. Ce fichier README détaillent le rôle, les responsabilités et les méthodes de chaque classe ou interface. Vous pouvez consulter ce fichier README pour mieux comprendre le fonctionnement de chaque classe et interface.

Outre le fichier README pour chaque classe et interface, vous pouvez également consulter la documentation générée par Javadoc pour obtenir des informations sur les classes, interfaces et méthodes.

Pour générer la documentation Javadoc, exécutez la commande suivante à partir du répertoire racine du projet :

make javadoc

Cette commande générera la documentation Javadoc dans un dossier nommé documentation. Pour accéder à la documentation Javadoc, ouvrez le fichier documentation/index.html dans votre navigateur Web.

Le README et la Javadoc offrent une explication complète du fonctionnement des classes, des rôles et des méthodes. Vous pouvez vous référer à ces sources pour comprendre en détail l'implémentation du projet.

## Conclusion

Je tiens à vous remercier Monsieur Honoré pour avoir conçu et proposé ce DM, car il m'a permis d'apprendre et de renforcer mes compétences en programmation Java.