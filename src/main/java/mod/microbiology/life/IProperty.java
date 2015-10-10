package mod.microbiology.life;

import net.minecraft.entity.Entity;

public interface IProperty {
	
	public String getName();
	
	public void applyTo(Entity e);
	
}
