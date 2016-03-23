package arbrebinaire;

/**
 * Created by gaetan on 16/03/16.
 */
public class VisitorInfixe implements Visitor {
    public String result;
    public String lastOp;

    @Override
    public void visitMultiplication(Multiplication m) {

        m.getOpG().accept(this);
        String opG = this.result;
        if(this.lastOp.equals("+"))
            opG = "(" + opG + ")";
        m.getOpD().accept(this);
        String opD = this.result;
        if(this.lastOp.equals("+"))
            opD = "(" + opD + ")";
        result = opG + m.getOp() + opD;
        this.lastOp = m.getOp();
    }

    @Override
    public void visitNegation(Negation n) {
        n.getOpG().accept(this);
        String opG = this.result;
        result = "(" + n.getOp() + opG + ")";
        lastOp = n.getOp();
    }

    @Override
    public void visitAddition(Addition a) {
        a.getOpG().accept(this);
        String opG = this.result;
        a.getOpD().accept(this);
        String opD = this.result;
        this.result = opG + a.getOp() + opD;
        lastOp = a.getOp();
    }

    @Override
    public void visitConstante(Constante c) {
        this.result = "" + c.getValeur();
        lastOp = "";
    }
}
