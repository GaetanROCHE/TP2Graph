package arbrebinaire;

public class Multiplication extends OperateurBinaire{

	public Multiplication( Noeud ng, Noeud nd) {
		super("*", ng, nd);
	}


	@Override
	public void accept(Visitor V) {
		V.visitMultiplication(this);
	}
}
