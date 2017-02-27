import java.io.*;

	

public class Persistieren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		save("test");
		read("test");
	}

// Die Methode schreibt einen Text (hier: "Zwei Jäger treffen sich..." ) in die Datei welche mit Pfad angegeben wird. Falls die Datei nicht existiert, wird sie überschrieben. Falls nicht wird sie erstellt.
	public static void save(String pfad) {
		Writer fw = null;

		try
		{
		  fw = new FileWriter( pfad );
		  fw.write( "Zwei Jäger treffen sich..." ); // schreiben des Strings in die Datei
		  fw.append( System.getProperty("line.separator") ); // e.g. "\n"
		  fw.write( "Zwei Jäger treffen sich..." );
		}
		catch ( IOException e ) {
		  System.err.println( "Konnte Datei nicht erstellen" );
		}
		finally {
		  if ( fw != null )
		    try { fw.close(); } catch ( IOException e ) { e.printStackTrace(); }
		}
		}
			
// Die Methode liest den Text aus der übergeben Datei ein und gibt ihn auf die Konsole aus. Die Datei wird über "pfad" angegeben.		
	public static void read(String pfad) {
		Reader reader = null;
		try
		{
		  reader = new FileReader( pfad );

		  for ( int c; (c = reader.read()) != -1;)
		  {
			  System.out.print( (char) c );
		  }
		}
		catch ( IOException e ) {
		  System.err.println( "Fehler beim Lesen der Datei aufgetreten!" );
		}
		finally {
		  try { reader.close(); } catch ( Exception e ) { e.printStackTrace(); }
		}	
	}
}