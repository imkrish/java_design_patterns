package structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by imKrish on 10/10/16.
 */
public class Catalog {

    // Flyweight Factory

    private Map<String, Item> items = new HashMap<String, Item>();

    public Item lookup(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}
