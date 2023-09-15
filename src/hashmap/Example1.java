package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("George", "07234567");
        phoneBook.put("Alex", "07234569");
        phoneBook.put("Maria", "07234568");
        phoneBook.put("Ioana", "07234563");
        phoneBook.put("Vlad", "07234565");
        //phoneBook.put("Vlad", "07234565");

        System.out.println(phoneBook);
        System.out.println("Numarul Mariei este: "+phoneBook.get("Maria"));

        for (String i:phoneBook.keySet()) {
            System.out.println(i);
        }

        for(String i: phoneBook.values()){
            System.out.println(i);
        }

        for (String i:phoneBook.keySet()) {
            System.out.println("Key: "+i+", Value: "+phoneBook.get(i));
        }

        System.out.println("------");
        phoneBook.remove("Alex");
        for(Map.Entry<String, String> pair: phoneBook.entrySet()){
            System.out.println(pair);
        }



            Map<String, String> cities = new HashMap<>(){{
            put("Romania", "Bucuresti");
            put("Italia", "Roma");
            put("Germania", "Berlin");
        }};

        System.out.println(cities);
    }
}
