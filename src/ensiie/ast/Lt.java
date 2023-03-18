package ensiie.ast;

/**
 * La classe Lt (Less Than) représente une opération "inférieur à" dans l'arbre d'expression.
 * Elle hérite de la classe abstraite Operation et compare deux nœuds pour déterminer si le nœud de gauche est inférieur au nœud de droite.
 */
public class Lt extends Operation {
    
    /**
     * Constructeur de la classe Lt.
     * Initialise les opérandes pour l'opération de comparaison.
     * @param left le premier nœud de l'arbre d'expression (opérande gauche).
     * @param right le second nœud de l'arbre d'expression (opérande droite).
     */
    public Lt(Node left, Node right) {
        super(left, right);
    }

    /**
     * Retourne la chaîne de caractères représentant l'opération "inférieur à".
     * @return la chaîne de caractères "&lt;" représentant l'opération "inférieur à".
     */
    @Override
    public String opString() {
        return "<";
    }

    /**
     * Exécute l'opération de comparaison "inférieur à" et renvoie 1 si l'opérande gauche est inférieure à l'opérande droite, sinon renvoie 0.
     * @return le résultat de la comparaison sous forme d'entier (1 si vrai, 0 si faux).
     */
    @Override
    public int execute() {
        return op(0).execute() < op(1).execute() ? 1 : 0;
    }
}
