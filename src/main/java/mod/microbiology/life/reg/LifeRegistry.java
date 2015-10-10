package mod.microbiology.life.reg;

import java.util.HashMap;
import java.util.Random;

import mod.microbiology.life.IProperty;

public class LifeRegistry {
	
	private static HashMap<String, HashMap<String, IProperty>> reg;
	private static HashMap<String, String> forms;
	
	private static HashMap<Integer, Random> rngs;
	
	public LifeRegistry() {
		reg = new HashMap<String, HashMap<String, IProperty>>();
		forms = new HashMap<String, String>();
		rngs = new HashMap<Integer, Random>();
	}
	
	public String generateForm(int moduleid, double prob, String name) {
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
			//Yet to be finished
		}
		forms.put(pat, name);
		reg.put(name, new HashMap<String, IProperty>());
		return pat;
	}
	
}
