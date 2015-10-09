package mod.microbiology.automata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * This is a deterministic state. Unlike the nondeterministic state, this has sub states, which declare all possible nondeterministic states the machine can be in.
 * @author KaMiKaZe6424
 *
 */
public class DeterministicState {
	
	private String label = "";
	
	private Collection<String> matches = new ArrayList<String>();
	
	private static HashMap<String, DeterministicState> map;
	
	private TransitionTable tt;
	
	/**
	 * Creates a new deterministic state with label l and a list of matches.
	 * @param label The label.
	 * @param m The list of matches.
	 */
	public DeterministicState(String label, String ... m) {
		this.label = label;
		for (String m1 : m) {
			matches.add(m1);
		}
	}
	
	/**
	 * Returns true if the state has at least on match. False otherwise.
	 * @return
	 */
	public boolean isMatch() {
		return matches.size() > 0;
	}
	
	/**
	 * Gets all matches of this state.
	 * @return
	 */
	public Collection<String> getMatches() {
		return matches;
	}
	
	/**
	 * Gets the label of this state
	 * @return
	 */
	public String getLabel() {
		return label;
	}
	
}
