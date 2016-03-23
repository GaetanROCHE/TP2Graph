package arbrebinaire;

/**
 * Created by Gaëtan on 16/03/16.
 */
public interface Visitor {
    void visitMultiplication(Multiplication m);
    void visitNegation(Negation n);
    void visitAddition(Addition a);
    void visitConstante(Constante c);
}
