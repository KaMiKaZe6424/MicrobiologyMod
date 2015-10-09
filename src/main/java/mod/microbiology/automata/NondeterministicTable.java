package mod.microbiology.automata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NondeterministicTable {
	
	HashMap<NondeterministicState, NondeterministicState[]> map;
	List<NondeterministicState> l;
	
	public NondeterministicTable(String[] arr, TransitionTable t) {
		HashMap<NondeterministicState, NondeterministicState[]> m = new HashMap<NondeterministicState, NondeterministicState[]>();
		l = new ArrayList<NondeterministicState>();
		l.add(new NondeterministicState("0"));
		for (String s : arr) {
			NondeterministicState from = l.get(0);
			for (char c : s.toCharArray()) {
				NondeterministicState to = new NondeterministicState(String.valueOf(l.size()));
				l.add(to);
				t.put(from, c, to);
				from = to;
			}
			from.setMatch(s);
		}
		t.setStates(l);
	}
	
}
