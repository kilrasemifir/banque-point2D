package fr.banque;

import fr.banque.exceptions.BanqueException;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteASeuil{

	private double seuil;
	
	public CompteASeuilRemunere(int numero, double taux, double seuil) {
		super(numero, taux);
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
			throw new BanqueException("Vous ne pouvez pas retirer autant d'argent");
		}
	}
	
	public String toString() {
		return "CompteASeuilRemunuere ["
				+ "numero="+this.getNumero()
				+ ", solde="+this.getSolde()
				+ ", seuil="+this.getSeuil()
				+ ", taux="+this.getTaux()
				+ "]";
	}

}
