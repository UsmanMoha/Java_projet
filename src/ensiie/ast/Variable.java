package ensiie.ast;

public class Variable extends Scalar {
    private String name;

    public Variable(String name) {
        super(0);
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

