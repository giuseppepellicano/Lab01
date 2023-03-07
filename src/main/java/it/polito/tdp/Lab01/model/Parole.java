package it.polito.tdp.Lab01.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	LinkedList<String> elenco;
		
	public Parole() {
		this.elenco= new LinkedList<String>();
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
		LinkedList<String> copia = new LinkedList<String>(elenco);
		for(String s : elenco) {
    		if(s.equals(parola)) {
    			copia.remove(s);
    		}
    	}
		elenco = copia;
		
	}
	
}