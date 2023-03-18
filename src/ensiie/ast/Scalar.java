package ensiie.ast;

public class Scalar implements Node{
    private int value;

    public Scalar(int value){
        this.value = value;
    }

    public int get(){
        return this.value;
    }

    public int execute(){
        return this.value;
    }

    public String toString(){
        return Integer.toString(this.value);
    }
}
