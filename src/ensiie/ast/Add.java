package ensiie.ast;

/**
 * La classe Add représente une opération d'addition dans l'arbre d'expression.
 * Elle hérite de la classe Operation et est responsable de l'exécution de l'opération d'addition.
 */
public class Add extends Operation {
    // private Node left;
    // private Node right;

    /**
     * Constructeur de la classe Add.
     * Initialise les opérandes gauche et droite de l'opération d'addition.
     * @param left le nœud gauche de l'opération d'addition.
     * @param right le nœud droit de l'opération d'addition.
     */
    public Add(Node left, Node right) {
        super(left, right);
    }

    /**
     * Exécute l'opération d'addition et renvoie le résultat.
     * @return le résultat de l'addition des valeurs des nœuds gauche et droit.
     */
    @Override
    public int execute() {
        return op(0).execute() + op(1).execute();
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'opération d'addition.
     * @return la représentation sous forme de chaîne de caractères de l'opération d'addition et de ses opérandes.
     */
    @Override
    public String toString() {
        return "(" + opString() + " " + op(0).toString() + " " + op(1).toString() + ")";
    }

    /**
     * Retourne le symbole de l'opération d'addition.
     * @return le symbole "+" représentant l'opération d'addition.
     */
    @Override
    public String opString() {
        return "+";
    }
}
