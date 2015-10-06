package mod.microbiology.life.dna;

import java.util.Random;

/**
 * This class defines the DNA string each organism has, it will be read by a DNAReader and then be deserialized into a lifeform.
 * @author KaMiKaZe6424
 *
 */
public class DNA {
	
	private char[] code = new char[8192];
	
	/**
	 * The constructor without any arguments will create a new DNA object with randomly generated code inside.
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
	
	/**
	 * This constructor creates a new DNA object with a dna code which is given to it as an argument. It is only visible frmo inside the dna package.
	 * @param code
	 */
	DNA(char[] code) {
		this.code = code;
	}
	
	/**
	 * This is the character-array full of the caracters A,B,C and D, ready to be interpreted.
	 * @return The dna code of this DNA object.
	 */
	public char[] getCode() {
		return code;
	}
	
}
