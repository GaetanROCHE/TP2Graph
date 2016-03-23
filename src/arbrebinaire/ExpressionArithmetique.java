package arbrebinaire;

public class ExpressionArithmetique {
	private Noeud racine;
	
	public ExpressionArithmetique(Noeud racine){
		this.racine = racine;
	}

	public Noeud getRacine() {
		return racine;
	}

	public void afficherPostFixe() {
		System.out.println("\n postfixe:");
		Visitor v = new VisitorPostfixe();
		racine.accept(v);
	}

	public int calculerValeur() {
		VisitorCalcul v = new VisitorCalcul();
		racine.accept(v);
		return v.getResultat();
	}

	public int calculerHauteur() {
		VisitorHauteur v = new VisitorHauteur();
		racine.accept(v);
		return v.hauteur;
	}
	public void afficherInFixe() {
		System.out.println("\n infixe:");
		VisitorInfixe v = new VisitorInfixe();
		racine.accept(v);
		System.out.println(v.result);
	}
	
}
