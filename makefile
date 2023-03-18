all: compile run

compile: 

	@javac -d build src/ensiie/ast/*.java
	
run:

	@java -cp build ensiie.ast.Main
