    import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
    public class Hashmap {

        public static void main(String args[]) {

            HashMap<Integer, String> hmap = new HashMap<Integer, String>();

            hmap.put(12, "Chaitanya");
            hmap.put(2, "Rahul");
            hmap.put(7, "Singh");
            hmap.put(49, "Ajeet");
            hmap.put(3, "Anuj");

            Set set = hmap.entrySet();
            Iterator iterator = set.iterator();
            while(iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry)iterator.next();
                System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
                System.out.println(mentry.getValue());
            }

            String var= hmap.get(2);
            System.out.println("Value at index 2 is: "+var);

            hmap.remove(3);
            System.out.println("Map key and values after removal:");
            Set set2 = hmap.entrySet();
            Iterator iterator2 = set2.iterator();
            while(iterator2.hasNext()) {
                Map.Entry mentry2 = (Map.Entry)iterator2.next();
                System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
                System.out.println(mentry2.getValue());
            }
            System.out.println("the size is: "+hmap.size());
            System.out.println("the hashmap is empty: "+hmap.isEmpty());
            System.out.println("Value at for key 12 is: "+hmap.get(12));
            System.out.println("map contain the key 12: "+hmap.containsKey(12));
            System.out.println("map contain the key 10: "+hmap.containsKey(10));
            hmap.put(10,"Anjaly");
            System.out.println("the size is: "+hmap.size());
            System.out.println("map contain the key 10: "+hmap.containsKey(10));
            System.out.println("map contain the value Anjaly: "+hmap.containsValue("Anjaly"));
            System.out.println("the keys are: "+hmap.keySet());
            System.out.println("the values are: "+hmap.values());
        }
    }

