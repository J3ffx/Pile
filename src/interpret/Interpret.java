package interpret;
import java.util.ArrayList;

import piling.Pile;

public class Interpret {
	private String code;
	private ArrayList<String> list;
	private Pile pile;
	
	public String[] analyse(String code) {
		String[]words = code.split(" ");
		return words;
	}
	
	public boolean estValeur(String s) {
		try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
	
	public int valeur(String s) {
		return Integer.parseInt(s); 
	}
	
	public void evaluate(String code) {
		
	}
	
	

}
