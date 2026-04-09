package dsa.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private final int capacity;
    public LRUCache(int capacity){
        // the 'true' at the end is the magic ingredient
        //It tell the map to order items by access time
        //not insertion time
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }
    //This is a built in method in LinkedHashMap
    //We override it to tell Java exactly when to start
    //kicking old items out
    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        //If the size gets bigger than our capacity,return true
        //(Kick the oldest out)
        return size() > capacity;
    }
    public static void main(String[] args){
        //Lets build our 3-pair shoe rack
        LRUCache<String,String> shoeRack=new LRUCache<>(3);
        shoeRack.put("Monday","Sneakers");
        shoeRack.put("Tuesday","Boots");
        shoeRack.put("Wednesday","Sandals");
        System.out.println("Rack Contents: "+shoeRack);
        //Now lets say we access the "Sneakers" again on Thursday
        //This makes Sneakers the MOST recently used
        shoeRack.get("Monday");
        System.out.println("Rack contents: "+shoeRack);

        //We buy a new loafers and try to put them on the rack
        shoeRack.put("Thursday","Loafers");
        //Lets see what got kicked out
        System.out.println("Rack contents after buying loafers: "+shoeRack);
        //We notice tht boots have been kicked out
        //because Sneakers were just accessed.
    }
}
