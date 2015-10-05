package mod.microbiology.life.dna;

import java.util.Random;

public class DNA {
	
	private char[] code = new char[8192];
	
	/**
	 * The constructor without any arguments will create a new DNA object with randomly generated code inside.
	 * @author KaMiKaZe6424
	 */
	public DNA() {
		for (char c : code) {
			int i = new Random().nextInt(4);
			switch (i) {
			case 0: c = 'A'; break;
			case 1: c = 'B'; break;
			case 2: c = 'C'; break;
			case 3: c = 'D'; break;
			}
		}
	}
	
}
