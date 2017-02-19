package serialisierung;
import java.io.*;

// Die Zeit dient lediglich dazu zu messen wie lange der Vorgang dauert.
public class Save 
{
	public static void main(String[] args) {
		long time = System.nanoTime();
		Data[] data = new Data[1000000]; // Erstellung eines Arrays mit 1.000.000 Plätzen

		for (int i = 0; i < data.length; i++) {
			data[i] = new Data(i);	//Array wird mit 1.000.000 Data-Objekten gefüllt
		}

    save(data);
    System.out.println("Time: " + (System.nanoTime() - time)/(1000*1000*1000.0) + " s");
  }
  
  public static void save(Data[] data) {
	    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test.bin"))) // Erstellung eines neuen ObjectOutputStreams der einen FileOutputStream mit unserer Testdatei übergeben bekommt
	    {
	    	for (Data i : data) { 				// Alternative Schreibweise für eine For-Schleife. "for (Data i : data)" bedeutet: Führe den Code durch für jedes Objekt vom Typ Data. Das Aktuelle Objekt ist in "i" gespeichert.
	    		outputStream.writeObject(i); 	// writeObject(i) schreibt das aktuelle Objekt der Variable "i" in den outputStream, also in unsere Datei.
	      }

	      System.out.println("Serialization erfolgreich");
	      System.out.println();
	    } catch (Exception e) {
	      System.out.println("Serialization fehlgeschlagen");
	      System.out.println();
	    }
	  }
	
}