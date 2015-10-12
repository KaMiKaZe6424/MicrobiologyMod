package mod.microbiology.life;

import java.util.Collection;

public interface IProperty {
	
	public String getName();
	
	public Collection<IEffect> getEffects();
	
	public Collection<IProperty> getRequired();
	
	public Collection<IProperty> getConflicts();
	
}
