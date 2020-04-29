package fr.banque;

import fr.banque.exceptions.BanqueException;

public class Compte implements ICompte{

	private double solde;
	private int numero;

	public Compte(int numero) {
		this(0.0, numero);
	}
	
	public Compte(double solde, int numero) {
		this.solde = solde;
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public int getNumero() {
		return numero;
	}
	
	public void ajouter(double s) {
		this.solde += s;
	}
	
	public void retirer(double s) throws BanqueException {
		this.solde -= s;
	}

	@Override
	public String toString() {
		return "Compte [solde=" + solde + ", numero=" + numero + "]";
	}
	
}
