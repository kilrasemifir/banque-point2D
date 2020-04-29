package fr.banque;

import fr.banque.exceptions.BanqueException;

public interface ICompte {

	public int getNumero();
	public void ajouter(double unMontant);
	public void retirer(double unMontant);
}
