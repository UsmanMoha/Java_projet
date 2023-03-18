package ensiie.ast;

/**
 * La classe Echo représente une opération d'affichage dans l'arbre d'expression.
 * Elle hérite de la classe Operation et permet d'afficher le résultat de l'évaluation d'une expression.
 */
public class Echo extends Operation {
    
    /**
     * Constructeur de la classe Echo.
     * Initialise l'expression à évaluer et à afficher.
     * @param expr le nœud représentant l'expression à évaluer et à afficher.
     */
    public Echo(Node expr) {
        super(expr);
    } 

    /**
     * Retourne la chaîne de caractères représentant l'opération "echo".
     * @return la chaîne de caractères "echo" représentant l'opération d'affichage.
     */
    @Override
    public String opString() {
        return "echo";
    }

    /**
     * Exécute l'opération d'affichage en évaluant l'expression et en affichant le résultat.
     * @return le résultat de l'évaluation de l'expression.
     */
    @Override
    public int execute() {
        int result = op(0).execute();
        System.out.println(result);
        return result;
    }
}
