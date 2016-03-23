package arbrebinaire;

/**
 * Created by gaetan on 23/03/16.
 */
public class VisitorHauteur implements Visitor {
    public int hauteur;

    @Override
    public void visitMultiplication(Multiplication m) {
        m.getOpG().accept(this);
        int opG = this.hauteur;
        m.getOpD().accept(this);
        if(this.hauteur<opG)
            hauteur = opG;
        hauteur ++;
    }

    @Override
    public void visitNegation(Negation n) {
        n.getOpG().accept(this);
        hauteur++;
    }

    @Override
    public void visitAddition(Addition a) {
        a.getOpG().accept(this);
        int opG = this.hauteur;
        a.getOpD().accept(this);
        if(this.hauteur<opG)
            hauteur = opG;
        hauteur ++;
    }

    @Override
    public void visitConstante(Constante c) {
        this.hauteur = 1;
    }
}
