package hash;

import players.Person;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        CustomHashMap customHashMap = new CustomHashMap(10);
        customHashMap.put("Peter", "Der ist super");
        customHashMap.put("Hermann", "Der wohnt in Mannheim");
        System.out.println(customHashMap.get("Peter"));

        calculateHashMap("Hallo ich habe Hunger");
    }

    static void calculateHashMap(String word) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(char c : word.toCharArray()){
            if(charMap.containsKey(c)) {
                int alreadySeenAmount = charMap.get(c);
                charMap.put(c,alreadySeenAmount +1);
            } else {
                charMap.put(c,1);
            }
        }
        for(char c : charMap.keySet()){
            System.out.println(c + ": " + charMap.get(c));
        }
    }

}
