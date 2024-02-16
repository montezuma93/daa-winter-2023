package hash;

public class CustomHashMap {

    String[] table;

    public CustomHashMap(int size) {
        table = new String[size];
    }

    void put(String key, String value) {
        int index = hash(key);
        table[index] = value;
    }

    String get(String key) {
        int index = hash(key);
        return table[index];
    }

    int hash(String key){
        int sum = 0;
        for(int i =0; i < key.length(); i++) {
            sum = sum + key.charAt(i);
        }
        return sum % table.length;
    }

}
