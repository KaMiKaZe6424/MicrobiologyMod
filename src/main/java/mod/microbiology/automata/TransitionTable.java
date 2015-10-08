package mod.microbiology.automata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TransitionTable {
	
	private HashMap<State, HashMap<Character, List<State>>> map;
	
	public TransitionTable() {
		map = new HashMap<State, HashMap<Character, List<State>>>();
	}
	
	public void put(State from, char c, State to) {
		if (map.containsKey(from)) {
			if (map.get(from).containsKey(c)) {
				map.get(from).get(c).add(to);
			} else {
				map.get(from).put(c, new ArrayList<State>());
				map.get(from).get(c).add(to);
			}
		} else {
			map.put(from, new HashMap<Character, List<State>>());
			map.get(from).put(c, new ArrayList<State>());
			map.get(from).get(c).add(to);
		}
	}
	
	public void printTable() {
		for (State f : map.keySet()) {
			for (char c : map.get(f).keySet()) {
				System.out.print(f.getLabel() + "\t" + c + "\t");
				for (State s : map.get(f).get(c)) {
					System.out.print(s.getLabel() + ", ");
				}
				System.out.println();
			}
		}
	}
}
