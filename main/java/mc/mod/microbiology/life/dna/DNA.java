package mc.mod.microbiology.life.dna;

public class DNA {
	
	private char[] code = new char[8192];
	private final DNAGen gen;
	private boolean gend = false;
	
	public DNA(DNAGen gen) {
		this.gen = gen;
	}
	
	
	public void generate() {
		if (!gend) {
			gend = true;
			gen.generate(code);
		}
	}
	
}
