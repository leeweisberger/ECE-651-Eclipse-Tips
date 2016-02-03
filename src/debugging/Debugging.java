package debugging;

import java.util.HashMap;
import java.util.Map;

public class Debugging {

	public static void main(String[] args) {
		Debugging d = new Debugging();
		d.bar();
		d.foo(0);
		
	}
	
	private void bar(){
		Map<Integer, String> map = new HashMap<>();
		map.put(5, "five");
		map.put(6, "six");
		map.put(5, "five");
		map.put(8, "eight");

		
		System.out.println(map.size());
	}
	
	private void foo(int check){
		while(check<0){
			System.out.println("Check is Less Than 0!");
			check++;
		}
	}

}
