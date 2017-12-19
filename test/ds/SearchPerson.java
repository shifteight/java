import java.io.*;

public class SearchPerson {
	public static Person searchFileSequentially(String fileName, String desiredName) {
		BufferedReader ifStream = null;
		
		try {
			ifStream = new BufferedReader(new FileReader(fileName));
			String nextName = null;
			String nextSalary = null;
			
			boolean found = false;
			while(!found && (nextName = ifStream.readLine()) != null) {
				nextSalary = ifStream.readLine();
				if(nextName.compareTo(desiredName) == 0) {
					found = true;
				}
			}
			
			if(found) {
				return new Person(nextName, Double.parseDouble(nextSalary));
			}
			else {
				return null;
			}
		} catch (IOException e) {
			System.out.println("Error processing file");
			return null;
		} finally {
			if(ifStream != null) {
				try {
					ifStream.close();
				} catch(IOException e) {
					System.out.println("Error closing file");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// main method
		Person foundPerson = searchFileSequentially("salaries.txt", "Kevin");
		System.out.println("The salary of " + foundPerson.getName() + " is " + foundPerson.getSalary());
	}
}