# La règle 'all' est la règle par défaut qui dépend des règles 'compile' et 'run'.
# Lorsque vous exécutez simplement 'make', cette règle sera exécutée.
all: compile run

# La règle 'compile' compile les fichiers .java du répertoire 'src/ensiie/ast/'
# et place les fichiers .class dans le répertoire 'build'.
compile:
	@javac -d build src/ensiie/ast/*.java

# La règle 'run' exécute la classe principale 'ensiie.ast.Main' en utilisant les
# fichiers .class du répertoire 'build'.
run:
	@java -cp build ensiie.ast.Main

# La règle 'javadoc' génère la documentation Javadoc pour les fichiers .java
# situés dans le répertoire 'src/ensiie/ast/'.
javadoc:
	@javadoc -d documentation src/ensiie/ast/*.java

# La règle 'clean' supprime tous les fichiers .class du répertoire 'build'
# et le répertoire 'documentation'.
clean:
	@rm -r build/*
	@rm -r documentation
