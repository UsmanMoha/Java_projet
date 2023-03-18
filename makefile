compile: 

	@javac -d build/ src/*.java

run: 

	@java -cp build/ 

clean:

	@rm -r build/*