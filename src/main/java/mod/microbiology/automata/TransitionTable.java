package mod.microbiology.automata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TransitionTable {

	private HashMap<NondeterministicState, HashMap<Character, List<NondeterministicState>>> map;
	
	private List<NondeterministicState> l;
	
	private HashMap<String, NondeterministicState> m1 = new HashMap<String, NondeterministicState>();

	public TransitionTable() {
		map = new HashMap<NondeterministicState, HashMap<Character, List<NondeterministicState>>>();
	}

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

	public HashMap<NondeterministicState, HashMap<Character, List<NondeterministicState>>> getMap() {
		return map;
	}
	
	public void setStates(List<NondeterministicState> l) {
		this.l = l;
	}
	
	public List<NondeterministicState> getStates() {
		return l;
	}

	public SortedSet<String> getTargets(String str, char c) {
		SortedSet<String> set = new TreeSet<String>();
		try {
		for (NondeterministicState s : map.get(m1.get(str)).get(c)) {
			set.add(s.getLabel());
		}
		} catch (NullPointerException e) {}
		return set;
	}

	public NondeterministicState getState(String str) {
		return m1.get(str);
	}
}
