package refactoring;

public class Refactoring {
	private int badlyNamedInteger = 5;
	
	public static void main(String[] args) {
		Refactoring r = new Refactoring();
		r.foo();
	}

	private void foo() {
		System.out.println(badlyNamedInteger);
		
		System.out.println(7);
		
		int numTimes = 7+2;
		String message1="hi";
		String message2="bye";
		
		for(int i=0; i<numTimes; i++){
			System.out.println(message1);
		}
		
		for(int i=0; i<numTimes; i++){
			System.out.println(message2);
		}
	}
	
	public int bar() {
		return 3;
	}
}
