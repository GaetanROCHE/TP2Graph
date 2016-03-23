package arbrebinaire;

/**
 * Created by gaetan on 16/03/16.
 */
public class VisitorPostfixe implements Visitor {
    @Override
    public void visitMultiplication(Multiplication m) {
        m.getOpG().accept(this);
        m.getOpD().accept(this);
        System.out.print(m.getOp());
    }

    @Override
    public void visitNegation(Negation n) {
        n.getOpG().accept(this);
        System.out.print(n.getOp());
    }

    @Override
    public void visitAddition(Addition a) {
        a.getOpG().accept(this);
        a.getOpD().accept(this);
        System.out.print(a.getOp());
    }

    @Override
    public void visitConstante(Constante c) {
        System.out.print(c.getValeur());
    }
}
