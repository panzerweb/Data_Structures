package hashtables;

import java.util.*;

public class HashTables {

    public static void main(String[] args) {
        HashTableLinearProbing table = new HashTableLinearProbing(10);
        
        table.put("100", "Minecraft");
        
        table.put("123", "Farlight"); //There will be only one Farlight to be printed
        table.put("123", "Farlight");
        
        table.put("321", "Roblox");
        table.put("555", "NBA2K23");
        table.put("777", "GTA SA");
        
        table.printTable();
        System.out.println("Value for key 123: " + table.get("123"));

    }
    
    
}
class HashTableLinearProbing{
    private int capacity;
    private String[] keys;
    private String[] values;
    
    //Constructor
    public HashTableLinearProbing(int capacity){
        this.capacity = capacity;
        this.keys = new String[capacity];
        this.values = new String[capacity];
    }
    
    //Hash
    private int hash(String key){
        return Math.abs(key.hashCode() % capacity);
    }
    
    //Insert and use Linear Probe
    public void put(String key, String value){
        int index = hash(key);
        while(keys[index] != null){ //This implies that there is collision         
            if(keys[index].equals(key)){ //Checks for duplicate keys, 123 = 123
                values[index] = value;
                return;
            }else{
                index = (index + 1) % capacity; //If collision, use Linear Probing
            }

        }
                    
        keys[index] = key;
        values[index] = value;
    }
    
    //Retrieve and use Linear Probe
    public String get(String key){
        int index = hash(key);
        while(keys[index] != null){
            if(keys[index].equals(key)){
                return values[index];
            }
            index = (index + 1) % capacity;
        }
        return null;
    }
    
    //Print table
    public void printTable(){
        for (int i = 0; i < capacity; i++) {
            System.out.println(i + "\t" + keys[i] + "\t" + values[i]);
        }
    }
    
}
