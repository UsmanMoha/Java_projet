package ensiie.ast;

/**
 * L'interface Node représente un nœud générique dans l'arbre d'expression.
 * Elle sert de base pour les classes d'opérations et les scalaires.
 */
public interface Node {
    /**
     * Exécute le nœud et retourne le résultat.
     * Cette méthode doit être implémentée par les classes qui implémentent cette interface.
     * @return le résultat de l'exécution du nœud.
     */
    int execute();
}
