package ensiie.ast;

/**
 * La classe Variable hérite de la classe Scalar et représente une variable
 * dans l'arbre d'expression.
 */
public class Variable extends Scalar {
    private String name;

    /**
     * Construit un objet Variable avec un nom et initialise sa valeur à 0.
     * @param name le nom de la variable.
     */
    public Variable(String name) {
        super(0);
        this.name = name;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de la variable.
     * @return le nom de la variable.
     */
    @Override
    public String toString() {
        return this.name;
    }
}
