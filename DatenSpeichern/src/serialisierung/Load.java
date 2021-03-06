package serialisierung;

import java.io.*;


/*
 * Klasse zum Laden der binär gespeicherten Objekte. Die Klasse erzeugt in der Main-Methode als Beispiel eine Million "Data"-Objekte anhand der vergangenen Nanosekunden und speichert sie in ein
 * einfaches Array.
 */
public class Load 
{
	
	static String dateipfad = "test.bin";
	public static void main(String[] args) {
		long time = System.nanoTime();
		Data[] data = load();
		System.out.println("Time: " + (System.nanoTime() - time)/(1000*1000*1000.0) + " s");
		
		for(Data i: data)
		{
			i.print();
		}
	}

	// Die Methode gibt ein einfach Array vom Typ "Data" zurück also der Klasse die wir ebenfalls bereits angelegt haben!
	
	private static Data[] load() {
		Data[] data = new Data[1000000]; // Erstellung des Arrays mit der Größe 1.000.000 
 
		try (ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(dateipfad)))  // Erstellung eines neuen ObjectInputStreams der einen FileInputStream mit unserer Testdatei übergeben bekommt
		{
			// für jedes Feld des noch leeren Arrays data wird nun ein data-Objekt aus der Datei test.bin ausgelesen
			for (int i = 0; i < data.length; i++) {
				data[i] = (Data) objectInput.readObject(); // Die Methode readObject() unseres ObjectInputStreams liest ein Data-Objekt aus unserer Datei ein.
			}

		System.out.println("Deserialization war erfolgreich");
		} catch (Exception e) {
			System.out.println("Deserialization ist fehlgeschlagen");
			System.out.println();
		}

		return data;
  }
}
