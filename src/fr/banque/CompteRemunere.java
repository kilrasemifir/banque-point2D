package fr.banque;

public class CompteRemunere extends Compte implements ICompteRemunere{
	
	private double taux;
	
	public CompteRemunere(int numero, double solde, double taux) {
		super( solde, numero );
		this.taux = taux;
	}
	
	public CompteRemunere(int numero, double taux) {
		this(numero, 0.0, taux);
	}
	
	public double getTaux() {
		return this.taux;
	}
	
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	public double calculerInterets() {
		return this.taux * this.getSolde();
	}
	
	public void verserInterets() {
		this.ajouter(this.calculerInterets());
	}

	@Override
	public String toString() {
		return "CompteRemunere ["+ "numero=" + getNumero() +  ", solde=" + getSolde()  +  ", taux=" + taux + "]";
	}
	
	
}
