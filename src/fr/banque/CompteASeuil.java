package fr.banque;

import fr.banque.exceptions.BanqueException;

public class CompteASeuil extends Compte{

	private double seuil;
	
	public CompteASeuil(int numero, double solde, double seuil) {
		super(solde, numero);
		this.seuil = seuil;
	}
	
	public double getSeuil() {
		return this.seuil;
	}
	
	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}
	
	@Override
	public void retirer(double uneValeur){
		if (this.getSolde() - uneValeur > this.seuil) {
			super.retirer(uneValeur);
		}else {
			throw new RuntimeException();
		}
	}
	
	@Override
	public String toString() {
		return "CompteASeuil [numero="+this.getNumero()+", solde="+this.getSolde()+", seuil="+this.seuil+"]";
	}
}
