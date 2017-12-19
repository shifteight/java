public class FloatTest {
    public static void main(String[] args) {
        float f = 100.0f;
	float MAX = 0.001f;
	float MIN = -MAX;

        System.out.print(String.valueOf(f));

        if ((f < MAX) && (f > MIN)) {
            System.out.println(" is pretty darn close to 0.");
        } else {
            System.out.println(" is not close to 0.");
        }
    }
}
