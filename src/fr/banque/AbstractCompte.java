package fr.banque;

public abstract class AbstractCompte implements ICompte {

	protected double solde;
	protected int numero;

	public double getSolde() {
		return solde;
	}

	public int getNumero() {
		return numero;
	}
}
