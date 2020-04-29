package fr;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import fr.banque.Client;
import fr.banque.Compte;
import fr.banque.CompteASeuil;
import fr.banque.CompteRemunere;
import fr.banque.CompteStatus;
import fr.banque.ICompte;
import fr.banque.exceptions.BanqueException;
import fr.point.Point2D;
import fr.point.Point3D;
import fr.point.Point3DBis;

public class Run {

	/**
	 * Exercice 2 a 5
	 */
	public static void point() {
		Point2D p;
		p = new Point2D();
		
		Point2D p2 = new Point2D(1,2);
		Point3D p3 = new Point3D(1,2,3);
		
		p3.translater(-1, -1, 2);
		
		p.translater(1, 1);
		
		p.afficher();
		p2.afficher();
		p3.afficher();
		
		System.out.println(p2 instanceof Point2D);
		System.out.println(Point2D.getCompteur());
		
		//TYPE[] <varName> = new TYPE[SIZE];
		Point2D[] tab = new Point2D[3];
	}
	
	public static void banque() {
		Client cli = new Client("Jean", "Jean", 30, 12343211);
		CompteRemunere cr = new CompteRemunere(1, 0.1);
		cr.ajouter(1_000_000);
		cr.verserInterets();
		cli.ajouterCompte(cr);
		cli.ajouterCompte(new Compte(2));
		ICompte cmpt = cli.getCompte(2);
		if (cmpt instanceof CompteRemunere)
			((CompteRemunere) cmpt).verserInterets();
		
	}
	
	
	
	public static void varargs() {
		print("Hello", "hi", "bye");
		print("","hello");
		print(new Object[] {"","hello","hi"});
		printf("%s %f", "hello", 78.0);
	}
	// Varargs
	public static void print(Object... strings) {
		for (Object string : strings) {
			System.out.println(string);
		}
	}
	
	public static void printf(String pattern, Object... strings ) {
		for (Object object : strings) {
			System.out.println(object.getClass().getSimpleName());
		}
		System.out.println(String.format(pattern, strings));
	}
	
	public static void main(String...strings) {
		collection();
		/*
		String a = "hello";
		a = foo(a);
		System.out.println(a);
		Integer i = 1;
		foo(i);
		System.out.println(i);
		Compte c = new Compte(1);
		System.out.println(c);
		foo(c);
		System.out.println(c);
		List<Integer> list = new ArrayList<>();
		list.add(1);
		*/
	}
	
	public static void wrapper() {
		// int 
		Integer i = 1;
		// long
		Long l = 1_000_000_000_000l;
		// float
		Float f = 0.3f;
		// double
		Double d = 0.0;
		// boolean
		Boolean b = true;
		// char
		Character c = 'c';
		//<Wrapper>
		
	}
	
	public static void collection() {
		// Ceversion string - int
		int i = Integer.parseInt("1");
		double d = Double.parseDouble(".0");
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		
		String str = "hello";
		String sb = new StringBuilder()
				.append("hello")
				.append(' ')
				.append("world")
				.toString();
		System.out.println(sb.toString());
		String s = "lsdjbfksjdfmjsdhmfoihdfù"
				+ "kfjhsdkfhmdslfhmsdfhpsd"
				+ "sdkfhsmlhfsldhfùskdf"
				+ "ldjfsldjfmjdhf:lkds"
				+ "lfdjhfmsldhkfmsdk"
				+ "mfksmhdlfknsd"
				+ "sdjflsdjfhmlsdhfùl"
				+ "blkdjfmskdjbfmsldk"
				+ "nfmlkdhsfmldksnf"
				+ "";
		
		String[] strs = new String[3];
		List<String> list = new ArrayList<String>();
		List<String[]> tabs = new ArrayList<String[]>();
		Set<String> set = new HashSet<String>();
		
		System.out.println(set.size());
		set.add("Hello");
		System.out.println(set.size());
		set.add("Hello");
		System.out.println(set.size());
		System.out.println(set);
		
		LocalDate ld = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		LocalDate ldd = ld.plusDays(34);
		System.out.println(ldd);
		
		Map<String, Integer> map = new HashMap<>();
		map.put(" ", 12345);
		map.put("jean", 234);
		
		int id = map.get("jean");
		System.out.println("id "+id);
		
	}
	
	public static void foo(Compte c) {
		c.ajouter(1_000);
	}
	
	public static void foo(int i) {
		i = i+1;
		System.out.println(i);
	}
	
	public static String foo(String str) {
		str += "!!!";
		return str;
	}

}
