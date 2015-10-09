package mod.microbiology.automata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This is basically the first class you need to initialize when using the DSA (Deterministic State Automaton),
 * except the TransitionTable which must be initialized before.
 * @author KaMiKaZe6424
 *
 */
public class NondeterministicTable {
	
	HashMap<NondeterministicState, NondeterministicState[]> map;
	List<NondeterministicState> l;
	
	/**
	 * This constructor creates a TransitionTable, based on an array of patterns you give it. The the table will later be used to create the DSM (Deterministic State Machine) itself.
	 * @param arr
	 * @param t
	 */
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
