package ensiie.ast;

/**
 * La classe Set hérite de la classe Operation et représente l'opération d'affectation
 * d'une valeur à une variable dans l'arbre d'expression.
 */
public class Set extends Operation {
    /**
     * Construit un objet Set avec une variable et une valeur.
     * @param variable le noeud de la variable à laquelle la valeur doit être affectée.
     * @param value le noeud représentant la valeur à affecter à la variable.
     */
    public Set(Node variable, Node value) {
        super(variable, value);
    }

    /**
     * Retourne la chaîne de caractères représentant l'opération d'affectation.
     * @return la chaîne "set!".
     */
    @Override
    public String opString() {
        return "set!";
    }

    /**
     * Exécute l'opération d'affectation et retourne la valeur affectée à la variable.
     * @return la valeur affectée à la variable.
     */
    @Override
    public int execute() {
        int value = op(1).execute();
        ((Variable) op(0)).set(value);
        return value;
    }
}
