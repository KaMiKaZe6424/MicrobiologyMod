package mod.microbiology.life.reg;

public enum Probability {
	
	CERTAIN(6),
	PROBABLE(7),
	FIFTYFIFTY(8),
	IMPROBABLE(9),
	RARE(10);
	
	private int i;
	
	Probability(int i) {
		this.i = i;
	}
	
	public int getInt() {
		return i;
	}
	
}
