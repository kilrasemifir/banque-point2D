package fr.banque;

import java.util.Arrays;

public class Client {

	// Attributes
	private String nom, prenom;
	private int age;
	private int numero;
	private ICompte[] comptes;
	
	// Constructeurs
	public Client(String nom, String prenom, int age, int numero) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
		this.comptes = new Compte[5];
	}
	
	// Getters/ Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumero() {
		return numero;
	}

	public ICompte[] getComptes() {
		return comptes;
	}
	
	// Methodes Metier
	public ICompte getCompte(int numero) {
		// TODO
		// Pour chaque compte de type Compte dans this.comptes
		// for (Compte compte: this.comptes){
		// 		// TODO
		// }
		//  <=>
		// Compte compte;
		// for (int i=0 ; i < this.comptes.length ; i++) {
		// 		compte = this.comptes[i];
		// 		// TODO
		// }
		// if (compte != null) {
		// 		// TODO
		// }
		for (ICompte compte : comptes) {
			if (compte != null && compte.getNumero()==numero) {
				return compte;
			}
		}
		System.out.println("Aucun compte de porte le numero "+ numero);
		
		return null;
		
	}
	
	public void ajouterCompte(ICompte compte) {
		for (int i=0; i< this.comptes.length; i++) {
			if (this.comptes[i] == null) {
				this.comptes[i] = compte;
				return;
			}
		}
		
		System.out.println("Vous ne pouvez posseder que 5 comptes");
	}
	
	// Methodes Objects
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", numero=" + numero + ", comptes="
				+ Arrays.toString(comptes) + "]";
	}
	
	
	
	
}
