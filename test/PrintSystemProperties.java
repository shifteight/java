import java.util.*;

public class PrintSystemProperties {
	public static void main(String[] args) {
		Properties props = System.getProperties();
		for (Iterator iter = props.keySet().iterator(); iter.hasNext();) {
			String key = (String)iter.next();
			System.out.println(key + "=" + System.getProperty(key));
		}
	}
}