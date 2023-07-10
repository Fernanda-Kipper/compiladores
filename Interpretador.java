import java.util.Stack;

public class Interpretador {
    Stack pilha;

    Interpretador(){
        this.pilha = new Stack();
    }

    public int run(ArvoreSintatica arv){
        if (arv instanceof Mult)
            return (run(((Mult) arv).arg1) * run(((Mult) arv).arg2));

        if (arv instanceof Soma)
            return (run(((Soma) arv).arg1) + run(((Soma) arv).arg2));

        if (arv instanceof Sub)
            return (run(((Sub) arv).arg1) - run(((Sub) arv).arg2));

        if (arv instanceof Div) {
            System.out.println("chegou na div");
            return (run(((Div) arv).arg1) / run(((Div) arv).arg2));
        }

        if (arv instanceof Num) {
            return ((Num) arv).num;
        }

        return 1;
    }
}
