package ensiie.ast;

/**
 * La classe Begin représente une séquence d'opérations dans l'arbre d'expression.
 * Elle hérite de la classe Operation et permet d'exécuter plusieurs nœuds dans un ordre donné.
 */
public class Begin extends Operation {
    
    /**
     * Constructeur de la classe Begin.
     * Initialise les opérations à exécuter en séquence.
     * @param ops les nœuds de l'arbre d'expression à exécuter en séquence.
     */
    public Begin(Node... ops) {
        super(ops);
    }

    /**
     * Retourne la chaîne de caractères représentant l'opération "begin".
     * @return la chaîne de caractères "begin" représentant la séquence d'opérations.
     */
    @Override
    public String opString() {
        return "begin";
    }

    /**
     * Exécute la séquence d'opérations en évaluant chaque nœud dans l'ordre et renvoie le résultat de la dernière opération.
     * @return le résultat de la dernière opération exécutée.
     */
    @Override
    public int execute() {
        int result = 0;
        for (int i = 0; i < nbOps(); i++) {
            result = op(i).execute();
        }
        return result;
    }
}
