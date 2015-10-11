package mod.microbiology.life.reg;

import java.util.HashMap;
import java.util.Random;

import mod.microbiology.automata.DeterministicStateMachine;
import mod.microbiology.automata.NondeterministicTable;
import mod.microbiology.automata.TransitionTable;
import mod.microbiology.life.IProperty;

public class LifeRegistry {
	
	private static HashMap<String, HashMap<String, IProperty>> reg;
	private static HashMap<String, String> forms;
	
	private static DeterministicStateMachine dsm_forms;
	
	private static HashMap<String, DeterministicStateMachine> machines;
	
	private static HashMap<Integer, Random> rngs;
	
	public LifeRegistry() {
		reg = new HashMap<String, HashMap<String, IProperty>>();
		forms = new HashMap<String, String>();
		rngs = new HashMap<Integer, Random>();
		machines = new HashMap<String, DeterministicStateMachine>();
	}
	
	public String generateForm(int moduleid, String name) {
		String pat = "";
		{
			Random rng;
			if (rngs.containsKey(moduleid)) {
				rng = rngs.get(moduleid);
			} else {
				rng = new Random();
				rng.setSeed(moduleid);
				rngs.put(moduleid, rng);
			}
			while (true) {
				for (int i = 0; i < 9; i++) {
					switch (rng.nextInt(4)) {
					case 0: pat += "A"; break;
					case 1: pat += "B"; break;
					case 2: pat += "C"; break;
					case 3: pat += "D"; break;
					}
				}
				if (!forms.containsKey(pat)) {
					break;
				}
				pat = "";
			}
		}
		forms.put(pat, name);
		return pat;
	}
	
	public String generatePattern(int moduleid,String lifetype, String name, Probability p) {
		String pat = "";
		{
			Random rng = rngs.get(moduleid);
			while (true) {
				for (int i = 0; i < p.getInt(); i++) {
					switch (rng.nextInt(4)) {
					case 0: pat += "A"; break;
					case 1: pat += "B"; break;
					case 2: pat += "C"; break;
					case 3: pat += "D"; break;
					}
				}
				if (!reg.get(lifetype).containsKey(pat)) {
					break;
				}
				pat = "";
			}
		}
		return pat;
	}
	
	public IProperty getProperty(String form, String pat) {
		return reg.get(form).get(pat);
	}
	
	public String getForm(String pat) {
		return forms.get(pat);
	}
	
	public void setupAutomata() {
		TransitionTable tt_1 = new TransitionTable();
		new NondeterministicTable(forms.values().toArray(new String[]{}), tt_1);
		dsm_forms = new DeterministicStateMachine(tt_1);
		for (String s : forms.values()) {
			TransitionTable tt_2 = new TransitionTable();
			new NondeterministicTable(reg.get(s).keySet().toArray(new String[]{}), tt_2);
			DeterministicStateMachine m = new DeterministicStateMachine(tt_2);
			machines.put(s, m);
		}
	}
	
	public String getFormOfDNA(char[] dna) {
		return dsm_forms.match(dna)[0];
	}
	
	public String[] findProperties(String form, char[] dna) {
		return machines.get(form).match(dna);
	}
	
}
