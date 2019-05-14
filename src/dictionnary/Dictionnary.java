package dictionnary;

import java.util.TreeMap;

public class Dictionnary {
	private TreeMap<String, String> dico;

	public Dictionnary() {
		this.dico = new TreeMap<String, String>();
		this.dico.put("CARRE", "DUP MULT");
		this.dico.put("CUBE", "DUP CARRE MULT");
		this.dico.put("INC", "1 PLUS");
		this.dico.put("DEC", "-1 PLUS");
		this.dico.put("MOINS", "-1 MULT PLUS");

	}

	public String analyse(String key) {

		String instruction = dico.get(key);
		return instruction;
	}

}
