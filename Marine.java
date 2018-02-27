package projet1;

import java.util.Scanner;

public class Marine {	
public static void main(String[] args) {
	
	/*
	System.out.println("Hello");
	System.out.println("Hello2");

	String phrase;
	phrase = "un test par ci, un test par là";
	System.out.println(phrase);
	
	int nbre1 = 3;
	System.out.println(nbre1);
	nbre1--;
	System.out.println(nbre1);
	String j = new String ();
	j = j.valueOf(nbre1);
	
	double nb = 100_000_000;
	System.out.println(nb);
	*/
	
	/*	 
	Scanner test = new Scanner(System.in);
	System.out.println("Taper un mot: ");
	String resultat = test.nextLine();
	char caractere = resultat.charAt(2);
	System.out.println("Vous avez saisi: " + caractere);	
	*/
	
	
	// Chapitre 4 Les conditions
	int i;
	Scanner value = new Scanner(System.in);
	System.out.println("Entrez une valeur pour i: ");
	String resultat = value.nextLine();
	int resultatInt = Integer.parseInt(resultat);
		
	if(resultatInt<10)
	{
		System.out.println("yes!");		
	}
	else {
		System.out.println("Out of range");		
	}	
}
}


