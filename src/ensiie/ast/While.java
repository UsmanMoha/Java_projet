package ensiie.ast;

/**
 * La classe While hérite de la classe Operation et représente une boucle while
 * dans l'arbre d'expression. La boucle while est utilisée pour exécuter un
 * morceau de code tant que la condition donnée est vraie (différente de 0).
 */
public class While extends Operation {

    /**
     * Construit un objet While avec une condition et un corps de boucle.
     * @param condition le nœud représentant la condition de la boucle while.
     * @param body le nœud représentant le corps de la boucle while.
     */
    public While(Node condition, Node body) {
        super(condition, body);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'opération.
     * @return la chaîne "while".
     */
    @Override
    public String opString() {
        return "while";
    }

    /**
     * Exécute la boucle while. Évalue la condition et exécute le corps de la boucle
     * tant que la condition est vraie (différente de 0). Le résultat de l'exécution
     * de la boucle while est la dernière valeur du corps exécuté. Si le corps n'est
     * jamais exécuté, la méthode retourne 0.
     * @return la dernière valeur du corps exécuté ou 0 si le corps n'est jamais exécuté.
     */
    @Override
    public int execute() {
        int result = 0;
        while (op(0).execute() != 0) {
            result = op(1).execute();
        }
        return result;
    }
}
