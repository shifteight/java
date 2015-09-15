public class ForLoops {
	public static void main(String[] args) {
		boolean exit = false;
		int idx = 0;
		
		for (System.setProperty("user.sanity", "minimal"); exit==false; 	System.out.println(System.currentTimeMillis())) {
			// do some code
			idx++;
			if (idx == 10) {
				exit = true;
			}
		}
	}
}
