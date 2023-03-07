package it.polito.tdp.Lab01.model;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ParoleArray {
	
	ArrayList<String> elenco;
	
	public ParoleArray() {
		this.elenco= new ArrayList<String>();
	}
	
	public void addParola(String p) {
		this.elenco.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(elenco);
		return elenco;
	}
	
	public void reset() {
		this.elenco.clear();
	}
	
	public void cancellaParola(String parola) {
		ArrayList<String> copia = new ArrayList<String>(elenco);
		for(String s : elenco) {
    		if(s.equals(parola)) {
    			copia.remove(s);
    		}
    	}
		elenco = copia;
		
	}
}
