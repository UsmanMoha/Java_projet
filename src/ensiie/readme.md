# Classe Scalar

La classe `Scalar` fait partie du package `ensiie.ast` et représente un nœud de type scalaire dans l'arbre d'expression. Elle implémente l'interface `Node` et est responsable de stocker et d'exécuter une valeur entière.

## Rôle et responsabilités

La classe `Scalar` a pour rôle principal de représenter une valeur entière constante dans l'arbre d'expression. Elle gère les opérations de base telles que l'exécution, la récupération et la modification de la valeur scalaire.

Les principales responsabilités de la classe `Scalar` sont :

- Stocker la valeur entière du scalaire.
- Fournir un constructeur pour initialiser la valeur du scalaire.
- Implémenter la méthode `execute()` de l'interface `Node` pour renvoyer la valeur du scalaire.
- Fournir des méthodes pour récupérer et modifier la valeur du scalaire.
- Fournir une représentation sous forme de chaîne de caractères du scalaire.

## Méthodes

La classe `Scalar` comprend les méthodes suivantes :

- `public Scalar(int value)`: Constructeur de la classe Scalar qui initialise la valeur du scalaire.
- `public int execute()`: Exécute le nœud scalaire en renvoyant sa valeur.
- `public int get()`: Récupère la valeur du scalaire.
- `public void set(int value)`: Modifie la valeur du scalaire.
- `public String toString()`: Retourne une représentation sous forme de chaîne de caractères du scalaire.

## Exemple d'utilisation

```java
Scalar scalar1 = new Scalar(5);    // Crée un nœud scalaire avec la valeur 5
int value = scalar1.execute();      // Exécute le nœud scalaire et renvoie la valeur 5
scalar1.set(10);                    // Modifie la valeur du nœud scalaire à 10
System.out.println(scalar1.toString()); // Retourne la représentation sous forme de chaîne de caractères "10"
```
---------------------------------------------------------------------------------------------------------------------------

# Classe Operation

La classe `Operation` fait partie du package `ensiie.ast` et est une classe abstraite qui représente une opération générique dans l'arbre d'expression. Elle implémente l'interface `Node` et sert de base pour les classes d'opérations spécifiques.

## Rôle et responsabilités

La classe `Operation` a pour rôle principal de représenter une opération générique dans l'arbre d'expression. Elle gère la gestion des opérandes et la représentation sous forme de chaîne de caractères de l'opération.

Les principales responsabilités de la classe `Operation` sont :

- Implémenter l'interface `Node`.
- Fournir un constructeur pour initialiser les opérandes de l'opération.
- Offrir des méthodes pour accéder et manipuler les opérandes.
- Fournir une représentation sous forme de chaîne de caractères de l'opération et de ses opérandes.

## Méthodes

La classe `Operation` comprend les méthodes suivantes :

- `public Operation(Node... ops)`: Constructeur de la classe Operation qui initialise les opérandes de l'opération.
- `public Node op(int i)`: Retourne l'opérande à la position donnée.
- `public int nbOps()`: Retourne le nombre d'opérandes de l'opération.
- `public abstract String opString()`: Méthode abstraite qui retourne une chaîne de caractères représentant le symbole de l'opération. Cette méthode doit être implémentée par les classes dérivées.
- `public String toString()`: Retourne une représentation sous forme de chaîne de caractères de l'opération et de ses opérandes.

## Classes dérivées

Les classes dérivées de `Operation` doivent implémenter la méthode `opString()` et, si nécessaire, redéfinir la méthode `execute()` pour fournir la logique d'exécution de l'opération spécifique.

Exemples de classes dérivées :

- `Add`: Représente une opération d'addition.
- `Sub`: Représente une opération de soustraction.
- `Mul`: Représente une opération de multiplication.
- `Div`: Représente une opération de division.

## Exemple d'utilisation

Puisque la classe `Operation` est abstraite, elle ne peut pas être instanciée directement. Cependant, voici un exemple d'utilisation avec la classe `Add` qui hérite de `Operation` :

```java
Node scalar1 = new Scalar(2);       // Crée un nœud scalaire avec la valeur 2
Node scalar2 = new Scalar(3);       // Crée un nœud scalaire avec la valeur 3
Add addition = new Add(scalar1, scalar2); // Crée un nœud d'addition avec les nœuds scalaires comme opérandes
System.out.println(addition.execute());    // Exécute l'opération d'addition et renvoie le résultat 5
System.out.println(addition.toString()); // Retourne la représentation sous forme de chaîne de caractères "(+ 2 3)"
```
---------------------------------------------------------------------------------------------------------------------------

# Interface Node

L'interface `Node` fait partie du package `ensiie.ast` et représente un nœud générique dans l'arbre d'expression. Elle sert de base pour les classes d'opérations et les scalaires.

## Rôle et responsabilités

L'interface `Node` a pour rôle principal de représenter un nœud générique dans l'arbre d'expression et de définir un contrat commun pour les classes d'opérations et les scalaires. 

Les principales responsabilités de l'interface `Node` sont :

- Définir la méthode `execute()` pour exécuter le nœud et retourner le résultat.

## Méthodes

L'interface `Node` comprend la méthode suivante :

- `int execute()`: Exécute le nœud et retourne le résultat. Cette méthode doit être implémentée par les classes qui implémentent cette interface.

## Exemple d'utilisation

Voici un exemple d'utilisation de l'interface `Node` avec la classe `Scalar` :

```java
Node scalarNode = new Scalar(42); // Crée un nœud Scalar avec la valeur 42

System.out.println(scalarNode.execute()); // Exécute le nœud et retourne le résultat (42)
```
L'interface Node peut également être utilisée avec d'autres classes, comme Operation et ses classes dérivées. Il est important de noter que l'interface Node est un contrat, et les classes qui implémentent cette interface doivent définir la méthode execute().

---------------------------------------------------------------------------------------------------------------------------

# Classe Add

La classe `Add` fait partie du package `ensiie.ast` et représente un nœud d'opération d'addition dans l'arbre d'expression. Elle hérite de la classe `Operation` et est responsable de l'exécution de l'opération d'addition entre deux nœuds.

## Rôle et responsabilités

La classe `Add` a pour rôle principal de représenter une opération d'addition entre deux nœuds dans l'arbre d'expression. Elle gère l'exécution de l'opération d'addition et la représentation sous forme de chaîne de caractères de l'opération.

Les principales responsabilités de la classe `Add` sont :

- Hériter de la classe `Operation`.
- Fournir un constructeur pour initialiser les opérandes gauche et droite de l'opération d'addition.
- Implémenter la méthode `execute()` pour exécuter l'opération d'addition et renvoyer le résultat.
- Fournir une représentation sous forme de chaîne de caractères de l'opération d'addition et de ses opérandes.
- Retourner le symbole de l'opération d'addition.

## Méthodes

La classe `Add` comprend les méthodes suivantes :

- `public Add(Node left, Node right)`: Constructeur de la classe Add qui initialise les opérandes gauche et droite de l'opération d'addition.
- `public int execute()`: Exécute l'opération d'addition et renvoie le résultat.
- `public String toString()`: Retourne une représentation sous forme de chaîne de caractères de l'opération d'addition et de ses opérandes.
- `public String opString()`: Retourne le symbole de l'opération d'addition.

## Exemple d'utilisation

```java
Node scalar1 = new Scalar(2);       // Crée un nœud scalaire avec la valeur 2
Node scalar2 = new Scalar(3);       // Crée un nœud scalaire avec la valeur 3
Add addition = new Add(scalar1, scalar2); // Crée un nœud d'addition avec les nœuds scalaires comme opérandes
System.out.println(addition.execute());    // Exécute l'opération d'addition et renvoie le résultat 5
System.out.println(addition.toString()); // Retourne la représentation sous forme de chaîne de caractères "(+ 2 3)"
```
---------------------------------------------------------------------------------------------------------------------------

# Classe Set

La classe `Set` fait partie du package `ensiie.ast` et hérite de la classe `Operation`. Elle représente l'opération d'affectation d'une valeur à une variable dans l'arbre d'expression.

## Rôle et responsabilités

La classe `Set` a pour rôle principal de représenter une opération d'affectation dans l'arbre d'expression. Elle gère l'affectation d'une valeur à une variable et l'exécution de l'opération d'affectation.

Les principales responsabilités de la classe `Set` sont :

- Fournir un constructeur pour initialiser la variable et la valeur à affecter.
- Implémenter la méthode `opString()` pour retourner le symbole de l'opération d'affectation.
- Redéfinir la méthode `execute()` pour effectuer l'affectation de la valeur à la variable.

## Méthodes

La classe `Set` comprend les méthodes suivantes :

- `public Set(Node variable, Node value)`: Constructeur de la classe Set qui initialise la variable et la valeur à affecter.
- `public String opString()`: Retourne la chaîne de caractères représentant l'opération d'affectation.
- `public int execute()`: Exécute l'opération d'affectation et retourne la valeur affectée à la variable.

## Exemple d'utilisation

Voici un exemple d'utilisation de la classe `Set` :

```java
Variable x = new Variable("x");    // Crée une variable x
Node scalar = new Scalar(10);      // Crée un nœud scalaire avec la valeur 10
Set setOperation = new Set(x, scalar); // Crée un nœud d'affectation pour affecter la valeur 10 à la variable x
System.out.println(setOperation.execute());   // Exécute l'opération d'affectation et retourne la valeur affectée (10)
System.out.println(setOperation.toString()); // Retourne la représentation sous forme de chaîne de caractères "(set! x 10)"
```
---------------------------------------------------------------------------------------------------------------------------

# Classe Variable

La classe `Variable` fait partie du package `ensiie.ast` et hérite de la classe `Scalar`. Elle représente une variable dans l'arbre d'expression.

## Rôle et responsabilités

La classe `Variable` a pour rôle principal de représenter une variable dans l'arbre d'expression. Elle gère le nom et la valeur d'une variable.

Les principales responsabilités de la classe `Variable` sont :

- Hériter de la classe `Scalar`.
- Fournir un constructeur pour initialiser le nom de la variable.
- Redéfinir la méthode `toString()` pour retourner le nom de la variable.

## Méthodes

La classe `Variable` comprend les méthodes suivantes :

- `public Variable(String name)`: Constructeur de la classe Variable qui initialise le nom de la variable et sa valeur à 0.
- `public String toString()`: Retourne une représentation sous forme de chaîne de caractères de la variable.

## Exemple d'utilisation

Voici un exemple d'utilisation de la classe `Variable` :

```java
Variable x = new Variable("x");    // Crée une variable x avec le nom "x" et la valeur 0
System.out.println(x.execute());   // Récupère la valeur de la variable (0)
System.out.println(x.toString());  // Retourne la représentation sous forme de chaîne de caractères "x"
```
---------------------------------------------------------------------------------------------------------------------------

# Classe Neg

La classe `Neg` fait partie du package `ensiie.ast` et hérite de la classe `Operation`. Elle représente l'opération de négation dans l'arbre d'expression.

## Rôle et responsabilités

La classe `Neg` a pour rôle principal de représenter l'opération de négation dans l'arbre d'expression. Elle permet d'inverser le signe de l'opérande.

Les principales responsabilités de la classe `Neg` sont :

- Hériter de la classe `Operation`.
- Fournir un constructeur pour initialiser l'opérande de l'opération de négation.
- Implémenter la méthode `opString()` pour retourner le symbole de l'opération de négation.
- Implémenter la méthode `execute()` pour exécuter l'opération de négation et renvoyer le résultat.

## Méthodes

La classe `Neg` comprend les méthodes suivantes :

- `public Neg(Node operand)`: Constructeur de la classe Neg qui initialise l'opérande pour l'opération de négation.
- `public String opString()`: Retourne la chaîne de caractères "-" représentant l'opération de négation.
- `public int execute()`: Exécute l'opération de négation en inversant le signe de l'opérande et retourne le résultat.

## Exemple d'utilisation

Voici un exemple d'utilisation de la classe `Neg` :

```java
Node operand = new Scalar(5);        // Crée une opérande avec la valeur 5
Neg negOperation = new Neg(operand); // Crée une opération de négation avec l'opérande 5
System.out.println(negOperation.execute()); // Exécute l'opération de négation et retourne le résultat (-5)
```
---------------------------------------------------------------------------------------------------------------------------

# Classe While

La classe `While` fait partie du package `ensiie.ast` et hérite de la classe `Operation`. Elle représente une boucle `while` dans l'arbre d'expression.

## Rôle et responsabilités

La classe `While` a pour rôle principal de représenter une boucle `while` dans l'arbre d'expression. Elle permet d'exécuter un morceau de code tant que la condition donnée est vraie (différente de 0).

Les principales responsabilités de la classe `While` sont :

- Hériter de la classe `Operation`.
- Fournir un constructeur pour initialiser la condition et le corps de la boucle `while`.
- Implémenter la méthode `opString()` pour retourner le symbole de l'opération de boucle `while`.
- Implémenter la méthode `execute()` pour exécuter la boucle `while` et renvoyer le résultat.

## Méthodes

La classe `While` comprend les méthodes suivantes :

- `public While(Node condition, Node body)`: Constructeur de la classe While qui initialise la condition et le corps de la boucle.
- `public String opString()`: Retourne la chaîne de caractères "while" représentant l'opération de boucle while.
- `public int execute()`: Exécute la boucle while, évalue la condition et exécute le corps de la boucle tant que la condition est vraie (différente de 0). Retourne la dernière valeur du corps exécuté ou 0 si le corps n'est jamais exécuté.

## Exemple d'utilisation

Voici un exemple d'utilisation de la classe `While` :

```java
Node condition = new Variable("x");
Node body = new Set(condition, new Add(condition, new Scalar(-1)));
While whileLoop = new While(condition, body); // Crée une boucle while avec une condition et un corps

// Pour utiliser la boucle while, initialisez d'abord la variable de la condition
((Variable) condition).set(5);

System.out.println(whileLoop.execute()); // Exécute la boucle while et retourne le résultat
```
---------------------------------------------------------------------------------------------------------------------------

# Classe Lt

La classe `Lt` (Less Than) fait partie du package `ensiie.ast` et hérite de la classe `Operation`. Elle représente une opération "inférieur à" dans l'arbre d'expression.

## Rôle et responsabilités

La classe `Lt` a pour rôle principal de représenter une opération de comparaison "inférieur à" dans l'arbre d'expression. Elle permet de comparer deux nœuds pour déterminer si le nœud de gauche est inférieur au nœud de droite.

Les principales responsabilités de la classe `Lt` sont :

- Hériter de la classe `Operation`.
- Fournir un constructeur pour initialiser les opérandes gauche et droite de l'opération de comparaison.
- Implémenter la méthode `opString()` pour retourner le symbole de l'opération "inférieur à".
- Implémenter la méthode `execute()` pour exécuter l'opération de comparaison et renvoyer le résultat.

## Méthodes

La classe `Lt` comprend les méthodes suivantes :

- `public Lt(Node left, Node right)`: Constructeur de la classe Lt qui initialise les opérandes pour l'opération de comparaison.
- `public String opString()`: Retourne la chaîne de caractères "<" représentant l'opération "inférieur à".
- `public int execute()`: Exécute l'opération de comparaison "inférieur à" et renvoie 1 si l'opérande gauche est inférieure à l'opérande droite, sinon renvoie 0.

## Exemple d'utilisation

Voici un exemple d'utilisation de la classe `Lt` :

```java
Node leftOperand = new Scalar(3);
Node rightOperand = new Scalar(5);
Lt ltOperation = new Lt(leftOperand, rightOperand); // Crée une opération "inférieur à" avec les opérandes gauche et droite

System.out.println(ltOperation.execute()); // Exécute l'opération de comparaison et retourne le résultat (1 si vrai, 0 si faux)
```
---------------------------------------------------------------------------------------------------------------------------

# Classe Echo

La classe `Echo` fait partie du package `ensiie.ast` et hérite de la classe `Operation`. Elle représente une opération d'affichage dans l'arbre d'expression.

## Rôle et responsabilités

La classe `Echo` a pour rôle principal de représenter une opération d'affichage dans l'arbre d'expression. Elle permet d'évaluer une expression et d'afficher le résultat de cette évaluation.

Les principales responsabilités de la classe `Echo` sont :

- Hériter de la classe `Operation`.
- Fournir un constructeur pour initialiser l'expression à évaluer et à afficher.
- Implémenter la méthode `opString()` pour retourner le symbole de l'opération "echo".
- Implémenter la méthode `execute()` pour exécuter l'opération d'affichage et renvoyer le résultat de l'évaluation.

## Méthodes

La classe `Echo` comprend les méthodes suivantes :

- `public Echo(Node expr)`: Constructeur de la classe Echo qui initialise l'expression à évaluer et à afficher.
- `public String opString()`: Retourne la chaîne de caractères "echo" représentant l'opération d'affichage.
- `public int execute()`: Exécute l'opération d'affichage en évaluant l'expression et en affichant le résultat.

## Exemple d'utilisation

Voici un exemple d'utilisation de la classe `Echo` :

```java
Node expression = new Scalar(42);
Echo echoOperation = new Echo(expression); // Crée une opération d'affichage avec l'expression à évaluer et à afficher

System.out.println(echoOperation.execute()); // Exécute l'opération d'affichage et affiche le résultat
```
---------------------------------------------------------------------------------------------------------------------------

# Classe If

La classe `If` fait partie du package `ensiie.ast` et hérite de la classe `Operation`. Elle représente une structure conditionnelle dans l'arbre d'expression.

## Rôle et responsabilités

La classe `If` a pour rôle principal de représenter une structure conditionnelle dans l'arbre d'expression. Elle permet d'évaluer une condition et d'exécuter l'un des deux sous-arbres en fonction du résultat de l'évaluation.

Les principales responsabilités de la classe `If` sont :

- Hériter de la classe `Operation`.
- Fournir un constructeur pour initialiser la condition, le sous-arbre à exécuter si la condition est vraie et le sous-arbre à exécuter si la condition est fausse.
- Implémenter la méthode `opString()` pour retourner le symbole de la structure conditionnelle "if".
- Implémenter la méthode `execute()` pour exécuter la structure conditionnelle et renvoyer le résultat de l'évaluation du sous-arbre approprié.

## Méthodes

La classe `If` comprend les méthodes suivantes :

- `public If(Node condition, Node ifTrue, Node ifFalse)`: Constructeur de la classe If qui initialise la condition, le sous-arbre à exécuter si la condition est vraie et le sous-arbre à exécuter si la condition est fausse.
- `public String opString()`: Retourne la chaîne de caractères "if" représentant la structure conditionnelle.
- `public int execute()`: Exécute la structure conditionnelle en évaluant la condition et exécutant le sous-arbre approprié en fonction du résultat.

## Exemple d'utilisation

Voici un exemple d'utilisation de la classe `If` :

```java
Node condition = new Lt(new Scalar(1), new Scalar(2));
Node ifTrue = new Scalar(42);
Node ifFalse = new Scalar(0);

If ifOperation = new If(condition, ifTrue, ifFalse); // Crée une structure conditionnelle avec la condition et les sous-arbres

System.out.println(ifOperation.execute()); // Exécute la structure conditionnelle et retourne le résultat
```
---------------------------------------------------------------------------------------------------------------------------

# Classe Begin

La classe `Begin` fait partie du package `ensiie.ast` et hérite de la classe `Operation`. Elle représente une séquence d'opérations dans l'arbre d'expression.

## Rôle et responsabilités

La classe `Begin` a pour rôle principal de représenter une séquence d'opérations dans l'arbre d'expression. Elle permet d'exécuter plusieurs nœuds dans un ordre donné.

Les principales responsabilités de la classe `Begin` sont :

- Hériter de la classe `Operation`.
- Fournir un constructeur pour initialiser les opérations à exécuter en séquence.
- Implémenter la méthode `opString()` pour retourner le symbole de la séquence d'opérations "begin".
- Implémenter la méthode `execute()` pour exécuter la séquence d'opérations et renvoyer le résultat de la dernière opération.

## Méthodes

La classe `Begin` comprend les méthodes suivantes :

- `public Begin(Node... ops)`: Constructeur de la classe Begin qui initialise les opérations à exécuter en séquence.
- `public String opString()`: Retourne la chaîne de caractères "begin" représentant la séquence d'opérations.
- `public int execute()`: Exécute la séquence d'opérations en évaluant chaque nœud dans l'ordre et renvoie le résultat de la dernière opération.

## Exemple d'utilisation

Voici un exemple d'utilisation de la classe `Begin` :

```java
Node op1 = new Scalar(1);
Node op2 = new Scalar(2);
Node op3 = new Scalar(3);

Begin beginOperation = new Begin(op1, op2, op3); // Crée une séquence d'opérations avec les nœuds donnés

System.out.println(beginOperation.execute()); // Exécute la séquence d'opérations et retourne le résultat de la dernière opération

```
---------------------------------------------------------------------------------------------------------------------------

# Classe Main

La classe `Main` fait partie du package `ensiie.ast` et illustre l'utilisation des classes et des méthodes implémentées pour les exercices du DM. Cette classe démontre comment créer et exécuter des expressions en utilisant les différentes classes Node et Operation ainsi que les Variables.

## Rôle et responsabilités

La classe `Main` a pour rôle principal de servir d'exemple d'utilisation des classes et des méthodes implémentées pour les exercices du DM. 

Les principales responsabilités de la classe `Main` sont :

- Créer et initialiser des objets `Node` et `Operation`.
- Exécuter et afficher les résultats des expressions créées.

## Méthodes

La classe `Main` contient une seule méthode principale :

- `public static void main(String[] args)`: Point d'entrée du programme. Cette méthode illustre l'utilisation des classes et des méthodes implémentées pour les exercices du DM.

## Exemple d'utilisation

La classe `Main` peut être exécutée directement pour voir les exemples d'utilisation des classes et méthodes du package `ensiie.ast`. Pour exécuter la classe `Main`, vous pouvez utiliser la commande suivante depuis la ligne de commande ou lancer le programme depuis un IDE :

make run

Cette commande exécutera le programme et affichera les résultats des différentes expressions définies dans la méthode `main`.

## Exemple complexe d'arbre d'opérations

L'exemple complexe affiche les valeurs intermédiaires de x pendant l'évaluation grâce à la classe Echo. Les valeurs intermédiaires de x seront affichées pour chaque itération de la boucle While jusqu'à ce que la condition x < y ne soit plus vraie.

L'évaluation de l'expression complexe donnera la somme de x et y à la fin de l'exécution. Pour connaître la valeur exacte de cette somme, il faut suivre les étapes de l'exemple :

    - x est initialisé à 0 et y à 10.
    - Tant que x est inférieur à y, effectue les actions suivantes :
        a. Si x est inférieur à 5, x est incrémenté de 1 : 1, 2, 3, 4, 5 (5 valeurs).
        b. Sinon, x est incrémenté de 2 : 7, 9, 11 (3 valeurs).
    - La boucle se termine lorsque x n'est plus inférieur à y (c'est-à-dire x >= 10). À ce stade,x vaut 11.
    - La dernière opération effectuée dans l'expression complexe est l'addition de x et y. La somme de x (11) et y (10) est égale à 21.

Ainsi, les valeurs intermédiaires affichées pendant l'évaluation sont 0, 1, 2, 3, 4, 5, 7, 9, 11 et l'évaluation de l'expression complexe est égale à 21.
