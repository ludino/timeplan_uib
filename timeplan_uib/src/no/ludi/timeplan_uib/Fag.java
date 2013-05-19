package no.ludi.timeplan_uib;

import java.util.ArrayList;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Fag {
	public String emne_navn; 		// INF234
	public String url; 				// To is er bedre enn en
	public String description;		// Forelesning
	public String activity;			// Algoritmer
	public ArrayList<Long> dates;	// array of unix TS

	public Fag(String emne_navn, 
			String url, 
			String description, 
			String activity, 
			ArrayList<Long> dates) {
		this.emne_navn = emne_navn;
		this.url = url;
		this.description = description;
		this.activity = activity;
		this.dates = dates;
	}
	
	public void getViews() {
		
	}

	public void draw(LinearLayout itemList, Context ctx) {
		for (Long l : dates) {
			TextView tv = new TextView(ctx);
			tv.setText(l.toString() + " " + emne_navn);
			itemList.addView(tv);
		}
	}
}
