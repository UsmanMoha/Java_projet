package ensiie.ast;

public class Main {
    public static void main(String[] args){
        Scalar scalar = new Scalar(1);

        System.out.println(scalar.toString());

        Scalar scalar2 = new Scalar(2);

        Add addition = new Add(scalar, scalar2);

        System.out.println(addition.toString());
        System.out.println(addition.execute());

        Node n1 = new Scalar(1);
        Node n2 = new Scalar(2);
        Node n3 = new Add(n1, n2);
        Node n4 = new Scalar(3);
        Node n5 = new Scalar(4);
        Node n6 = new Add(n4, n5);
        Node n7 = new Add(n3, n6);

        // Print the expression and its evaluation
        System.out.println(n7.toString());
        System.out.println(n7.execute());

        // Dans la méthode main
        Variable x = new Variable("x");
        System.out.println(new Add(x, new Scalar(20)));
        System.out.println(new Add(x, new Scalar(20)).execute());

    }
}