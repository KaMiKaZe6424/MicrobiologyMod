package mod.microbiology.automata;

public class NondeterministicState {
	
	private String label;
	
	private String m = null;

	public NondeterministicState(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public boolean isMatchState() {
		return m != null;
	}
	
	public String getMatch() {
		return m;
	}
	
	public void setMatch(String s) {
		this.m = s;
	}
	
}
