package interpret;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import piling.Pile;

public class Interpret {
	private String code;
	private ArrayList<String> list;
	private Pile pile;

	public Interpret() {
		pile = new Pile();

	}

	public ArrayList<String> analyse(String code) {
		ArrayList<String> words = new ArrayList<String>();
		String[] word = code.split(" ");
		for (String elt : word)
			words.add(elt);
		return words;
	}

	public boolean estValeur(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		return true;
	}

	public int valeur(String s) {
		return Integer.parseInt(s);
	}

	public void evaluate() {
		this.list = analyse(code);
		for (String elt : this.list) {
			if (estValeur(elt)) {
				pile.empiler(valeur(elt));
			} else if (elt.equals("PLUS")) {
				pile.plus();
			} else if (elt.equals("MULT"))
				pile.mult();
			else {
				System.out.println(elt);
			}

		}

	}

	public void execute(String filename) throws IOException {
		FileReader file = new FileReader(filename);
		BufferedReader br = new BufferedReader(file);
		this.code = br.readLine();
		evaluate();
		pile.afficher();
		br.close();
	}
}
