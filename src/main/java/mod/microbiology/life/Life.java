package mod.microbiology.life;

import java.util.Collection;

public class Life {
	
	private ILifeType type;
	
	private Collection<IProperty> props;

	public Life(ILifeType lifeType) {
		this.type = lifeType;
	}
	
	public ILifeType getType() {
		return type;
	}

	public void addProperties(Collection<IProperty> p) {
		for (IProperty pr : p) {
			boolean poss = true;
			if (!p.containsAll(pr.getRequired())) {
				poss = false;
			}
			for (IProperty conf : pr.getConflicts()) {
				if (p.contains(conf)) {
					poss = false;
				}
			}
			if (poss) {
				props.add(pr);
			}
		}
	}
	
}
