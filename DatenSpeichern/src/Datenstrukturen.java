import java.util.HashMap;
import java.util.Collection;

public class Datenstrukturen {

	
	static HashMap<String,String> glossar = new HashMap<String, String>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fuellen("Set","Eine Menge von Elementen ohne Ordnung");
		fuellen("Map","Eine Zuordnung von Key und Value zu einem Paar");
		fuellen("Array","Eine Liste mit fester Reihenfolge");
		auslesen("Map");
	}
	
	
	static void fuellen(String key, String value)
	{
		glossar.put(key, value);
	}
	
	static String auslesen(String key)
	{
		String value;
		
		value = glossar.get(key);
		
		return value;
	}
}
