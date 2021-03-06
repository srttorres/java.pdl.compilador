package es.upm.fi.pdl;

import java.util.HashMap;
import java.util.Map;

public class TablaSimbolos {

	static Map<String,Integer> mapa;
	static int posicion;
	
	public TablaSimbolos() {
		mapa = new HashMap<String,Integer>();
		posicion = 100;
	}
	public int aņadirEntrada (String s) {
		mapa.put(s, posicion);
		posicion++;
		return posicion-1;
	}
	public boolean contieneID(String lexema) {		
		return mapa.containsKey(lexema);
	}
	public int buscaID(String lexema) {
		return mapa.get(lexema);		
	}
}
