package serialisierung;
import java.io.Serializable;

/*
 * Beispielklasse die Objekte erzeugt, welche wir später speichern und einlesen wollen. In diesem Fall speichert das Objekt einen Integer-Wert und verfügt über eine Methode zum Auslesen des Werts und zum verändern des Werts
 */

public class Data implements Serializable 
{

	private static final long serialVersionUID = 1L;
	private int value;

	 // Konstruktor der Klasse Data	
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
