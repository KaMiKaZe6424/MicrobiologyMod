package mod.microbiology.automata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class DeterministicState {
	
	private String label = "";
	
	private Collection<String> matches = new ArrayList<String>();
	
	private static HashMap<String, DeterministicState> map;
	
	private TransitionTable tt;
	
	public DeterministicState(String label, String ... m) {
		this.label = label;
		for (String m1 : m) {
			matches.add(m1);
		}
	}
	
	public boolean isMatch() {
		return matches.size() > 0;
	}
	
	public Collection<String> getMatches() {
		return matches;
	}
	
	public String getLabel() {
		return label;
	}
	
}
