package mod.microbiology.life;

import java.util.ArrayList;
import java.util.Collection;

import mod.microbiology.life.dna.DNA;
import mod.microbiology.life.dna.IDNA;
import mod.microbiology.life.reg.LifeRegistry;

public class LifeGenerator {

	@SuppressWarnings("unused")
	public Collection<Life> genLife(int times) {
		Collection<Life> c = new ArrayList<Life>();
		{
			IDNA[] dnas = new IDNA[times];
			int i = 0;
			for (IDNA dna : dnas) {
				dnas[i] = new DNA();
				{
					String type = LifeRegistry.getFormOfDNA(dnas[i].getCode());
					String[] pats = LifeRegistry.findProperties(type, dnas[i].getCode());
					Life l = new Life(LifeRegistry.getLifeType(type));
					Collection<IProperty> coll = new ArrayList<IProperty>();
					for (String pat : pats) {
						coll.add(LifeRegistry.getProperty(type, pat));
					}
					l.addProperties(coll);
					
				}
			}
		}
		return c;
	}
	
}
