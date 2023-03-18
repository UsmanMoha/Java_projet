package ensiie.ast;

/**
 * La classe Main illustre l'utilisation des classes et des méthodes
 * implémentées pour les exercices du DM.
 * Cette classe démontre comment créer et exécuter des expressions en utilisant
 * les différentes classes Node et Operation ainsi que les Variables.
 */
public class Main {
    
    /**
     * Point d'entrée du programme.
     * Cette méthode illustre l'utilisation des classes et des méthodes
     * implémentées pour les exercices du DM.
     * @param args les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args){

        System.out.println("Demander pour l'exercice 1.b :");
        Scalar scalar1 = new Scalar(1);
        System.out.println(scalar1.toString() + "\n");

        System.out.println("Demander pour l'exercice 1.c :");
        Scalar scalar2 = new Scalar(2);
        Add addition = new Add(scalar1, scalar2);
        System.out.println(addition.toString());
        System.out.println(addition.execute() + "\n");

        System.out.println("Vérification pour savoir si on peut toujours calculer la somme de 1 et 2 :");
        Node addition2 = new Add(scalar1, scalar2);
        System.out.println(addition2.toString());
        System.out.println(addition2.execute() + "\n");

        System.out.println("Demander pour l'exercice 2.d :");
        Node scalar3 = new Scalar(3);
        Node scalar4 = new Scalar(4);

        Node nestedAddition1 = new Add(scalar1, scalar2);
        Node nestedAddition2 = new Add(scalar3, scalar4);
        Node finalAddition = new Add(nestedAddition1, nestedAddition2);

        System.out.println(finalAddition.toString());
        System.out.println(finalAddition.execute() + "\n");

        System.out.println("Demander pour l'exercice 3.f :");
        Node newScalar1 = new Scalar(1);
        Node newScalar2 = new Scalar(2);
        Node newScalar3 = new Scalar(3);
        Node newScalar4 = new Scalar(4);

        Node newNestedAddition1 = new Add(newScalar1, newScalar2);
        Node newNestedAddition2 = new Add(newScalar3, newScalar4);
        Node negNestedAddition2 = new Neg(newNestedAddition2);
        Node finalExpression = new Add(newNestedAddition1, negNestedAddition2);

        System.out.println(finalExpression.toString());
        System.out.println(finalExpression.execute() + "\n");

        System.out.println("Demander pour l'exercice 4.b :");
        Variable x = new Variable("x");
        Node scalar20 = new Scalar(20);

        Node expression = new Add(x, scalar20);
        System.out.println(expression.toString());
        System.out.println(expression.execute()  + "\n");

        System.out.println("Demander pour l'exercice 4.c :");
        Variable x2 = new Variable("x");
        Node newScalar20 = new Scalar(20);
        Node scalar22 = new Scalar(22);

        Node setExpression = new Set(x2, scalar22);
        System.out.println(setExpression.toString());
        System.out.println(setExpression.execute());

        Node addExpression = new Add(x2, newScalar20);
        System.out.println(addExpression.toString());
        System.out.println(addExpression.execute() + "\n");

        System.out.println("Demander pour l'exercice 5.a :");
        Node echoExpression = new Add(new Echo(new Add(new Scalar(1), new Scalar(2))), new Scalar(7));
        System.out.println(echoExpression.toString());
        System.out.println("Résultat : " + echoExpression.execute() + "\n");

        System.out.println("Demander pour l'exercice 5.b :");
        Node ifExpression1 = new If(new Scalar(1), new Scalar(42), new Scalar(666));
        System.out.println(ifExpression1.toString());
        System.out.println("Résultat : " + ifExpression1.execute() + "\n");

        Node ifExpression2 = new If(new Scalar(0), new Scalar(42), new Scalar(666));
        System.out.println(ifExpression2.toString());
        System.out.println("Résultat : " + ifExpression2.execute() + "\n");

        System.out.println("Demander pour l'exercice 5.c :");
        Node beginExpression = new If(new Scalar(1),
                new Begin(
                        new Echo(new Scalar(0)),
                        new Scalar(42)
                ),
                new Scalar(666)
        );
        System.out.println(beginExpression.toString());
        System.out.println("Résultat : " + beginExpression.execute() + "\n");

        System.out.println("Demander pour l'exercice 5.d :");
        Node ltTrue = new Lt(new Scalar(1), new Scalar(2));
        Node ltFalse = new Lt(new Scalar(2), new Scalar(1));
        System.out.println(ltTrue.toString());
        System.out.println("Résultat : " + ltTrue.execute() + "\n");
        System.out.println(ltFalse.toString());
        System.out.println("Résultat : " + ltFalse.execute() + "\n");
      
        System.out.println("Demander pour l'exercice 5.e :");
        Variable x3 = new Variable("x");
        Node expression2 = new Begin(
            new Set(x3, new Scalar(0)),
            new While(
                new Lt(x3, new Scalar(10)),
                new Begin(
                    new Echo(x3),
                    new Set(x3, new Add(x3, new Scalar(1)))
                )
            )
        );

        System.out.println(expression2.toString());
        System.out.println("Résultat : " + expression2.execute() + "\n");
        System.out.println("Lors de l'exécution de ce code, le programme affiche les chiffres de 0 à 9 et le résultat final de l'évaluation est 10.\n");

        System.out.println("Exemple d'affichage d'un arbre d'opérations:");
        Variable xBis = new Variable("x");
        Node additionExpr = new Add(xBis, new Scalar(42));
        Node setExpr = new Set(xBis, additionExpr);
        System.out.println(setExpr.toString() + "\n");

        System.out.println("Exemple complexe d'arbre d'opérations :");

        Variable xBis2 = new Variable("x");
        Variable yBis2 = new Variable("y");

        Node complexExpression = new Begin(
            new Set(xBis2, new Scalar(0)),
            new Set(yBis2, new Scalar(10)),
            new While(
                new Lt(xBis2, yBis2),
                new Begin(
                    new Echo(xBis2),
                    new If(
                        new Lt(xBis2, new Scalar(5)),
                        new Set(xBis2, new Add(xBis2, new Scalar(1))),
                        new Set(xBis2, new Add(xBis2, new Scalar(2)))
                    )
                )
            ),
            new Echo(xBis2),
            new Add(xBis2, yBis2)
        );

        System.out.println(complexExpression.toString());
        System.out.println("Résultat : " + complexExpression.execute() + "\n");
        System.out.println("L'explication pour cette exemple complexe d'arbre d'opérations est disponible dans le README contenu dans le dossier src/ensiie section 'Classe Main'.\n");

    }
}