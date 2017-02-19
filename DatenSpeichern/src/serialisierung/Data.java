package serialisierung;
import java.io.Serializable;

public class Data implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int value;

	public Data(int value) {
		this.value = value;
	}

	public void change() {
		value++;
	}

	public void print() {
		System.out.println("var: " + value);
		System.out.println();
	}
}
