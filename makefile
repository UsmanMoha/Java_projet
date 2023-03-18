compile: 

	@javac -d build/ src/*.java

run: 

	@java -cp build/ LanceUnTour ${arg} ${args}

clean:

	@rm -r build/*