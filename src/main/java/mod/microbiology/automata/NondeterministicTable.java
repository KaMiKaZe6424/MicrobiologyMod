package mod.microbiology.automata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NondeterministicTable {
	
	HashMap<State, State[]> map;
	
	public NondeterministicTable(String[] arr, TransitionTable t) {
		HashMap<State, State[]> m = new HashMap<State, State[]>();
		List<State> l = new ArrayList<State>();
		l.add(new State("0"));
		for (String s : arr) {
			State from = l.get(0);
			for (char c : s.toCharArray()) {
				State to = new State(String.valueOf(l.size()));
				l.add(to);
				t.put(from, c, to);
				from = to;
			}
			from.setMatch(s);
		}
	}
	
}
