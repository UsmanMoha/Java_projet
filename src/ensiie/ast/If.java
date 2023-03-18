package ensiie.ast;

/**
 * La classe If représente une structure conditionnelle dans l'arbre d'expression.
 * Elle hérite de la classe Operation et permet d'évaluer une condition puis d'exécuter l'un des deux sous-arbres en fonction du résultat.
 */
public class If extends Operation {
    
    /**
     * Constructeur de la classe If.
     * Initialise la condition, le sous-arbre à exécuter si la condition est vraie et le sous-arbre à exécuter si la condition est fausse.
     * @param condition le nœud représentant la condition à évaluer.
     * @param ifTrue le nœud à exécuter si la condition est vraie (non nulle).
     * @param ifFalse le nœud à exécuter si la condition est fausse (nulle).
     */
    public If(Node condition, Node ifTrue, Node ifFalse) {
        super(condition, ifTrue, ifFalse);
    }

    /**
     * Retourne la chaîne de caractères représentant l'opération "if".
     * @return la chaîne de caractères "if" représentant la structure conditionnelle.
     */
    @Override
    public String opString() {
        return "if";
    }

    /**
     * Exécute la structure conditionnelle en évaluant la condition et exécutant le sous-arbre approprié en fonction du résultat.
     * @return le résultat de l'évaluation du sous-arbre approprié.
     */
    @Override
    public int execute() {
        return op(0).execute() != 0 ? op(1).execute() : op(2).execute();
    }
}
