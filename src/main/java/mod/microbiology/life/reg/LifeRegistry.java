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
	
}
