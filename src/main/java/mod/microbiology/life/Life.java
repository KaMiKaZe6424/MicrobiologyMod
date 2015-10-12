package mod.microbiology.life;

import java.util.Collection;

public class Life {
	
	private ILifeType type;
	
	private Collection<IProperty> props;

	public Life(ILifeType lifeType) {
		this.type = lifeType;
	}

	public void setProperties(Collection<IProperty> c) {
		
	}
	
}
