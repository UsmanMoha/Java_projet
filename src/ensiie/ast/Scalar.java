package ensiie.ast;

/**
 * La classe Scalar représente un scalaire dans l'arbre d'expression.
 * Elle implémente l'interface Node et est responsable de stocker et d'exécuter une valeur entière.
 */
public class Scalar implements Node {
    private int value;

    /**
     * Constructeur de la classe Scalar.
     * Initialise la valeur du scalaire.
     * @param value la valeur entière du scalaire.
     */
    public Scalar(int value) {
        this.value = value;
    }

    /**
     * Exécute le nœud scalaire en renvoyant sa valeur.
     * @return la valeur entière du scalaire.
     */
    @Override
    public int execute() {
        return this.value;
    }

    /**
     * Récupère la valeur du scalaire.
     * @return la valeur entière du scalaire.
     */
    public int get() {
        return this.value;
    }

    /**
     * Modifie la valeur du scalaire.
     * @param value la nouvelle valeur entière du scalaire.
     */
    public void set(int value) {
        this.value = value;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du scalaire.
     * @return la représentation sous forme de chaîne de caractères de la valeur entière du scalaire.
     */
    public String toString() {
        return Integer.toString(this.value);
    }
}
