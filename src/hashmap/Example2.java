package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {

        //Declara un hashmap cu urmatoarele valorii: Superman = true, Batman = true, Spiderman = true, Mircea = false, Alex = false;
        //Afiseaza la consola numai supereroi

        HashMap<String, Boolean> stringBooleanHashMap = new HashMap<>();
        stringBooleanHashMap.put("Superman", true);
        stringBooleanHashMap.put("Batman", true);
        stringBooleanHashMap.put("Spiderman", true);
        stringBooleanHashMap.put("Mircea", false);
        stringBooleanHashMap.put("Alex", false);

        for (Map.Entry<String, Boolean> pairs : stringBooleanHashMap.entrySet()) {
            if (pairs.getValue()) {
                System.out.println(pairs.getKey());
            }
        }
    }
}
