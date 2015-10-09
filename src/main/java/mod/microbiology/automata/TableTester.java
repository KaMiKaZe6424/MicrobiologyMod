package mod.microbiology.automata;

public class TableTester {
	
	public static void main(String[] args) {
		new TableTester();
	}
	
	String[] s = new String[]{
			"AACB",
			"ACBD"
	};
	
	TransitionTable tt = new TransitionTable();
	
	public TableTester() {
		NondeterministicTable t = new NondeterministicTable(s, tt);
		DeterministicStateMachine dsm = new DeterministicStateMachine(tt);
		String[] m = dsm.match("ABCDCDCABCDBABCDCADBCADACBDCBCBCBCCBCB".toCharArray());
		for (String s : m) {
			System.out.println("Found " + s + "!");
		}
	}
	
}
