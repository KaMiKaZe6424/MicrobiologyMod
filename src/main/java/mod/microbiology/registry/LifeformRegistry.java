package mod.microbiology.registry;

import java.util.HashMap;

import mod.microbiology.life.dna.IDNA;
import mod.microbiology.life.form.ILifeForm;

public class LifeformRegistry {
	
	private HashMap<char[], ILifeForm> l;
	
	public LifeformRegistry() {
		l = new HashMap<char[], ILifeForm>();
	}
	
	public ILifeForm find(IDNA dna) {
		return null;
	}
	
}
