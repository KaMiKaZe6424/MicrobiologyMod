package mc.mod.microbiology.life.dna;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class DNAGen {

	public void generate(char[] code) {
		int index = 0;
		for (int i : code) {
			i = new Random().nextInt(4);
			switch (i) {
			case 0: code[index] = 'A';break;
			case 1: code[index] = 'B';break;
			case 2: code[index] = 'C';break;
			case 3: code[index] = 'D';break;
			}
			System.out.print(code[index]);
			index++;
		}
		
	}

}
