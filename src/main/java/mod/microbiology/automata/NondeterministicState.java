package mod.microbiology.automata;

/**
 * A nondeterministic state declares a state the state machine can be in. This simple version of a state can be a normal state or a match-state for a certain pattern.
 * @author KaMiKaZe6424
 *
 */
public class NondeterministicState {
	
	private String label;
	
	private String m = null;

	/**
	 * Creates a new state with label l.
	 * @param label
	 */
	public NondeterministicState(String label) {
		this.label = label;
	}
	
	/**
	 * Gets the label.
	 * @return
	 */
	public String getLabel() {
		return label;
	}
	
	/**
	 * Returns true if the state is a match state, false otherwise.
	 * @return
	 */
	public boolean isMatchState() {
		return m != null;
	}
	
	/**
	 * Gets the match of this state. If the state is no match-state it returns null.
	 * @return
	 */
	public String getMatch() {
		return m;
	}
	
	/**
	 * Sets the match.
	 * @param s
	 */
	public void setMatch(String s) {
		this.m = s;
	}
	
}
