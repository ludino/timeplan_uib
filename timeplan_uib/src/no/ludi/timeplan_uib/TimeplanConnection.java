package no.ludi.timeplan_uib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TimeplanConnection {

	HashMap<String, Fag> emneListe;
	
	public TimeplanConnection() {
		emneListe = new HashMap<String, Fag>();
		Fag f;
		Long d[] = {1369304100L, 1369908900L, 1370513700L, 1371118500L, 1371723300L, 1372328100L};
		
		f = new Fag("INF240", "http://www.uib.no/emne/INF240", "Forelesning", "Grunnleggjande koder", new ArrayList<Long>(Arrays.asList(d)));
		emneListe.put(f.emne_navn, f);
		
		f = new Fag("INF244", "http://www.uib.no/emne/INF244", "Forelesning", "Grafbasert kodeteori", new ArrayList<Long>(Arrays.asList(d)));
		emneListe.put(f.emne_navn, f);
		
		f = new Fag("INF234", "http://www.uib.no/emne/INF234", "Forelesning", "Algoritmer", new ArrayList<Long>(Arrays.asList(d)));
		emneListe.put(f.emne_navn, f);
		
		f = new Fag("INF247", "http://www.uib.no/emne/INF247", "Forelesning", "Krypto", new ArrayList<Long>(Arrays.asList(d)));
		emneListe.put(f.emne_navn, f);
		
		f = new Fag("MAT220", "http://www.uib.no/emne/MAT220", "Forelesning", "Algebra", new ArrayList<Long>(Arrays.asList(d)));
		emneListe.put(f.emne_navn, f);

	}

	public String[] getEmneList() {
		String ret[] = emneListe.keySet().toArray(new String[0]);
		Arrays.sort(ret);
		return ret;
	}

	public Fag getEmne(String emne_navn) {
		return emneListe.get(emne_navn);
	}

}
