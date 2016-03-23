package arbrebinaire;

/**
 * Created by gaetan on 23/03/16.
 */
public class VisitorCalcul implements Visitor {

    public int resultat;

    @Override
    public void visitMultiplication(Multiplication m) {
        m.getOpG().accept(this);
        int opG = this.resultat;
        m.getOpD().accept(this);
        this.resultat *= opG;
    }

    @Override
    public void visitNegation(Negation n) {
        n.getOpG().accept(this);
        this.resultat *= (-1);
    }

    @Override
    public void visitAddition(Addition a) {
        a.getOpG().accept(this);
        int opG = this.resultat;
        a.getOpD().accept(this);
        this.resultat += opG;
    }

    @Override
    public void visitConstante(Constante c) {
        this.resultat = c.getValeur();
    }

    public int getResultat(){
        return this.resultat;
    }
}
