import java.io.*;

public class Save 
{
	public static void main(String[] args) {
		long time = System.nanoTime();
		Data[] data = new Data[1000000];

		for (int i = 0; i < data.length; i++) {
			data[i] = new Data(i);
		}

    save(data);
    System.out.println("Time: " + (System.nanoTime() - time)/(1000*1000*1000.0) + " s");
  }
  
  public static void save(Data[] data) {
	    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.bin"))) {
	      for (Data i : data) {
	        out.writeObject(i);
	      }

	      System.out.println("Serialization erfolgreich");
	      System.out.println();
	    } catch (Exception e) {
	      System.out.println("Serialization fehlgeschlagen");
	      System.out.println();
	    }
	  }
	
}