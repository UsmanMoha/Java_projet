package ensiie.ast;

/**
 * La classe Neg représente l'opération de négation dans l'arbre d'expression.
 * Elle hérite de la classe Operation et permet d'inverser le signe de l'opérande.
 */
public class Neg extends Operation {
    /**
     * Constructeur de la classe Neg.
     * Initialise l'opérande pour l'opération de négation.
     * @param operand le nœud de l'arbre d'expression représentant l'opérande.
     */
    public Neg(Node operand) {
        super(operand);
    }

    /**
     * Retourne la chaîne de caractères représentant l'opération de négation.
     * @return la chaîne de caractères "-" représentant l'opération de négation.
     */
    @Override
    public String opString() {
        return "-";
    }

    /**
     * Exécute l'opération de négation en inversant le signe de l'opérande.
     * @return le résultat de la négation de l'opérande.
     */
    @Override
    public int execute() {
        return -op(0).execute();
    }
}
