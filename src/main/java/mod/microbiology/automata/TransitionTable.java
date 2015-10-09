package mod.microbiology.automata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * A TransitionTable is a table, which displays all nondeterministic states, a state machine can be in, and all possible transitions between two of them.
 * @author KaMiKaZe6424
 *
 */
public class TransitionTable {

	private HashMap<NondeterministicState, HashMap<Character, List<NondeterministicState>>> map;
	
	private List<NondeterministicState> l;
	
	private HashMap<String, NondeterministicState> m1 = new HashMap<String, NondeterministicState>();
	
	
	/**
	 * Constructor of the TransitionTable class.
	 */
	public TransitionTable() {
		map = new HashMap<NondeterministicState, HashMap<Character, List<NondeterministicState>>>();
	}
	
	/**
	 * Put transitions from one nondeterministic state to another via a character into the table.
	 * @param from The state the machine currently is in.
	 * @param c A input character to specify a path.
	 * @param to The state the machine is in after that path.
	 */
	public void put(NondeterministicState from, char c, NondeterministicState to) {
		if (map.containsKey(from)) {
			if (map.get(from).containsKey(c)) {
				map.get(from).get(c).add(to);
			} else {
				map.get(from).put(c, new ArrayList<NondeterministicState>());
				map.get(from).get(c).add(to);
			}
		} else {
			map.put(from, new HashMap<Character, List<NondeterministicState>>());
			map.get(from).put(c, new ArrayList<NondeterministicState>());
			map.get(from).get(c).add(to);
		}
		if (!m1.containsKey(from.getLabel())) {m1.put(from.getLabel(), from);}
		if (!m1.containsKey(to.getLabel())) {m1.put(to.getLabel(), to);}
	}
	
	/**
	 * Prints the table to the output stream. Meant for debugging purposes.
	 */
	public void printTable() {
		for (NondeterministicState f : map.keySet()) {
			for (char c : map.get(f).keySet()) {
				System.out.print(f.getLabel() + "\t" + c + "\t");
				for (NondeterministicState s : map.get(f).get(c)) {
					System.out.print(s.getLabel() + ", ");
				}
				System.out.println();
			}
		}
	}
	
	/**
	 * Gets the map. Not recommended to be used by others.
	 * @return
	 */
	public HashMap<NondeterministicState, HashMap<Character, List<NondeterministicState>>> getMap() {
		return map;
	}
	
	/**
	 * Sets a list of all known nondeterministic states. Will function properly if left alone.
	 * @param l
	 */
	public void setStates(List<NondeterministicState> l) {
		this.l = l;
	}
	
	/**
	 * Gets the list of all known states. Not really necessary for anyone except the state machine.
	 * @return
	 */
	public List<NondeterministicState> getStates() {
		return l;
	}
	
	/**
	 * Gets a list of all states the machine can be in, when a certain input character arrives on a certain state. Used by the state machine.
	 * @param str
	 * @param c
	 * @return
	 */
	public SortedSet<String> getTargets(String str, char c) {
		SortedSet<String> set = new TreeSet<String>();
		try {
		for (NondeterministicState s : map.get(m1.get(str)).get(c)) {
			set.add(s.getLabel());
		}
		} catch (NullPointerException e) {}
		return set;
	}
	
	/**
	 * Gets the state with the label l.
	 * @param str The label l to be looked for.
	 * @return The state with that label l.
	 */
	public NondeterministicState getState(String str) {
		return m1.get(str);
	}
}
