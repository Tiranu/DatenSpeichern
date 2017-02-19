
import java.io.*;

public class Load 
{
	public static void main(String[] args) {
		long time = System.nanoTime();
		Data[] data = load();
		System.out.println("Time: " + (System.nanoTime() - time)/(1000*1000*1000.0) + " s");

		data[0].print();
		data[1000000-1].change();
	}

	private static Data[] load() {
		Data[] data = new Data[1000000];

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.bin"))) {
		for (int i = 0; i < data.length; i++) {
			data[i] = (Data) in.readObject();
		}

		System.out.println("Deserialization erfolgreich");
		System.out.println();
		} catch (Exception e) {
			System.out.println("Deserialization fehlgeschlagen");
			System.out.println();
		}

		return data;
  }
}
