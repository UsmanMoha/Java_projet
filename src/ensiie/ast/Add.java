package ensiie.ast;

public class Add implements Node {
    private Node left;
    private Node right;

    public Add(Node left, Node right){
        this.left = left;
        this.right = right;
    }

    /* **Demandé lors de l'exercice 1**

    public int execute(){
        return left.get() + right.get();
    }

    public String toString(){
        return "(+ " + left.get() + " "+ right.get() + ")";
    }
    */

    public int execute(){
        return left.execute() + right.execute();
    }

    public String toString(){
        return "(+ " + left.toString() + " "+ right.toString() + ")";
    }

}
