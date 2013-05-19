package no.ludi.timeplan_uib;

import java.util.Arrays;

public class TimeplanConnection {

	public TimeplanConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public String[] getEmneList() {
		String ret[] = {"INF240", "INF348", "INF234"};
		Arrays.sort(ret);
		return ret;
	}
	
	public String[] getItemList(String emne) {
		String ret[] = {"NŒ!", "I dag", "I morgen", "senere", "senere", "senere", "senere", "senere", "senere", "senere", "senere"};
		return ret;
	}
	
}
