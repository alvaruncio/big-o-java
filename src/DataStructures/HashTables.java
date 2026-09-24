package DataStructures;

import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args) {
        // Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
        //			   Each key/value pair is known as an Entry
        //			   FAST insertion, look up, deletion of key/value pairs
        // 			   Not ideal for small data sets, great with large data sets

        // hashing = Takes a key and computes an integer (formula will vary based on key & data type)
        //		       In a Hashtable, we use the hash % capacity to calculate an index number

        //			key.hashCode() % capacity = index

        // bucket = an indexed storage location for one or more Entries
        //	            can store multiple Entries in case of a collision (linked similarly a LinkedList)

        // collision = hash function generates the same index for more than one key
        //			less collisions = more efficiency

        // Runtime complexity: Best Case O(1)
        //                                     Worst Case O(n)







        /*
            Hashtable<Integer, String> table = new Hashtable<>(10);
            table.put(100, "Spongebob");
            table.put(123, "Patrick");
            table.put(321, "Sandy");
            table.put(555, "Squidward");
            table.put(777, "Gary");

            //table.remove(232);


            for(Integer key : table.keySet()){
                System.out.println( key.hashCode() % 10 + "\t"+ key + "\t" + table.get(key));
            }
        */


        Hashtable<String, String> table = new Hashtable<>(10);
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        //table.remove(232);


        for(String key : table.keySet()){
            System.out.println( key.hashCode() % 10 + "\t"+ key + "\t" + table.get(key));
        }

        System.out.println(table.get("123"));

        exercise();

    }

    private static void exercise(){
        String[] products = {
                "Laptop",
                "Mouse",
                "Keyboard",
                "Mouse",
                "Monitor",
                "Laptop",
                "Mouse"
        };

        Hashtable<String, Integer> countTable = new Hashtable<>();

        for (int i = 0; i < products.length; i++) {
            String value = products[i];

            if(countTable.containsKey(value)){
                countTable.put(value, countTable.get(value) + 1);
            }else{
                countTable.put(value, 1);
            }
        }


        for(String key: countTable.keySet()){
            System.out.println(key + "\t" + countTable.get(key));
        }
    }
}
