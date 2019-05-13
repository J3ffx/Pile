package dictionnaire;

import java.util.HashMap;
import java.util.TreeMap;

import piling.Pile;

public class Dictionnaire {
	private TreeMap<String,String> dico;
	
	public Dictionnaire() {
		this.dico = new TreeMap<String,String>();
		this.dico.put("CARRE","DUP MULT");
	
	}
	
	public String analyse(String key) {
		
		String instruction = dico.get(key);
		return instruction;
	}
	
}
