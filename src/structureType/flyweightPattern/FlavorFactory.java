package structureType.flyweightPattern;

import java.util.Hashtable;

public class FlavorFactory {
	
	private Hashtable<String, Flavor> flavors = new Hashtable<String,Flavor>();

	public Order GetOrder(String key) {
		if (!flavors.containsKey(key))
			flavors.put(key, new Flavor(key));
		return ((Order)flavors.get(key));
	}

	public int GetTotalFlavorsMade() {
		return flavors.size();
	}
}
