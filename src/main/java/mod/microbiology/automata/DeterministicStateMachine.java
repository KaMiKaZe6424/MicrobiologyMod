package mod.microbiology.automata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.google.common.base.Joiner;

/**
 * This is some sort of search engine for searching patterns in a char[]. The point is, that this state machine
 * only needs to read the char[] once and can find any number of patterns whilst doing so. the only drawback is,
 * that it needs to setup two tables before searching. That takes some time with many patterns, but it only needs to do
 * that once for every set of patterns it gets, and then it can search any char[] for these patterns.
 * @author KaMiKaZe6424
 *
 */
public class DeterministicStateMachine {
	
	private HashMap<String, DeterministicState> map;
	private TransitionTable tt;
	private HashMap<DeterministicState, DeterministicState[]> finalMap;
	
	/**
	 * For creating a new state machine, you need to have a table of possible transitions between states and the states themselves.
	 * For more information about these TransitionTables, lookup their javadoc.
	 * @param tt The transition table with all possible transitions between states inside.
	 */
	public DeterministicStateMachine(TransitionTable tt) {
		this.tt = tt;
		map = new HashMap<String, DeterministicState>();
		finalMap = new HashMap<DeterministicState, DeterministicState[]>();
		List<DeterministicState> l = new ArrayList<DeterministicState>();
		l.add(getState("0"));
		while (l.size() > 0) {
			DeterministicState s = l.remove(0);
			DeterministicState sa = forChar(s, 'A');
			DeterministicState sb = forChar(s, 'B');
			DeterministicState sc = forChar(s, 'C');
			DeterministicState sd = forChar(s, 'D');
			finalMap.put(s, new DeterministicState[]{sa, sb, sc, sd});
			if (!finalMap.containsKey(sa)) {
				l.add(sa);
			}
			if (!finalMap.containsKey(sb)) {
				l.add(sb);
			}
			if (!finalMap.containsKey(sc)) {
				l.add(sc);
			}
			if (!finalMap.containsKey(sd)) {
				l.add(sd);
			}
			
		}
	}
	
	private DeterministicState forChar(DeterministicState s, char c) {
		String[] from = s.getLabel().split(",");
		SortedSet<String> to = new TreeSet<String>();
		SortedSet<String> mat = new TreeSet<String>();
		for (String str : from) {
			SortedSet<String> ls = tt.getTargets(str, c);
			if (ls != null) {
				to.addAll(ls);
			}
		}
		to.add("0");
		for (String str : to) {
			if (tt.getState(str).isMatchState()) {
				mat.add(tt.getState(str).getMatch());
			}
		}
		return getState(Joiner.on(',').join(to), (String[]) mat.toArray(new String[]{}));
	}
	
	private DeterministicState getState(String label, String ... m) {
		if (map.containsKey(label)) {
			return map.get(label);
		} else {
			DeterministicState s = new DeterministicState(label, m);
			map.put(label, s);
			return s;
		}
	}
	
	/**
	 * This method searches a given char[] for all specified patterns.
	 * @param dna The char[] to be search for the patterns
	 * @return
	 */
	public String[] match(char[] dna) {
		DeterministicState cur = map.get("0");
		Set<String> found = new HashSet<String>();
		for (char c : dna) {
			switch (c) {
			case 'A':
				cur = finalMap.get(cur)[0];
				break;
			case 'B':
				cur = finalMap.get(cur)[1];
				break;
			case 'C':
				cur = finalMap.get(cur)[2];
				break;
			case 'D':
				cur = finalMap.get(cur)[3];
				break;
			}
			if (cur.isMatch()) {
				found.addAll(cur.getMatches());
			}
		}
		return found.toArray(new String[]{});
	}
	
	public void printTable() {
		for (DeterministicState s : finalMap.keySet()) {
			String[] arr = new String[]{s.getLabel(), finalMap.get(s)[0].getLabel(), finalMap.get(s)[1].getLabel(), finalMap.get(s)[2].getLabel(), finalMap.get(s)[3].getLabel()};
			for (String str : arr) {
				System.out.print(str + "\t");
			}
			System.out.println();
		}
	}
	
}
