package ensiie.ast;

/**
 * La classe Operation est une classe abstraite représentant une opération générique dans l'arbre d'expression.
 * Elle implémente l'interface Node et sert de base pour les classes d'opérations spécifiques.
 */
public abstract class Operation implements Node {
    private Node[] ops;

    /**
     * Constructeur de la classe Operation.
     * Initialise les opérandes de l'opération.
     * @param ops les opérandes de l'opération.
     */
    public Operation(Node... ops) {
        this.ops = ops;
    }

    /**
     * Retourne l'opérande à la position donnée.
     * @param i l'index de l'opérande à récupérer.
     * @return le nœud à la position i dans les opérandes.
     */
    public Node op(int i) {
        return ops[i];
    }

    /**
     * Retourne le nombre d'opérandes de l'opération.
     * @return le nombre d'opérandes.
     */
    public int nbOps() {
        return ops.length;
    }

    /**
     * Retourne une chaîne de caractères représentant le symbole de l'opération.
     * Cette méthode doit être implémentée par les classes dérivées.
     * @return le symbole de l'opération.
     */
    public abstract String opString();

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'opération et de ses opérandes.
     * @return la représentation sous forme de chaîne de caractères de l'opération et de ses opérandes.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(opString());
        for (int i = 0; i < nbOps(); i++) {
            sb.append(" ").append(op(i).toString());
        }
        sb.append(")");
        return sb.toString();
    }

}
