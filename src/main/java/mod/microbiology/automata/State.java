package mod.microbiology.automata;

public class State {
	
	private String label;
	
	private String m = null;

	public State(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public boolean isMatchState() {
		return m != null;
	}
	
	public void setMatch(String s) {
		this.m = s;
	}
	
}
