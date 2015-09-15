public class Ratio implements Comparable {
	protected int num;
	protected int den;
	public static final Ratio ZERO = new Ratio();
		
	private Ratio() {
		this(0, 1);
	}
	
	public Ratio(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	public boolean equals(Object object) {
		if(object == this) {
			return true;
		} else if (!(object instanceof Ratio)) {
			return false;
		}
		Ratio that = (Ratio)object;
		return (this.num*that.den == that.num*this.den);
	}
	
	public int compareTo(Object object) {
		if(object == this) {
			return 0;
		} else if (!(object instanceof Ratio)) {
			throw new IllegalArgumentException("Ratio type expected");
		}
		Ratio that = (Ratio)object;
		normalize(this);
		normalize(that);
		return (this.num*that.den - that.num*this.den);
	}
	
	public static void normalize(Ratio x) {
		if(x.num == 0) {
			x.den = 1;
		} else if (x.den < 0) {
			x.num *= -1;
			x.den *= -1;
		}
	}
	
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}
	
	public String toString() {
		return String.format("%d/%d", num, den);
	}
	
	public double value() {
		return (double)num/den;
	}
}