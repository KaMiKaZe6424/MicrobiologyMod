package mod.microbiology.automata;

import java.util.HashMap;

public class DeterministicTable {
	
	private HashMap<State, State[]> map;
	
	public DeterministicTable(TransitionTable tt) {
		map = new HashMap<State, State[]>();
		
	}
	
}
