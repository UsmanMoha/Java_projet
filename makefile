# la commande "all" compile et lance le programme
all: compile run

# la commande "compile" crée un dossier class s'il n'existe pas et compile les fichiers .java dans le répertoire class
compile:
	@mkdir -p ensiie/class
	@javac -d ensiie/class ensiie/shortestpath/*.java 

# la commande "run" lance le programme contenu dans le fichier Main.java en utilisant le dossier class qui contient les fichiers .class
run:
	@java -cp ensiie/class ensiie.shortestpath.Main

# la commande "clean" supprime le dossier class
clean:
	@rm -rf ensiie/class
